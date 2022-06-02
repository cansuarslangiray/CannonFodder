

package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Battlefields extends Location {
    Scanner sc = new Scanner(System.in);
    SecureRandom sr = new SecureRandom();
    private ArrayList<Enemy> currentEnemies;
    public int adventureRank = 1;
    private Enemy e;
    double eCounter = Math.pow(2,adventureRank);
    private ArrayList<Player> fPlayers = new ArrayList<>();



    public Battlefields(ArrayList<Player> players, ArrayList<Enemy> enemy) {
        super(players);
        this.currentEnemies = enemy;
    }

    public boolean getLocation(){
        System.out.println("You are in: " + this.getName());
        fPlayer();
        System.out.println("To fight press f or press r to run");
        String choice = sc.next();
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
        initializeEnemies();
        battle();
        return true;
    }
    public void initializeEnemies() {

        for (int i = 0; i < Math.pow(2,adventureRank); i++) {
            if(this.getName().equals("Moonhallow")){
               int sEnemy = sr.nextInt(0,1);
               if(sEnemy == 1){
                   Siren siren = new Siren();
                   currentEnemies.add(siren);
               }
               else {
                   DemonHunter demonHunter = new DemonHunter();
                   currentEnemies.add(demonHunter);
               }
            }
            else if(this.getName().equals("Wildfront")){
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
            }
           else if(this.getName().equals("Oceangulf")){
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
                    DemonHunter demonHunter = new DemonHunter();
                    currentEnemies.add(demonHunter);
                }
            }
        }
    }
    public void fPlayer(){
        System.out.println("You have to choose 3 of your characters to fight before you start the match ");
        System.out.println("information of your characters ");
        for(int i = 0;i<players.size();i++){
            System.out.println((i+1) + ".stats");
            playerStats(players.get(i));
        }
        System.out.println("Which rank do you want to fight with your characters?");
        System.out.print("first choice:");
        int choice = sc.nextInt();
        System.out.print("second choice: ");
        int choice1 = sc.nextInt();
        System.out.print("third choice: ");
        int choice2 = sc.nextInt();
        fPlayers.add(players.get(choice-1));
        fPlayers.add(players.get(choice1-1));
        fPlayers.add(players.get(choice2-1));
    }
     public void battle()  {
        int temp;
        int enemyTemp = 0;
        boolean fighting = true;
        int numberOfEnemies = currentEnemies.size();
        int numberOfPlayers = players.size();
        System.out.println("------------LEVEL " + adventureRank + " --------------");
        System.out.println("Number of enemies are " + numberOfEnemies + "          |");
        System.out.println("information of your characters before the fight begins ");
        for(int i=0;i<3;i++){
            playerStats(fPlayers.get(i));
        }
        System.out.println("information of enemies before the fight begins ");
        enemyStats();
        System.out.println("The fight begins------------------");
        while (fighting) {
            boolean targeted = true;
            if (numberOfEnemies == 1) {
                temp = 0;
            } else {
                temp = sr.nextInt(0, numberOfEnemies - 1);
            }
            while (targeted) {
                System.out.println("choose the character you will fight: ");
                System.out.println("press 1 " + fPlayers.get(0).getCharacterName());
                System.out.println("press 2 " + fPlayers.get(1).getCharacterName());
                System.out.println("press 3 " + fPlayers.get(2).getCharacterName());
                int choice = sc.nextInt();
                    System.out.println(
                            "It is " + fPlayers.get(choice-1).getType() + " " + fPlayers.get(choice-1).getCharacterName()
                                    + "'s turn.");
                    fPlayers.get(choice-1).setTarget(currentEnemies.get(temp));
                    boolean menu = true;
                    while (menu) {
                        System.out.println("******************************************************");
                        System.out.println("Here are your player options");
                        System.out.println("Enter 1 to basic attack enemy");
                        System.out.println("Enter 2 to use special ability");
                        System.out.println("Enter 3 to display inventory");
                        System.out.println("Enter 4 to display character information and stats");
                        System.out.println("******************************************************");
                        int answer = sc.nextInt();
                        switch (answer) {
                            case 1:
                                fPlayers.get(choice-1).attack();
                                menu = false;
                                break;
                            case 2:
                                menu = false;
                                break;
                            case 3:
                             
                                System.out.println("Enter 1 to see additional information about the items");
                                System.out.println("Enter 2 to go back to menu");
                                int caseThreeAnswer = sc.nextInt();
                                if (caseThreeAnswer == 1) {

                                }
                                break;
                            case 4:
                                fPlayers.get(choice-1).characterPrintInfo();
                                break;
                        }
                    }
                    if (fPlayers.get(choice-1).getTarget().getHealth() <= 0) {
                        fPlayers.get(choice-1).getTarget().setHealth(0);
                    }
                    System.out.println(
                            "Current health of the enemy is " + fPlayers.get(choice-1).getTarget().getHealth());

                    if (fPlayers.get(choice-1).getTarget().getHealth() <= 0) {
                        break;
                    }

                     if (currentEnemies.get(temp).getHealth() <= 0) {
                       System.out.println(currentEnemies.get(temp).getName() + " is dead");
                       currentEnemies.remove(temp);
                       numberOfEnemies = currentEnemies.size();
                       targeted = false;
                }

                for (int i = 0; i < currentEnemies.size(); i++) {
                    int enemyIndex = 0;
                    for (int j = 0; j < fPlayers.size(); j++) {
                        if (fPlayers.get(j).getType().equals("Tank")) {
                            enemyTemp = j;
                        }
                    }


                    System.out.println("It is " + currentEnemies.get(i).getName() + "'s turn ");
                    currentEnemies.get(i).setTarget(fPlayers.get(enemyIndex));
                    currentEnemies.get(i).attack();
                    if (currentEnemies.get(i).getTarget().getHealth() <= 0) {
                        currentEnemies.get(i).getTarget().setHealth(0);
                    }
                    System.out.println("Current health of the " + currentEnemies.get(i).getTarget().getCharacterName() + " is "
                            + currentEnemies.get(i).getTarget().getHealth());
                    //currentEnemies.get(i).setStunned(false);
                    if (currentEnemies.get(i).getTarget().getHealth() <= 0) {
                        break;
                    }
                }
            }
        }
    }
    public void playerStats(Player player){
        System.out.println("Health: " + player.getHealth() + "Damage: \t" + player.getDamage()+"Para; \t" + player.getAllMoney() );
        if(player.getDamage()>0){
            System.out.println("Weapon: " + player.getWeapons().getName());
        }
        if(player.getBlock()>0){
            System.out.println("Armor: " + player.getArmors().getName());
        }
    }
    public void enemyStats() {
        for (int i = 0; i < enemyCounter(); i++) {
            System.out.println(currentEnemies.get(i).getType()+" Stats: ");
            System.out.println("Health: " + e.getHealth() +"Damege: \t" + e.getDamage()+ "Award: \t" + e.getAward() );
        }
    }




}