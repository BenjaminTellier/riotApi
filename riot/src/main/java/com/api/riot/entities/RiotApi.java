package com.api.riot.entities;

import jakarta.persistence.Entity;
import jakarta.websocket.Endpoint;
import lombok.Builder;
import lombok.Data;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@Builder
public class RiotApi {

    private ApiConfig apiConfig;
    private Set<EndPoint> functions;

    public RiotApi(ApiConfig apiConfig) {
        this.apiConfig = apiConfig;
        functions.add(EndPoint.ACCOUNT_BY_PUUID);
        functions.add(EndPoint.ACCOUNT_BY_GAMENAME_TAGLINE);
    }

    public HttpResponse<String> getPUUIDByTagName(String gameName, String tag) {
        Objects.requireNonNull(apiConfig);

        HashMap<String, String> map = new HashMap();
        map.put("gameName", gameName);
        map.put("tagLine", tag);
        String temporaryEndPoint = EndPoint.ACCOUNT_BY_GAMENAME_TAGLINE.getEndPoint();
        String endPoint = Tools.changeEndPoint(temporaryEndPoint, map);
        URI uri =UriComponentsBuilder.fromUriString(apiConfig.getRegionalRouting().hostname+endPoint).queryParam("api_key", apiConfig.getKey()).build().toUri();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("X-RapidAPI-Host", String.valueOf(apiConfig.getRegionalRouting().hostname))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;

        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return response;
    }
}
