package com.company;

import java.util.ArrayList;

public class Wildfront extends Battlefields {


    public Wildfront(ArrayList<Player> players) {
        super(players);
        this.areaName = "Wildfront";
    }


    @Override
    public boolean getLocation() {
        return super.getLocation();
    }

   /* @Override
    public ArrayList<Enemy> initializeEnemies() {
            int sEnemy = sr.nextInt(0,2);
            if(sEnemy == 0){
                Goblin goblin = new Goblin();
                currentEnemies.add(goblin);

            }
            else if(sEnemy == 1){
                Rouge rouge = new Rouge();
                currentEnemies.add(rouge);
            }
            else{
                Monk monk = new Monk();
                currentEnemies.add(monk);
            }
            return currentEnemies;
    }*/
}

