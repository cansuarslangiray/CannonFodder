package com.company;

import java.util.ArrayList;

public class Weapons  extends Inventory{


    private int damage;
    private int level;
    private int quality;
    private double weight;

    public Weapons(String name, String itemType, int rarity, int priceOfItem, int damage, int level,int quality,double weight) {
        super(name, itemType, rarity, priceOfItem);
        this.damage = damage;
        this.level = level;
        this.quality = quality ;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }




}




