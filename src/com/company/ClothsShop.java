package com.company;

import java.util.ArrayList;

public class ClothsShop extends SafePlace {
    public ClothsShop(ArrayList<Player> players) {
        super(players);
    }

    @Override
    public boolean getLocation() {
        return true;
    }
}
