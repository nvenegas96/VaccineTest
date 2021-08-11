package com.test.vaccine.service;

import com.test.vaccine.model.CitizensEntity;
import com.test.vaccine.model.dto.CitizenResponseDTO;

public interface CitizensService {

    CitizensEntity createCitizens ( CitizensEntity citizensEntity);

    CitizenResponseDTO getCitizen(int citizenId);
}
