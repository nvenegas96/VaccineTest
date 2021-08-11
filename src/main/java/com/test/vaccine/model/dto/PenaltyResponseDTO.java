package com.test.vaccine.model.dto;

import com.test.vaccine.model.PenaltyEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PenaltyResponseDTO {

    private long date;
    private String reason;

    public PenaltyResponseDTO(PenaltyEntity penaltyEntity) {
        this.date = penaltyEntity.getDate().getTime();
        this.reason = penaltyEntity.getReason();
    }
}
