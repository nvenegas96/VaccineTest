package com.test.vaccine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CitizensEntity {

    private Integer citizenId;
    private String name;
    private boolean enable = false; // by default is false

}
