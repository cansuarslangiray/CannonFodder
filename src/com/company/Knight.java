package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Knight extends  Player{

    SecureRandom secureRandom = new SecureRandom();
    public Knight(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public Weapons assigningWeapons() {
        setWeapons(objects.getSwordArrayList().get(secureRandom.nextInt(objects.getSwordArrayList().size() - 1)));
        return objects.getSwordArrayList().get(secureRandom.nextInt(objects.getSwordArrayList().size() - 1));
    }

    @Override
    public void assigningAbility() {
        super.assigningAbility();
    }
}
