

package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Battlefields extends Location {
    int advRank = 1;
    Scanner sc = new Scanner(System.in);
    SecureRandom sr = new SecureRandom();
    int nDamage;
    Location location;
    private ArrayList<Enemy> currentEnemies ;
    private Enemy e;
    double eCounter = Math.pow(2,2);
    private ArrayList<Player> fPlayers = new ArrayList<>();



    public Battlefields(ArrayList<Player> players) {
        super(players);
        this.currentEnemies = initializeEnemies();
    }

    public boolean getLocation(){
        System.out.println("You are in: " + this.getAreaName());
        fPlayer();
        System.out.println("To fight press f or press r to run");
        String choice = sc.next();
        if(choice.equals("f")){
            //initializeEnemies();
            battle();
        }
        if(choice.equals("r")){
            location = new Home(players);
            location.getLocation();
        }
        return true;
    }


   public ArrayList<Enemy> initializeEnemies() {
     currentEnemies = new ArrayList<>();
        for (int i = 0; i < Math.pow(2,2); i++) {
            if(location.getAreaName().equals("Moonhallow")){
               int sEnemy = sr.nextInt(0,1);
               if(sEnemy == 1){
                   Enemy siren = new Siren();
                   siren.sEnemy();
                   currentEnemies.add(siren);

               }
               else {
                   Enemy demonHunter = new DemonHunter("s");
                   demonHunter.sEnemy();
                   currentEnemies.add(demonHunter);

               }
               return currentEnemies;
            }
            else if(this.getAreaName().equals("Wildfront")){
                int sEnemy = sr.nextInt(0,2);
                if(sEnemy == 0){
                    Goblin goblin = new Goblin();
                    goblin.sEnemy();
                    currentEnemies.add(goblin);

                }
                else if(sEnemy == 1){
                    Rouge rouge = new Rouge();
                    rouge.sEnemy();
                    currentEnemies.add(rouge);
                }
                else{
                    Monk monk = new Monk();
                    monk.sEnemy();
                    currentEnemies.add(monk);
                }
                return currentEnemies;
            }
           else if(this.getAreaName().equals("Oceangulf")){
                int sEnemy = sr.nextInt(0,2);
                if(sEnemy == 0){
                    DeathKnight deathKnight = new DeathKnight();
                    deathKnight.sEnemy();
                    currentEnemies.add(deathKnight);
                }
                else if(sEnemy == 1){
                    Siren siren = new Siren();
                    siren.sEnemy();
                    currentEnemies.add(siren);
                }
                else {
                    DemonHunter demonHunter = new DemonHunter("s");
                    demonHunter.sEnemy();
                    currentEnemies.add(demonHunter);
                }
                return currentEnemies;
            }
        }
        return currentEnemies;
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
     public void battle() {
         initializeEnemies();
         int temp;
         int enemyTemp = 0;
         boolean fighting = true;
         int numberOfEnemies = currentEnemies.size();
         int numberOfPlayers = players.size();
         System.out.println("------------LEVEL " + 2 + " --------------");
         System.out.println("Number of enemies are " + numberOfEnemies + "          |");
         System.out.println("information of your characters before the fight begins ");
         for (int i = 0; i < 3; i++) {
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
                         "It is " + fPlayers.get(choice - 1).getType() + " " + fPlayers.get(choice - 1).getCharacterName()
                                 + "'s turn.");
                 fPlayers.get(choice - 1).setTarget(currentEnemies.get(temp));
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
                             fPlayers.get(choice - 1).attack();
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
                             fPlayers.get(choice - 1).characterPrintInfo();
                             break;
                     }
                 }
                 if (fPlayers.get(choice - 1).getTarget().getHealth() <= 0) {
                     nDamage = -1 * (fPlayers.get(choice - 1).getTarget().getHealth());
                     fPlayers.get(choice - 1).getTarget().setHealth(0);

                 }
                 System.out.println(
                         "Current health of the enemy is " + fPlayers.get(choice - 1).getTarget().getHealth());


                 if (currentEnemies.get(temp).getHealth() <= 0) {
                     System.out.println(currentEnemies.get(temp).getName() + " is dead");
                     currentEnemies.remove(temp);
                 }

                 while (nDamage<0) {
                     for (int i = 0; i < currentEnemies.size(); i++) {
                         int n2Damage = sr.nextInt(0, (nDamage));
                         currentEnemies.get(i).setHealth(currentEnemies.get(i).getHealth() - n2Damage);
                         nDamage -= n2Damage;

                     }
                 }
                 numberOfEnemies = currentEnemies.size();
                 targeted = false;


                    /*for (int j = 0; j < fPlayers.size(); j++) {
                        if (fPlayers.get(j).getType().equals("Tank")) {
                            enemyTemp = j;
                        }
                    }
                    if(currentEnemies.get(temp).getIsStunned()){
                        continue;
                    }*/
                 if (numberOfEnemies == 1 || numberOfEnemies==0) {
                     temp = 0;
                 } else {
                     temp =sr.nextInt(0,currentEnemies.size()-1);
                 }
                // temp =sr.nextInt(0,currentEnemies.size()-1);
                 System.out.println(currentEnemies.size());
                 if(currentEnemies.size()>0) {
                     System.out.println("It is " + currentEnemies.get(temp).getName() + "'s turn ");
                     currentEnemies.get(temp).setTarget(fPlayers.get(choice - 1));
                     currentEnemies.get(temp).attack();

                     if (currentEnemies.get(temp).getTarget().getHealth() < 0) {
                         currentEnemies.get(temp).getTarget().setHealth(0);
                     }
                     if (currentEnemies.size() > 0) {
                         System.out.println("Current health of the " + currentEnemies.get(temp).getTarget().getCharacterName() + " is "
                                 + currentEnemies.get(temp).getTarget().getHealth());
                         currentEnemies.get(temp).setStunned(false);
                     }
                     if (currentEnemies.get(temp).getTarget().getHealth() <= 0) {
                         break;
                     }

                     if (fPlayers.get(enemyTemp).getHealth() <= 0) {
                         System.out.println(fPlayers.get(enemyTemp).getCharacterName() + " is dead");
                         fPlayers.remove(enemyTemp);
                         numberOfPlayers = fPlayers.size();
                         targeted = false;
                     }
                 }
             }
          if (numberOfEnemies == 0) {
             fighting = false;
             System.out.println("All enemies are dead..");
             System.out.println("LEVEL CLEARED");
             advRank++;
              System.out.println("Do you want to fight or go home?");
              System.out.println("press 1 to go home");
              System.out.println("press 2 to start a new fight");
              int choice1 = sc.nextInt();
              switch (choice1){
                  case 1:
                      location = new Home(players);
                      location.getLocation();
                      break;
                  case 2:
                      location = new Moonhallow(players);
                      location.getLocation();
                      break;

                  default:
                      System.out.println("You entered a number other than 1 or 2");
                      System.out.println("please enter one of these numbers");
              }

         }if (numberOfPlayers == 0) {
             fighting = false;
             System.out.println("All players are dead...");
             System.out.println("GAME OVER");
         }
     }

         }


    public void playerStats(Player player){
        System.out.println("Name: \t" +player.getCharacterName()+ " Health: " + player.getHealth() + " Damage: \t" + player.getDamage()+" Money: \t" + player.getAllMoney() );
        if(player.getDamage()>0){
            System.out.println("Weapon: " + player.getWeapons().getName());
        }
        if(player.getBlock()>0){
            System.out.println("Armor: " + player.getArmors().getName());
        }
    }
    public void enemyStats() {
        for (int i = 0; i < eCounter; i++) {
            System.out.println(currentEnemies.get(i).getName()+" Stats: ");
            System.out.println("Health: " + currentEnemies.get(i).getHealth() +"  Damege: \t" + currentEnemies.get(i).getDamage()+ "  Award: \t" + currentEnemies.get(i).getAward() );
        }
    }

}