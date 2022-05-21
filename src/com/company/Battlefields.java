package com.company;

public abstract class Battlefields extends Location {
 private Enemy enemy;

    public Battlefields(Player player,String name,Enemy enemy) {
        super(player);
        this.name = name;
        this.enemy = enemy;
    }

    public boolean getLocation(){
        return  true;
    }

}
