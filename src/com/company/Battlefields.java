package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Battlefields extends Location {
 private ArrayList<Enemy> enemy;
 Scanner sc = new Scanner(System.in);

    public Battlefields(ArrayList<Player> players, ArrayList<Enemy> enemy) {
        super(players);
        this.enemy = enemy;
    }

    public boolean getLocation(){
        int eCounter;
        for(int i = 0; i<enemy.size();i++ ) {
           eCounter += enemy.get(i).enemyCounter();
        }
        System.out.println("you are currently in " + this.getName());
        System.out.println("be careful!!");
        System.out.println("Here you can encounter " + enemy.enemyCounter() +" enemies");
        System.out.println("fight<f> or run<r>");
        String selectCase = sc.next();
        if(selectCase.equalsIgnoreCase("f")){
           if(combat(enemy.enemyCounter())){
               System.out.println("all enemies in " +this.getName()+" area are dead");
               return true;
           }
           else
               System.out.println("you DIED");
               return false;

        }
        return  true;
    }
    public boolean combat(int enemyCounter){
        return true;
    }

}
