package com.test.vaccine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VaccineEntity {

    private Integer vaccineId;
    private Integer citizenId;
    private String brand;
    private Date date;
}
