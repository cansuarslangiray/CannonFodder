package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Wizard extends Player {
       static  Player player;

    public Wizard(String type, String characterName, int money, Ability ability, Inventory inventory,Weapons weapons) {
        super(type, characterName, money, ability, inventory,weapons);
    }
}
