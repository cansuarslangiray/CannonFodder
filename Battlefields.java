package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Battlefields extends Location {
    private ArrayList<Enemy> enemy;
    Scanner input = new Scanner(System.in);
    private Enemy e;
    Player player;

    public Battlefields(ArrayList<Player> players, ArrayList<Enemy> enemy) {
        super(players);
        this.enemy = enemy;
    }

    public boolean getLocation(){
        int enemyCounter = e.enemyCounter();
        System.out.println("You are in: " + this.getName());
        System.out.println("There are" + enemyCounter+ "enemy in here.");
        System.out.println("To fight press f or press r to run");
        String choice = input.next();
        if(choice.equals("f")){
            if(combat(enemyCounter())){
                System.out.println("Area is clear");
                return true;
            }
            else
                System.out.println("You died");
            return false;

        }
        return true;
    }

    protected abstract int enemyCounter();

    public boolean combat(int enemyCounter){

        return true;
    }
    public void playerStats(){
        System.out.println("Player Stats");
        System.out.println("Health: " + player.getHealth());
        System.out.println("Damage: " + player.getDamage());
        System.out.println("Para; " + player.getAllMoney());
        if(player.getDamage()>0){
            System.out.println("Weapon: " + player.getWeapons().getName());
        }
        if(player.getBlock()>0){
            System.out.println("Armor: " + player.getArmors().getName());
        }
    }
    public void enemyStats(){
        System.out.println("Enemy Stats: ");
        System.out.println("Health: "+ e.getHealth());
        System.out.println("Damege: "+ e.getDamage());
        System.out.println("Award: " + e.getAward());
    }



}