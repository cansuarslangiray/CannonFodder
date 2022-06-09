package com.company;

public class Weapons  extends Item {


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
        setInvType("Weapon");
    }

    public double getWeight() {
        return weight;
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

    @Override
    public void weaponsPrintInfo() {
        super.weaponsPrintInfo();
        System.out.println("weapons' damage: \t" + getDamage());
        System.out.println("weapons' rarity: \t" + getRarity());
        System.out.println("weapons' level: \t" + getLevel());
        System.out.println("weapons' quality: \t" + getQuality());
        System.out.println("weapons' weight: \t" + getWeight());
    }
}




