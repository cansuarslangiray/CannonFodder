package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Warrior extends Player {
    SecureRandom secureRandom = new SecureRandom();

    public Warrior(String type, String characterName, int money) {
        super(type, characterName, money);
    }



}

