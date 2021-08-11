package com.test.vaccine.data;

import com.test.vaccine.model.PenaltyEntity;

import java.util.ArrayList;
import java.util.List;

public class PenaltyData {

    private static List<PenaltyEntity> penaltyEntityList = new ArrayList<>();

    private static Integer lastId = 0;

    public static Integer getLastId() {
        lastId++;
        return lastId;
    }

    public static List<PenaltyEntity> searchByCitizenId (int citizenId) {
        List<PenaltyEntity> penaltyEntities = new ArrayList<>();
        for (PenaltyEntity penaltyEntity : penaltyEntityList) {
            if (penaltyEntity.getCitizenId() == citizenId) {
                penaltyEntities.add(penaltyEntity);
            }
        }
        return penaltyEntities;
    }

    public static void add(PenaltyEntity penaltyEntity) {
        penaltyEntityList.add(penaltyEntity);
    }

}
