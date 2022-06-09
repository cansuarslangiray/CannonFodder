package com.company;

public class Food extends Item {
    double addHP;
    public Food(String name, String itemType, int priceOfItem, double pointsHP) {
        super(name, itemType, priceOfItem);
        this.addHP=pointsHP;
    }

    public double getAddHP() {
        return addHP;
    }

    public void setAddHP(double addHP) {
        this.addHP = addHP;
    }
    public void foodsDisplay(){
        System.out.println("---------------------------------------------");
        System.out.println("Name: \t" + getName() );
        System.out.println("Price: \t" + getPriceOfItem() );
        System.out.println("Plus HP yield: \t" + getAddHP());
        System.out.println();

    }

}
