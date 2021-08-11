package com.test.vaccine.service;

import com.test.vaccine.model.VaccineEntity;
import com.test.vaccine.model.dto.VaccinationResponseDTO;

import java.util.List;

public interface VaccineService {

    VaccineEntity createVaccination (VaccineEntity vaccineEntity);

    List<VaccinationResponseDTO> buildVaccinationResponse (int citizenId);
}
