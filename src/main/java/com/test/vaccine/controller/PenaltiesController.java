package com.test.vaccine.controller;

import com.test.vaccine.model.PenaltyEntity;
import com.test.vaccine.service.PenaltyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/penalties")
public class PenaltiesController {

    @Autowired
    private PenaltyService penaltyService;

    @PostMapping
    public ResponseEntity<PenaltyEntity> createPenalty (@RequestBody PenaltyEntity penaltyEntity) {
        PenaltyEntity penaltyEntity1 = penaltyService.createPenalty(penaltyEntity);
        if (penaltyEntity1 == null) {
            return ResponseEntity.status(404).body(null);
        }
        return ResponseEntity.ok().body(penaltyEntity1);
    }
}
