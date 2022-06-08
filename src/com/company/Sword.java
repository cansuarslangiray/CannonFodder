package com.company;

public class Sword extends Weapons{


    public Sword(String name, String itemType, int rarity, int priceOfItem, int damage, int level, int quality, double weight) {
        super(name, itemType, rarity, priceOfItem, damage, level, quality, weight);
        setInvType("Weapon");
    }

    @Override
    public String getItemType() {
        return super.getItemType();
    }
}
