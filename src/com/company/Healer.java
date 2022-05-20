package com.company;

import java.security.SecureRandom;


public class Healer extends Player{

    SecureRandom secureRandom = new SecureRandom();
    public Healer(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public Weapons assigningWeapons() {
        setWeapons(objects.getCatalystArrayList().get(secureRandom.nextInt(objects.getCatalystArrayList().size() - 1)));
        return objects.getCatalystArrayList().get(secureRandom.nextInt(objects.getCatalystArrayList().size() - 1));
    }

    @Override
    public void assigningAbility() {
        super.assigningAbility();
    }
}

