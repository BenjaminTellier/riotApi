package com.api.riot.entities;

import lombok.AllArgsConstructor;

public enum RegionalRouting {
    AMERICAS("americas.api.riotgames.com"),
    ASIA("asia.api.riotgames.com"),
    EUROPE("europe.api.riotgames.com"),
    SEA("sea.api.riotgames.com");

    final String hostname;

    RegionalRouting(String hostname) {
        this.hostname = "https://"+hostname;
    }


}
