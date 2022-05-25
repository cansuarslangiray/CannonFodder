package com.company;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Player> players;
    private String name;
    private String itemType;
    private double priceOfItem;
    private int primogen;

     public Inventory(){
         this.name = null;
         this.itemType = null;
         this.priceOfItem = 0;
         this.primogen = 20;
     }

    public Inventory(String name, String itemType, int priceOfItem) {
        this.name = name;
        this.itemType = itemType;
        this.priceOfItem =priceOfItem;
        this.primogen = 20;
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

    public int getPrimogen() {
        return primogen;
    }

    public void setPrimogen(int primogen) {
        this.primogen = primogen;
    }
}
