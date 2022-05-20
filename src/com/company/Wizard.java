package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Wizard extends Player {
    SecureRandom secureRandom = new SecureRandom();

    public Wizard(String type, String characterName, int money) {
        super(type, characterName, money);
    }

   /* @Override
    public Weapons assigningWeapons() {
        setWeapons(objects.getWandArrayList().get(secureRandom.nextInt(0,objects.getWandArrayList().size() - 1)));
        return objects.getWandArrayList().get(secureRandom.nextInt(0,objects.getWandArrayList().size() - 1));

    }*/

    @Override
    public void assigningAbility() {
        super.assigningAbility();
    }
}
