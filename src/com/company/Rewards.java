package com.company;

public class Rewards extends Item {
    double addHP;
    private int damage;
    private int level;

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

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    private int quality;
    private double weight;
    private int rarity;

    public Rewards(String name, String itemType, int priceOfItem, double pointsHP) {
        super(name, itemType, priceOfItem);
        this.addHP=pointsHP;
    }

    public Rewards(String name, String itemType, int priceOfItem) {
        super(name,itemType,priceOfItem);
    }

    public Rewards(String name, String itemType, int rarity, int priceOfItem, int damage, int level, int quality, double weight) {
        super(name, itemType, priceOfItem);
        this.damage = damage;
        this.level = level;
        this.quality = quality ;
        this.weight = weight;
        this.rarity = rarity;
    }
    public double getAddHP() {
        return addHP;
    }

    public void setAddHP(double addHP) {
        this.addHP = addHP;
    }
}
