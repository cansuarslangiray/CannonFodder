

package com.company;

import java.util.ArrayList;

public class Moonhallow extends Battlefields{
    private ArrayList<Enemy> currentEnemies;


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

    public ArrayList<Enemy> initializeEnemies() {
        currentEnemies = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, 2); i++) {

                int sEnemy = sr.nextInt(0, 1);
                if (sEnemy == 1) {
                    Enemy siren = new Enemy("Siren");
                    siren.sEnemy();
                    currentEnemies.add(siren);

                } else {
                    Enemy demonHunter = new Enemy("Demon Hunter");
                    demonHunter.sEnemy();
                    currentEnemies.add(demonHunter);

                }


        }return currentEnemies;
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