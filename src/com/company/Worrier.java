package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Worrier extends Player {
    public Worrier(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public String assigningWeapons() {
        SecureRandom secureRandom = new SecureRandom();
        ArrayList<Weapons> arrayList = new ArrayList<>();
        arrayList = Weapons.getClaymoreArrayList;
        for (int i = 0; i < arrayList.size(); i++) {
            setWeapons(arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)));
        }

        return  (arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1))).getName();
    }
}

