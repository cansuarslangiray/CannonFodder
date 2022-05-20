package com.company;

import java.security.SecureRandom;


public class Elf extends Player {

    SecureRandom secureRandom = new SecureRandom();
    public Elf(String type, String characterName, int money) {
        super(type, characterName, money);
        Objects objects = new Objects();

    }

    @Override
    public Weapons assigningWeapons() {
        setWeapons(objects.getScytheArrayList().get(secureRandom.nextInt(0,objects.getScytheArrayList().size() - 1)));
        return objects.getScytheArrayList().get(secureRandom.nextInt(0,objects.getScytheArrayList().size() - 1));
    }

    @Override
    public void assigningAbility() {
        super.assigningAbility();
    }
}