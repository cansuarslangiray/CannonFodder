package com.company;

public abstract class SafePlace extends Location{
    public SafePlace(Player player, String name) {
        super(player);
        this.name = name;
    }
    public  boolean getLocation(){
        return true;
    }
}
