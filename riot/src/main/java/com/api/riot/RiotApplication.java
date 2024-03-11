package com.api.riot;

import com.api.riot.entities.ApiConfig;
import com.api.riot.entities.RegionalRouting;
import com.api.riot.entities.RiotApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RiotApplication {

	public static void main(String... args) {
//		String apiKey = "RGAPI-53f0802b-111f-426f-b973-33f74d3e545d";
//		ApiConfig apiConfig = ApiConfig.builder().key(apiKey).regionalRouting(RegionalRouting.EUROPE).build();
//		RiotApi riotApi = new RiotApi(apiConfig);
//
//		System.out.println(riotApi.getPUUIDByTagName("CPT Futeyy", "EUW").body().toString());
//
//		String uglyString = riotApi.getMatchByMatchId("EUW1_"+"6804585507").body().toString();
////		//System.out.println(riotApi.getMatchByMatchId("EUW1_"+"6804585507").body().toString());
//		ObjectMapper objectMapper = new ObjectMapper();
//		try {
//			Object jsonObject = objectMapper.readValue(uglyString, Object.class);
//			String prettyJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);
//			System.out.println(prettyJson);
//		} catch (Exception exception) {
//			System.err.println(exception.getMessage());
//		}
		// SpringApplication.run(RiotApplication.class, args);
	}

}