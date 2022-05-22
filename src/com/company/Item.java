package com.company;

import java.util.ArrayList;

public class Item {
    ArrayList<Player> players;
    private String name;
    private String itemType;
    private double priceOfItem;

     public Item(){
         this.name = null;
         this.itemType = null;
         this.priceOfItem = 0;
     }

    public Item(String name, String itemType, int priceOfItem) {
        this.name = name;
        this.itemType = itemType;
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




}
