package com.test.vaccine.data;

import com.test.vaccine.model.CitizensEntity;

import java.util.ArrayList;
import java.util.List;

public class CitizensData {

    private static List<CitizensEntity> citizensEntityList = new ArrayList<>();

    private static Integer lastId = 0;

    public static Integer getLastId() {
        lastId++;
        return lastId;
    }

    public static CitizensEntity searchById (int citizenId) {
        for (CitizensEntity citizensEntity : citizensEntityList) {
            if (citizensEntity.getCitizenId() == citizenId) {
                return  citizensEntity;
            }
        }
        return null;
    }

    public static void add(CitizensEntity citizensEntity) {
        citizensEntityList.add(citizensEntity);
    }

}
