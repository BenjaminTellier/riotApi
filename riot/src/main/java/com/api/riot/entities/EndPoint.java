package com.api.riot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Getter
public enum EndPoint {
    ACCOUNT_BY_PUUID("/riot/account/v1/accounts/by-puuid/{puuid}"),
    ACCOUNT_BY_GAMENAME_TAGLINE("/riot/account/v1/accounts/by-riot-id/{gameName}/{tagLine}"),
    MATCH_HISTORY_BY_PUUID("/lol/match/v5/by-puuid/{puuid}/ids"),
    MATCH_BY_MATCH_ID("/lol/match/v5/matches/{matchId}");

    final String endPoint;

}
