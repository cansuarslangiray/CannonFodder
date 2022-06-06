

package com.company;

        import java.security.SecureRandom;
        import java.util.ArrayList;
        import java.util.Scanner;

public abstract class Battlefields extends Location implements Locateable {
    private ArrayList<Integer> abilityCharacters;
    private boolean round = true;
    private boolean round2 = true;
    int enemyTemp;
    int advRank = 0;
    Scanner sc = new Scanner(System.in);
    SecureRandom sr = new SecureRandom();
    private int nDamage;
    Location location;
    private ArrayList<Enemy> currentEnemies;
    private ArrayList<Player> fPlayers = new ArrayList<>();

    public ArrayList<Integer> getAbilityCharacters() {
        return abilityCharacters;
    }

    public void setAbilityCharacters(ArrayList<Integer> abilityCharacters) {
        this.abilityCharacters = abilityCharacters;
    }

    public Battlefields(ArrayList<Player> players) {
        super(players);
        this.currentEnemies = initializeEnemies();
    }

    public boolean getLocation() {
        return true;
    }


    public ArrayList<Enemy> initializeEnemies() {
        currentEnemies = new ArrayList<>();
        if (advRank == 0) {
            for (int i = 0; i < Math.pow(2, 2); i++) {
                Enemy enemy = new Enemy(("enemy(" + (i + 1) + ")"));
                enemy.sEnemy();
                currentEnemies.add(enemy);
            }
        } else {
            for (int i = 0; i < Math.pow(2, advRank); i++) {
                Enemy enemy = new Enemy(("enemy(" + (i + 1) + ")"));
                enemy.sEnemy();
                currentEnemies.add(enemy);
            }
        }
        return currentEnemies;
    }

