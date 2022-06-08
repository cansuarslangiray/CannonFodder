package com.company;

public class Scythe extends Weapons{
    public Scythe(String name, String itemType, int rarity, int priceOfItem, int damage, int level, int quality, double weight) {
        super(name, itemType, rarity, priceOfItem, damage, level, quality, weight);
        setInvType("Weapon");
    }
}
