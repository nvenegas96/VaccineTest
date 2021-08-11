package com.test.vaccine.model.dto;

import com.test.vaccine.model.CitizensEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CitizenResponseDTO {
    private int id;
    private String name;
    private boolean enable;
    private boolean vaccinated;
    private List<VaccinationResponseDTO> vaccination; // finish with s?
    private List<PenaltyResponseDTO> penalty; // finish with s ?

    public CitizenResponseDTO(CitizensEntity citizensEntity) {
        this.id = citizensEntity.getCitizenId();
        this.name = citizensEntity.getName();
        this.enable = citizensEntity.isEnable();
    }
}
