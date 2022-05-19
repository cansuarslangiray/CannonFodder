package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Wizard extends Player {

    public Wizard(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public void assigningWeapons() {
        Objects objects = new Objects();
        SecureRandom secureRandom = new SecureRandom();
        ArrayList<Weapons> arrayList = new ArrayList<>();
        objects.wandArrayList(arrayList);
        setWeapons(arrayList.get(secureRandom.nextInt(0,arrayList.size() - 1)));

    }
}
