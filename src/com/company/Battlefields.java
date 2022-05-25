package com.company;

import java.util.ArrayList;

public abstract class Battlefields extends Location {
 private Enemy enemy;

    public Battlefields(ArrayList<Player> players, Enemy enemy) {
        super(players);
        this.enemy = enemy;
    }

    public boolean getLocation(){
        enemy.setMaxNumber(enemy.enemyCounter());
        return  true;
    }

}
