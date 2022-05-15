package com.company;

public class Inventory {
    private String name;
    private double weight;
    private String itemType;
    private int quality;
    private int rarity;
    private double priceOfItem;
    private int level;
    private int damage;
    private int avoid;

    public Inventory() {
        this.name = "unknown";
        this.weight = 0.0;
        this.itemType = "unknown";
        this.quality = 0;
        this.rarity = 0;
        this.priceOfItem =0.0;
        this.level = 0;
        this.damage =0;
        this.avoid = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return itemType;
    }

    public void setType(String itemType) {
        this.itemType= itemType;
    }

    public int getItemLevel() {
        return quality;
    }

    public void setItemLevel(int quality) {
        this.quality= quality;
    }


    public int isRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public double getPriceOfItem() {
        return priceOfItem;
    }

    public void setPriceOfItem(double priceOfItem) {
        this.priceOfItem = priceOfItem;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getItemType() {
        return itemType;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getRarity() {
        return rarity;
    }

    public int getDamage() {
        return damage;
    }

    public int getAvoid() {
        return avoid;
    }

    public void setAvoid(int avoid) {
        this.avoid = avoid;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int rarity(){
        if(rarity== 1){
            return 10;
        }
        else if(rarity== 2){
            return 20;
        }
        else if(rarity==3){
            return 50;
        } else if (rarity == 4) {
            return 200;
        }

        else if(rarity >= 5)
            rarity = 5;
        return   rarity+400;

    }
}
