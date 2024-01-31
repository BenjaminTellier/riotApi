import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String... args) {
        String api_key = "RGAPI-9fcc3303-8795-47b7-b468-ef48704de1a3";
        String uri = "https://developer.riotgames.com/";
        String platform_host = "euw1.api.riotgames.com";
        String regional_host = "europe.api.riotgames.com";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri+ "/riot/account/v1/accounts/by-riot-id/CPT+Futeyy/EUW"))
                .header("X-RapidAPI-Host", platform_host)
                .header("X-RapidAPI-Key", api_key)
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
        System.out.println(response.body());

    }
}
