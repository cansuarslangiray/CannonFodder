package com.company;

import java.util.ArrayList;

public class Oceangulf  extends  Battlefields{

    public Oceangulf(ArrayList<Player> players) {
        super(players);
        this.areaName="Oceangulf";
    }



    @Override
    public boolean getLocation() {
        return super.getLocation();
    }

    /*@Override
    public ArrayList<Enemy> initializeEnemies() {
        int sEnemy = sr.nextInt(0,2);
        if(sEnemy == 0){
            DeathKnight deathKnight = new DeathKnight();
            currentEnemies.add(deathKnight);
        }
        else if(sEnemy == 1){
            Siren siren = new Siren();
            currentEnemies.add(siren);
        }
        else {
            DemonHunter demonHunter = new DemonHunter("s");
            currentEnemies.add(demonHunter);
        }
        return currentEnemies;

    }*/
}
