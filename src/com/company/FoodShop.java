package com.company;

import java.util.ArrayList;

public class FoodShop extends SafePlace {
    public FoodShop(ArrayList<Player> players) {
        super(players);
    }

    @Override
    public boolean getLocation() {
        return true;
    }
}
