package com.test.vaccine.service;

import com.test.vaccine.model.PenaltyEntity;
import com.test.vaccine.model.dto.PenaltyResponseDTO;

import java.util.List;

public interface PenaltyService {

    PenaltyEntity createPenalty (PenaltyEntity penaltyEntity);

    List<PenaltyResponseDTO> buildPenaltyResponse(Integer citizenId);
}
