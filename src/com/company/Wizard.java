package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Wizard extends Player {
       static  Player player;

    public Wizard(String type, String characterName, int money) {
        super(type, characterName, money);

    }

    @Override
    public String assigningWeapons() {
        SecureRandom secureRandom = new SecureRandom();
        ArrayList<Weapons> arrayList ;
        Weapons
        for (int i = 0; i < Weapons.; i++) {
            setWeapons(arrayList.get(secureRandom.nextInt(0, (Weapons.getWandArrayList.size() - 1))));
        }
        return  (arrayList.get(secureRandom.nextInt(0, (Weapons.getWandArrayList.size() - 1)))).getName();
    }
}
