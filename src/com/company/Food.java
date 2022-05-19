package com.company;

import java.util.ArrayList;

public class Food extends Inventory{
    double addHP;
    public Food(String name, String itemType, int rarity, int priceOfItem, double pointsHP) {
        super(name, itemType, rarity, priceOfItem);
        this.addHP=pointsHP;
    }

    public double getAddHP() {
        return addHP;
    }

    public void setAddHP(double addHP) {
        this.addHP = addHP;
    }
    Food food1= new Food("Satisfying Salad","Food",3,70,300);
    Food food2 = new Food("Mushroom Pizza","Food",2,80,400);
    Food food3 = new Food("Fried Egg","Food",4,20,200);
    Food food4 = new Food("Grilled Fish","Food",5,10,100);


}

