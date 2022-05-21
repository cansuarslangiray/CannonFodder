package com.company;

import java.util.ArrayList;

public abstract class SafePlace extends Location{

    public SafePlace(ArrayList<Player> players) {
        super(players);
    }

    public  boolean getLocation(){
        return true;
    }
}
