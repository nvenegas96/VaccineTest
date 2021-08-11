package com.test.vaccine.service.impl;

import com.test.vaccine.data.CitizensData;
import com.test.vaccine.data.PenaltyData;
import com.test.vaccine.model.PenaltyEntity;
import com.test.vaccine.model.dto.PenaltyResponseDTO;
import com.test.vaccine.service.PenaltyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class PenaltyServiceImpl implements PenaltyService {


    @Override
    public PenaltyEntity createPenalty(PenaltyEntity penaltyEntity) {
        if (CitizensData.searchById(penaltyEntity.getCitizenId()) == null) {
            return null;
        }
        penaltyEntity.setPenaltyId(PenaltyData.getLastId());
        penaltyEntity.setDate(new Date());
        PenaltyData.add(penaltyEntity);
        return penaltyEntity;
    }

    @Override
    public List<PenaltyResponseDTO> buildPenaltyResponse(Integer citizenId) {
        List<PenaltyEntity> penaltyEntities = PenaltyData.searchByCitizenId(citizenId);
        if (penaltyEntities.isEmpty()) {
            return null;
        }
        List<PenaltyResponseDTO> penaltyResponseDTOS = new ArrayList<>();
        for (PenaltyEntity penaltyEntity : penaltyEntities) {
            penaltyResponseDTOS.add(new PenaltyResponseDTO(penaltyEntity));
        }
        return penaltyResponseDTOS;
    }


}
