package com.api.riot;

import com.api.riot.entities.ApiConfig;
import com.api.riot.entities.RegionalRouting;
import com.api.riot.entities.RiotApi;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RiotApplication {

	public static void main(String... args) {
		String apiKey = "RGAPI-9fcc3303-8795-47b7-b468-ef48704de1a3";
		ApiConfig apiConfig = ApiConfig.builder().key(apiKey).regionalRouting(RegionalRouting.EUROPE).build();
		RiotApi riotApi = RiotApi.builder().apiConfig(apiConfig).build();

		System.out.println(riotApi.getPUUIDByTagName("CPT Futeyy", "EUW"));
		System.out.println(apiConfig.getKey());
	}

}
