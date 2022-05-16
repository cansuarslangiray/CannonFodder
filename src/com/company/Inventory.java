package com.company;

public class Inventory {
    private String name;
    private String itemType;
    private int rarity;
    private double priceOfItem;


   // private int avoid;

    public Inventory(String name, String itemType, int rarity, int priceOfItem) {
        this.name = name;
        this.itemType = itemType;
        this.rarity = rarity;
        this.priceOfItem =priceOfItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getType() {
        return itemType;
    }

    public void setType(String itemType) {
        this.itemType= itemType;
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


    public String getItemType() {
        return itemType;
    }



    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getRarity() {
        return rarity;
    }



      /* public int rarity(){
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

    }*/
}
