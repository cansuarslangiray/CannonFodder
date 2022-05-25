package com.company;

public class Weapons  extends Inventory {


    private int damage;
    private int level;
    private int quality;
    private double weight;
    private int rarity;

    public Weapons(String name, String itemType, int rarity, int priceOfItem, int damage, int level,int quality,double weight) {
        super(name, itemType, priceOfItem);
        this.damage = damage;
        this.level = level;
        this.quality = quality ;
        this.weight = weight;
        this.rarity = rarity;
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

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public void weaponsPrintInfo(){
        System.out.println("---------------------------------------------");
        System.out.println("weapons' name: \t" + getName() );
        System.out.println("weapons' price: \t" + getPriceOfItem() );
        System.out.println("weapons' damage: \t" + getDamage());
        System.out.println("weapons' rarity: \t" + getRarity());
        System.out.println("weapons' level: \t" + getLevel());
        System.out.println("weapons' quality: \t" + getQuality());
        System.out.println("weapons' weight: \t" + getWeight());
        System.out.println();

    }
}




