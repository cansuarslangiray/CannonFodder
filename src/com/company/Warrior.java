package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Warrior extends Player {
    SecureRandom secureRandom = new SecureRandom();

    public Warrior(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public Weapons assigningWeapons() {
        setWeapons(objects.getClaymoreArrayList().get(secureRandom.nextInt(0,objects.getClaymoreArrayList().size() - 1)));
        return objects.getClaymoreArrayList().get(secureRandom.nextInt(0,objects.getClaymoreArrayList().size() - 1));
    }

    @Override
    public void assigningAbility() {
        super.assigningAbility();
    }
}

