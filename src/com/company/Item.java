package com.company;



public class Item {
    private String name;
    private String itemType;
    private double priceOfItem;
    private int primogen;
    private String invType;

     public Item(){
         this.name = null;
         this.itemType = null;
         this.priceOfItem = 0;
         this.primogen = 20;
     }

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
}
