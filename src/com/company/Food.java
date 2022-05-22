package com.company;

import java.util.ArrayList;

public class Food extends Item{
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


}
