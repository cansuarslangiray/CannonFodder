package com.company;

public class Inventory {
    private String name;
    private int weight;
    private String itemType;
    private int quality;
    private int rarity;

    private double priceOfItem;
    private int level;

    public Inventory(String name,int weight,String itemType,int rarity,double priceOfItem, int level) {
        this.name = name;
        this.weight = weight;
        this.itemType= itemType;
        this.rarity = rarity;
        this.priceOfItem = priceOfItem;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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
