package com.company;

public class Weapons  extends Inventory{

    private int attack;

    public Weapons(String name, int weight, String itemType,int rarity, double priceOfItem, int level,int attack) {
        super(name, weight, itemType, rarity, priceOfItem, level);

        this.attack= attack;
    }


    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }



}
