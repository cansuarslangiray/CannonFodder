

package com.company;

import java.util.ArrayList;

public class Moonhallow extends Battlefields implements Locateable{


    public Moonhallow(ArrayList<Player> players) {
        super(players);
        this.areaName = "Moonhallow";
    }

    @Override
    public boolean getLocation() {
        initializeEnemies();
        fPlayer();
        battle();
        return true;
    }

    @Override
    public void battle() {
        super.battle();
    }

    @Override
    public void fPlayer() {
        super.fPlayer();
    }
}