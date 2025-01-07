package com.example.webclientservice.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webclient")
public class CarWebClientController {

    private final WebClient webClient;

    public CarWebClientController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/{clientId}")
    public Mono<String> getVoitureInfo(@PathVariable String clientId) {
        return webClient
                .get()
                .uri("http://VOITURE-SERVICE/voitures/{clientId}", clientId)
                .retrieve()
                .bodyToMono(String.class);
    }
}
