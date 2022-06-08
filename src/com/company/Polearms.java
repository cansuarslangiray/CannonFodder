package com.company;

public class Polearms extends Weapons {

    public Polearms(String name, String itemType, int rarity, int priceOfItem, int damage, int level, int quality, double weight) {
        super(name, itemType, rarity, priceOfItem, damage, level, quality, weight);
        setInvType("Weapon");
    }
}
