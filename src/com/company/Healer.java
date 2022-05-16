package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Healer extends Player{
    public Healer(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public String assigningWeapons() {
        SecureRandom secureRandom = new SecureRandom();
        ArrayList<Weapons> arrayList ;
        arrayList = Weapons.getCatalystArrayList;
        for (int i = 0; i < arrayList.size(); i++) {
            setWeapons(arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)));

        }
        return  (arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1))).getName();
    }
}

