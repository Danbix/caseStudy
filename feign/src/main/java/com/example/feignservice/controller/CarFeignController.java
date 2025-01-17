package com.example.feignservice.controller;

import com.example.feignservice.proxy.VoitureProxy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feign")
public class CarFeignController {

    private final VoitureProxy voitureProxy;

    public CarFeignController(VoitureProxy voitureProxy) {
        this.voitureProxy = voitureProxy;
    }

    @GetMapping("/{clientId}")
    public String getVoitureInfo(@PathVariable String clientId) {
        // On appelle directement le proxy Feign (qui utilise Eureka)
        return voitureProxy.getVoiture(clientId);
    }
}
