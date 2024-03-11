package com.api.riot.controller;

import com.api.riot.service.RiotApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequiredArgsConstructor
public class RiotApiController {

//    RiotApiService riotApiService;

//    @GetMapping("/endPoint/{endPoint}")
//    public ResponseEntity<String> callApi(@RequestParam String endPoint) {
//        try {
//            return ResponseEntity.ok(riotApiService.callApi(endPoint));
//        } catch (Exception exception) {
//            return ResponseEntity.badRequest().build();
//        }
//    }

    @GetMapping("/test")
    @ResponseBody
    public String test(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model)
    {
        model.addAttribute("name", name);
        System.err.println("displayHome");
        return "test";
    }
}
