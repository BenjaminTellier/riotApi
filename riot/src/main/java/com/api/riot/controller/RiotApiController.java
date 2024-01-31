package com.api.riot.controller;

import com.api.riot.service.RiotApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/riot/")
public class RiotApiController {

    RiotApiService riotApiService;


}
