package com.test.vaccine.service.impl;

import com.test.vaccine.data.CitizensData;
import com.test.vaccine.data.VaccineData;
import com.test.vaccine.model.VaccineEntity;
import com.test.vaccine.model.dto.VaccinationResponseDTO;
import com.test.vaccine.service.VaccineService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class VaccineServiceImpl implements VaccineService {


    @Override
    public VaccineEntity createVaccination(VaccineEntity vaccineEntity) {
        if (CitizensData.searchById(vaccineEntity.getCitizenId()) == null) {
            return null;
        }
        vaccineEntity.setVaccineId(VaccineData.getLastId());
        vaccineEntity.setDate(new Date());
        VaccineData.add(vaccineEntity);
        return vaccineEntity;
    }

    @Override
    public List<VaccinationResponseDTO> buildVaccinationResponse (int citizenId) {
        List<VaccineEntity> vaccineEntities = VaccineData.searchByCitizenId(citizenId);
        if (vaccineEntities.isEmpty()) {
            return null;
        }
        List<VaccinationResponseDTO> vaccinationResponseDTOS = new ArrayList<>();
        for (VaccineEntity vaccineEntity : vaccineEntities) {
            vaccinationResponseDTOS.add(new VaccinationResponseDTO(vaccineEntity));
        }
        return vaccinationResponseDTOS;
    }

}
