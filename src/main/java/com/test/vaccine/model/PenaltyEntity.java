package com.test.vaccine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PenaltyEntity {

        private Integer penaltyId;
        private int citizenId;
        private Date date;
        private String reason;
}