    public void fPlayer() {
        System.out.println();
        System.out.println("You have to choose 3 of your characters to fight before you start the match ");
        System.out.println("information of your characters ");
        int counterCh = 0;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getHealth() > 0) {
                System.out.println((i + 1) + ".character");
                playerStats(players.get(i));
                counterCh++;
            }
        }
        if (counterCh < 3) {
            System.out.println("you don't have enough characters to fight");
            System.out.println("so you come back home again");
            location = new Home(players);
            location.getLocation();

        }
        System.out.println();
        System.out.println("Which rank do you want to fight with your characters?");
        System.out.print("first choice:");
        int choice = sc.nextInt();
        System.out.print("second choice: ");
        int choice1 = sc.nextInt();
        System.out.print("third choice: ");
        int choice2 = sc.nextInt();
        fPlayers.add(players.get(choice - 1));
        fPlayers.add(players.get(choice1 - 1));
        fPlayers.add(players.get(choice2 - 1));

    }

    public void battle() {
        abilityCharacters = new ArrayList<>();
        initializeEnemies();
        int temp;
        boolean fighting = true;
        int numberOfEnemies = currentEnemies.size();
        int numberOfPlayers = players.size();
        System.out.println();
        if (advRank == 0) {
            System.out.println("------------LEVEL " + 1 + " --------------");
        } else {
            System.out.println("------------LEVEL " + advRank + " --------------");
        }
        System.out.println("Number of enemies are " + numberOfEnemies);
        System.out.println("information of your characters before the fight begins ");
        for (int i = 0; i < 3; i++) {
            playerStats(fPlayers.get(i));
        }
        System.out.println("press i to get information about enemies before battle");
        String enemyInfoChoice = sc.next();
        if (enemyInfoChoice.equalsIgnoreCase("i")) {
            System.out.println("information of enemies before the fight begins ");
            enemyStats();
        }
        System.out.println();
        System.out.println("The fight begins...");
        while (fighting) {
            boolean targeted = true;
            if (numberOfEnemies == 1) {
                temp = 0;
            } else {
                temp = sr.nextInt(0, numberOfEnemies - 1);
            }
            while (targeted) {

                System.out.println("choose the character you will fight: ");
                for (int i = 0; i < fPlayers.size(); i++) {
                    System.out.println("press " + (i + 1) + " " + fPlayers.get(i).getCharacterName());
                }
                int choice = sc.nextInt();
                abilityCharacters.add(choice);
                System.out.println(
                        "It is " + fPlayers.get(choice - 1).getType() + " " + fPlayers.get(choice - 1).getCharacterName()
                                + "'s turn.");
                fPlayers.get(choice - 1).setTarget(currentEnemies.get(temp));
                boolean menu = true;
                while (menu) {
                    System.out.println("------------------------------------------------------");
                    System.out.println("Here are your player options");
                    System.out.println("Enter 1 to basic attack enemy");
                    System.out.println("Enter 2 to use special ability");
                    System.out.println("Enter 3 to display inventory");
                    System.out.println("Enter 4 to display character information and stats");
                    System.out.println("------------------------------------------------------");
                    int answer = sc.nextInt();
                    switch (answer) {
                        case 1:
                            fPlayers.get(choice - 1).attack();
                            menu = false;
                            round = true;
                            round2 = false;
                            break;

                        case 2:
                            if (round) {
                                if (fPlayers.get(choice - 1).getType().equals("Healer")) {
                                    Player ally = fPlayers.get(choice - 1);
                                    for (int i = 0; i < fPlayers.size(); i++) {
                                        if (ally.getHealth() < fPlayers.get(i).getHealth()) {
                                            ally = fPlayers.get(i);
                                            fPlayers.get(choice - 1).setAlly(ally);
                                        }
                                    }
                                }
                                fPlayers.get(choice - 1).cast();
                                menu = false;
                                round2 = true;
                            }
                            if (round2) {
                                System.out.println("Do you want to use the normal special ability or the other (Hydro, Electro, Cyro)?");
                                System.out.println("press 1 for normal skill");
                                System.out.println("press 2 for other skill");
                                int specialAbilityChoice = sc.nextInt();
                                switch (specialAbilityChoice) {
                                    case 1:
                                        fPlayers.get(choice - 1).cast();
                                        break;
                                    case 2:
                                        ability();
                                        break;
                                    default:
                                        System.out.println("You entered a number other than 1 or 2");
                                        System.out.println("Enter 1 or 2");
                                        break;
                                }

                            } else {
                                System.out.println("wait for one round to use it again because you used a previous turn talent");
                            }
                            round = false;
                            round2 = false;
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
                    fPlayers.get(choice - 1).getTarget().setHealth(0);
                }
                System.out.println(
                        "Current health of the enemy is " + fPlayers.get(choice - 1).getTarget().getHealth());


                if (currentEnemies.get(temp).getHealth() <= 0) {
                    System.out.println(currentEnemies.get(temp).getName() + " is dead");
                    nDamage = currentEnemies.get(temp).getHealth();
                    boolean n = true;
                    while (n) {
                        nDamage *= -1;
                        for (int i = 0; i < currentEnemies.size(); i++) {
                            if (nDamage % 2 == 0) {
                                currentEnemies.get(i).setHealth(currentEnemies.get(i).getHealth() - (nDamage / 2));
                                nDamage /= 2;
                            } else if (nDamage % 3 == 0) {
                                currentEnemies.get(i).setHealth(currentEnemies.get(i).getHealth() - (nDamage / 3));
                                nDamage /= 3;

                            } else {
                                currentEnemies.get(i).setHealth(currentEnemies.get(i).getHealth() - 1);
                                nDamage -= 1;
                            }
                            if (nDamage == 0) {
                                n = false;
                            }
                        }
                    }
                    currentEnemies.remove(temp);
                }

                numberOfEnemies = currentEnemies.size();
                targeted = false;

                if (numberOfEnemies == 1 || numberOfEnemies == 0) {
                    temp = 0;
                } else {
                    temp = sr.nextInt(0, currentEnemies.size() - 1);
                }

                System.out.println(currentEnemies.size());
                if (currentEnemies.size() > 0) {
                    System.out.println("It is " + currentEnemies.get(temp).getName() + "'s turn ");
                    for (int j = 0; j < fPlayers.size(); j++) {
                        if (fPlayers.get(j).getType().equals("Tank")) {
                            enemyTemp = j;
                            currentEnemies.get(temp).setTarget(fPlayers.get(enemyTemp));
                        } else
                            currentEnemies.get(temp).setTarget(fPlayers.get(choice - 1));
                    }
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
                        System.out.println(fPlayers.get(choice - 1).getCharacterName() + " is dead");
                        fPlayers.remove(choice - 1);
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
                switch (choice1) {
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

            }
            if (numberOfPlayers == 0) {
                fighting = false;
                System.out.println("All players are dead...");
                System.out.println("GAME OVER");
            }
        }

    }

    public void ability() {
        if (abilityCharacters.size() > 1) {
            for (int i = abilityCharacters.size(); i >= 0; i--) {
                if (fPlayers.get(abilityCharacters.get(i - 1)).getAbilityType().equals("Hydro") && fPlayers.get(abilityCharacters.get(i - 2)).getAbilityType().equals("Electro") || fPlayers.get(abilityCharacters.get(i - 2)).getAbilityType().equals("Hydro") && fPlayers.get(abilityCharacters.get(i - 1)).getAbilityType().equals("Electro")) {
                    System.out.println(fPlayers.get(i - 1).getCharacterName() + " is attacking with electro " + fPlayers.get(abilityCharacters.size()).getTarget().getName() + "...");
                    fPlayers.get(i - 1).getTarget().setHealth(fPlayers.get(i - 1).getTarget().getHealth() - fPlayers.get(i - 1).getAbilityType().getAbilityDamage());
                    System.out.println(fPlayers.get(i - 1).getCharacterName() + " damaged " + fPlayers.get(i - 1).getTarget().getName() + " for " + fPlayers.get(i - 1).getAbilityType().getAbilityDamage() + " damage.");
                    System.out.println("will electrocute enemies for three rounds");
                    for (int j = 0; j < currentEnemies.size(); j++) {
                        currentEnemies.get(j).setElectrified(true);
                    }
                }
            }
            for (int i = abilityCharacters.size(); i >= 0; i--) {
                if (fPlayers.get(abilityCharacters.get(i - 1)).getAbilityType().equals("Hydro") && fPlayers.get(abilityCharacters.get(i - 2)).getAbilityType().equals("Cryo") || fPlayers.get(abilityCharacters.get(i - 2)).getAbilityType().equals("Hydro") && fPlayers.get(abilityCharacters.get(i - 1)).getAbilityType().equals("Cryo")) {
                    System.out.println("all enemies are frozen");
                    for (int j = 0; j < currentEnemies.size(); j++) {
                        currentEnemies.get(j).setStunned(true);
                    }
                }
            }
            for (int i = abilityCharacters.size(); i >= 0; i--) {
                if (fPlayers.get(abilityCharacters.get(i - 1)).getAbilityType().equals("Electro") && fPlayers.get(abilityCharacters.get(i - 2)).getAbilityType().equals("Cryo") || fPlayers.get(abilityCharacters.get(i - 2)).getAbilityType().equals("Electro") && fPlayers.get(abilityCharacters.get(i - 1)).getAbilityType().equals("Cryo")) {
                    for (int j = 0; j < currentEnemies.size(); j++) {
                        currentEnemies.get(j).setPhysicalResistance(currentEnemies.get(i).getPhysicalResistance() % 20);
                    }
                }
            }
            for (int i = abilityCharacters.size(); i >= 0; i--) {
                System.out.println("physical resistance of all enemies decreased by 20%");
                if (fPlayers.get(abilityCharacters.size()).getTarget().getPhysicalResistance() <= 0) {
                    fPlayers.get(abilityCharacters.size()).getTarget().setPhysicalResistance(0);
                    System.out.println(fPlayers.get(abilityCharacters.size()).getTarget().getName() + " is dead");
                    currentEnemies.remove(fPlayers.get(abilityCharacters.size()).getTarget());

                }
            }


        }
    }

    public void playerStats(Player player) {
        System.out.println("Name: \t" + player.getCharacterName() + "\t Type: \t" + player.getType() + "\t Health: \t" + player.getHealth() + "\t Damage: \t" + player.getDamage() + "\t Money: \t" + player.getAllMoney() + "\t Weapon: \t" + player.getWeapons().getName());
        if (player.getBlock() > 0) {
            System.out.println("Armor: " + player.getArmors().getName());
        }
    }

    public void enemyStats() {
        for (int i = 0; i < currentEnemies.size(); i++) {
            System.out.println(currentEnemies.get(i).getName() + " Stats: ");
            System.out.println("Health: \t" + currentEnemies.get(i).getHealth() + "\t Damege: \t" + currentEnemies.get(i).getDamage() + "\t Award: \t" + currentEnemies.get(i).getAward());
        }
    }


}

