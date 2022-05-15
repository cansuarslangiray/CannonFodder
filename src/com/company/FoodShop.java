package com.company;

public class FoodShop extends SafePlace {
    public FoodShop(Player player) {
        super(player,"Food Shop");
    }

    @Override
    public boolean getLocation() {
        return true;
    }
}
