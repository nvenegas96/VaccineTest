package com.test.vaccine.controller;

import com.test.vaccine.model.CitizensEntity;
import com.test.vaccine.model.dto.CitizenResponseDTO;
import com.test.vaccine.service.CitizensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/citizens")
public class CitizensController {

    @Autowired
    private CitizensService citizensService;

    @PostMapping()
    public ResponseEntity<CitizensEntity> createCitizenz(@RequestBody CitizensEntity citizensEntity) {
        return ResponseEntity.ok().body(citizensService.createCitizens(citizensEntity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CitizenResponseDTO> getCitizen (@PathVariable("id") int citizenId) {
        return ResponseEntity.ok().body(citizensService.getCitizen(citizenId));
    }



}
