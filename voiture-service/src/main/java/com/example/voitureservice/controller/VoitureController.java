package com.example.voitureservice.controller;

import com.example.voitureservice.dto.VoitureDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voitures")  // <-- changer ici
public class VoitureController {

    @GetMapping("/{clientId}")
    public ResponseEntity<VoitureDto> getVoiture(@PathVariable String clientId) {
        VoitureDto voiture = new VoitureDto(
                "Megane 4 GT-Line",
                "Diesel",
                2021,
                clientId
        );
        return ResponseEntity.ok(voiture);
    }
}
