package com.example.feignservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "VOITURE-SERVICE")
public interface VoitureProxy {

    @GetMapping("/voitures/{clientId}")
    String getVoiture(@PathVariable("clientId") String clientId);
}
