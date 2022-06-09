
package com.company;

public class Armors extends Item {
    private int block;
    private int level;
    private int quality;
    private double weight;
    private int rarity;

    public Armors(String name, String itemType, int rarity, int priceOfItem, int block, int level,int quality,double weight) {
        super(name, itemType, priceOfItem);
        this.setBlock(block);
        this.setLevel(level);
        this.setQuality(quality);
        this.setWeight(weight);
        this.setRarity(rarity);
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
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
    public void armorsDisplay(){
        System.out.println("---------------------------------------------");
        System.out.println("Name: \t" + getName() );
        System.out.println("Price: \t" + getPriceOfItem() );
        System.out.println("Block: \t" + getBlock());
        System.out.println("Rarity: \t" + getRarity());
        System.out.println("Level: \t" + getLevel());
        System.out.println("Quality: \t" + getQuality());
        System.out.println("Weight: \t" + getWeight());
        System.out.println();

    }

}
