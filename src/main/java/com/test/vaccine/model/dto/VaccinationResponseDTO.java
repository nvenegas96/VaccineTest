package com.test.vaccine.model.dto;

import com.test.vaccine.model.VaccineEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VaccinationResponseDTO {

    private String brand;
    private long date;

    public VaccinationResponseDTO(VaccineEntity vaccineEntity) {
        this.brand = vaccineEntity.getBrand();
        this.date = vaccineEntity.getDate().getTime();
    }
}
