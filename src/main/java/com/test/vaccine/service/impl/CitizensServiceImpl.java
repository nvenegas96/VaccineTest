package com.test.vaccine.service.impl;

import com.test.vaccine.data.CitizensData;
import com.test.vaccine.data.VaccineData;
import com.test.vaccine.model.CitizensEntity;
import com.test.vaccine.model.VaccineEntity;
import com.test.vaccine.model.dto.CitizenResponseDTO;
import com.test.vaccine.model.dto.VaccinationResponseDTO;
import com.test.vaccine.service.CitizensService;
import com.test.vaccine.service.PenaltyService;
import com.test.vaccine.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CitizensServiceImpl implements CitizensService {

    @Autowired
    private VaccineService vaccineService;

    @Autowired
    private PenaltyService penaltyService;

    @Override
    public CitizensEntity createCitizens(CitizensEntity citizensEntity) {
        citizensEntity.setCitizenId(CitizensData.getLastId());
        CitizensData.add(citizensEntity);
        return citizensEntity;
    }

    @Override
    public CitizenResponseDTO getCitizen(int citizenId) {
        CitizensEntity citizensEntity = CitizensData.searchById(citizenId);

        if (citizensEntity == null) {
            return null;
        }

        return buildCitizenResponse(citizensEntity);
    }

    private CitizenResponseDTO buildCitizenResponse(CitizensEntity citizensEntity) {
        CitizenResponseDTO citizenResponseDTO = new CitizenResponseDTO(citizensEntity);
        citizenResponseDTO.setVaccination(vaccineService.buildVaccinationResponse(citizensEntity.getCitizenId()));
        citizenResponseDTO.setVaccinated(citizenResponseDTO.getVaccination() != null);
        citizenResponseDTO.setPenalty(penaltyService.buildPenaltyResponse(citizensEntity.getCitizenId()));
        return citizenResponseDTO;
    }

}
