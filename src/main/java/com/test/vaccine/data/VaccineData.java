package com.test.vaccine.data;

import com.test.vaccine.model.PenaltyEntity;
import com.test.vaccine.model.VaccineEntity;

import java.util.ArrayList;
import java.util.List;

public class VaccineData {

    private static List<VaccineEntity> vaccineEntityList = new ArrayList<>();

    private static Integer lastId = 0;

    public static Integer getLastId() {
        lastId++;
        return lastId;
    }

    public static List<VaccineEntity> searchByCitizenId (int citizenId) {
        List<VaccineEntity> vaccineEntities = new ArrayList<>();
        for (VaccineEntity vaccineEntity : vaccineEntityList) {
            if (vaccineEntity.getCitizenId() == citizenId) {
                vaccineEntities.add(vaccineEntity);
            }
        }
        return vaccineEntities;
    }

    public static void add(VaccineEntity vaccineEntity) {
        vaccineEntityList.add(vaccineEntity);
    }

}
