package com.company;

public class ClothsShop extends SafePlace {
    public ClothsShop(Player player) {
        super(player, "Cloths Shop ");
    }

    @Override
    public boolean getLocation() {
        return true;
    }
}
