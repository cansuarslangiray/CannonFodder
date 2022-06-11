package com.company;



public class Item {
    private String name;
    private String itemType;
    private double priceOfItem;
    private int primogen;
    private String invType;

    public Item(String name, String itemType, int priceOfItem) {
        this.name = name;
        this.itemType = itemType;
        this.priceOfItem =priceOfItem;
        this.primogen = 20;
    }

    public String getInvType() {
        return invType;
    }

    public void setInvType(String invType) {
        this.invType = invType;
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


    public void weaponsPrintInfo(){
        System.out.println("---------------------------------------------");
        System.out.println("weapons' name: \t" + getName() );
        System.out.println("weapons' price: \t" + getPriceOfItem() );

    }
    public void foodsDisplay(){
        System.out.println("---------------------------------------------");
        System.out.println("Name: \t" + getName() + "Price: \t" + getPriceOfItem());
        System.out.println();

    }
    public void display(){
        System.out.println("---------------------------------------------");
        System.out.println("Name: \t" + getName() + "\t dropped coin: \t" + getPriceOfItem() + "\t type: \t" + getItemType());

    }
}
