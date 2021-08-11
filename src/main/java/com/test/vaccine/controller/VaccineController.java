package com.test.vaccine.controller;

import com.test.vaccine.model.PenaltyEntity;
import com.test.vaccine.model.VaccineEntity;
import com.test.vaccine.service.PenaltyService;
import com.test.vaccine.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vaccines")
public class VaccineController {

    @Autowired
    private VaccineService vaccineService;

    @PostMapping
    public ResponseEntity<VaccineEntity> createPenalty (@RequestBody VaccineEntity vaccineEntity) {
        VaccineEntity vaccineEntity1 = vaccineService.createVaccination(vaccineEntity);
        if (vaccineEntity1 == null) {
            return ResponseEntity.status(404).body(null);
        }
        return ResponseEntity.ok().body(vaccineEntity1);
    }
}
