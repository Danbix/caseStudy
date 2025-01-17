package com.example.restservice.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class CarRestController {
    private final RestTemplate restTemplate;

    public CarRestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{clientId}")
    public String getVoitureInfo(@PathVariable String clientId) {
        String url = "http://VOITURE-SERVICE/voitures/" + clientId;
        return restTemplate.getForObject(url, String.class);
    }
}

