package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Lancer  extends Player{
    Objects objects = new Objects();
    SecureRandom secureRandom = new SecureRandom();
    public Lancer(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public Weapons assigningWeapons() {
        setWeapons(objects.getPolearmsArrayList().get(secureRandom.nextInt(objects.getPolearmsArrayList().size() - 1)));
        return objects.getPolearmsArrayList().get(secureRandom.nextInt(objects.getPolearmsArrayList().size() - 1));
    }

    @Override
    public void assigningAbility() {
        super.assigningAbility();
    }
}
