
package com.company;

        import java.security.SecureRandom;
        import java.util.ArrayList;
        import java.util.Objects;
        import java.util.Scanner;

public abstract class Battlefields extends Location implements Locateable{
    private boolean round = true;
    private boolean a = false;
    int enemyTemp;
    Characters chr = new Characters();
    Scanner sc = new Scanner(System.in);
    SecureRandom sr = new SecureRandom();
    private int nDamage;
    Location location;
    private ArrayList<Enemy> currentEnemies ;
    private ArrayList<Player> fPlayers = new ArrayList<>();



    public Battlefields(ArrayList<Player> players) {
        super(players);
        setAdvRank(getAdvRank()+1);
        this.currentEnemies = initializeEnemies();


    }
    public boolean getLocation(){
        if(fPlayers.size()==3){
            battle();
        }
        else{
            for(int i=0;i<fPlayers.size();i++){
                fPlayers.remove(fPlayers.get(i));
            }
            System.out.println("sorry there was a technical problem");
            System.out.println("you enter the battlefield again");
            battle();
        }

        return true;
    }


    public ArrayList<Enemy> initializeEnemies() {
        currentEnemies = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, getAdvRank()); i++) {
            Enemy enemy = new Enemy(("enemy(" + (i + 1) + ")"));
            enemy.sEnemy();
            currentEnemies.add(enemy);
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
        boolean again = true;
        while (again) {
            try {
                System.out.println();
                boolean allCharactersDifferent = true;
                while (allCharactersDifferent) {
                    System.out.println("Which rank do you want to fight with your characters?");
                    System.out.print("first choice:");
                    int choice = sc.nextInt();
                    fPlayers.add(players.get(choice-1));
                    System.out.print("second choice: ");
                    int choice1 = sc.nextInt();
                    if (players.get(choice - 1) == players.get(choice1 - 1) ) {
                        boolean a = true;
                        while (a) {
                            System.out.println("you cannot select a character you have chosen");
                            System.out.println("choose another character");
                            int choice4 = sc.nextInt();
                            if(players.get(choice-1) != players.get(choice4-1)) {
                                fPlayers.add(players.get(choice4 - 1));
                                a = false;
                            }
                        }
                    }
                    else{
                        fPlayers.add(players.get(choice1-1));
                    }
                    System.out.print("third choice: ");
                    int choice2 = sc.nextInt();
                    if (players.get(choice-1) == players.get(choice2 - 1) || fPlayers.get(1)==players.get(choice2-1))  {
                        boolean k = true;
                        while (k) {
                            System.out.println("you cannot select a character you have chosen");
                            System.out.println("choose another character");
                            int choice4 = sc.nextInt();
                            if (players.get(choice-1) != players.get(choice4 - 1) && fPlayers.get(1)!=players.get(choice4-1))  {
                                fPlayers.add(players.get(choice4 - 1));
                                k = false;
                                allCharactersDifferent =false;
                            }
                        }
                    }
                    else{
                        fPlayers.add(players.get(choice2-1));
                        allCharactersDifferent =false;
                    }

                }
                again=false;
            }
            catch (Exception e) {
                System.out.println("The exception type is: "+ e);
                System.out.println("Please enter only integer numbers!" );
                sc.next();
            }

        }

    }


    public void battle() {
        initializeEnemies();
        fPlayer();
        int temp;
        boolean fighting = true;
        int numberOfEnemies = currentEnemies.size();
        int numberOfPlayers = players.size();
        System.out.println("------------LEVEL " + getAdvRank() + " --------------");
        System.out.println("Number of enemies are " + numberOfEnemies );
        System.out.println("information of your characters before the fight begins ");
        for (int i = 0; i < 3; i++) {
            playerStats(fPlayers.get(i));
        }
        System.out.println("press i to get information about enemies before battle");
        String enemyInfoChoice = sc.next();
        if(enemyInfoChoice.equalsIgnoreCase("i")) {
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
                for(int i = 0; i<fPlayers.size();i++) {
                    System.out.println("press "+ (i+1 ) + " " + fPlayers.get(i).getCharacterName());
                }
                int choice = sc.nextInt();
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
                            round =true;
                            break;

                        case 2:
                            if(round) {
                                if(fPlayers.get(choice-1).getType().equals("Healer")) {
                                    Player ally = fPlayers.get(choice - 1);
                                    boolean c = true;
                                    while (c) {
                                        if(fPlayers.size()>1){
                                            for (int i = 0; i < fPlayers.size(); i++) {
                                                if ((ally.getrHealthy() - ally.getHealth()) <=(fPlayers.get(i).getrHealthy() - fPlayers.get(i).getHealth())) {
                                                    ally = fPlayers.get(i);
                                                    fPlayers.get(choice - 1).setAlly(ally);
                                                    c = false;
                                                    break;
                                                }
                                            }}
                                        else{
                                            fPlayers.get(choice - 1).setAlly(fPlayers.get(choice-1));
                                            break;
                                        }
                                    }
                                }
                                if (fPlayers.get(choice - 1).getType().equals("Elf")) {
                                    boolean d = true;
                                    while (d) {
                                        if(currentEnemies.size()>1){
                                            for(int i = 0; i<currentEnemies.size();i++){
                                                Enemy allyEnemy = currentEnemies.get(i);
                                                if(!Objects.equals(allyEnemy.getName(), currentEnemies.get(temp).getName())){
                                                    currentEnemies.get(temp).setAllyEnemy(allyEnemy);
                                                    d = false;
                                                }
                                            }
                                        }else{
                                            System.out.println("one enemy is here!!! ");
                                            currentEnemies.get(temp).setAllyEnemy(currentEnemies.get(temp));

                                        }
                                    }
                                }

                                fPlayers.get(choice-1).cast();
                                menu = false;
                            }
                            else{
                                System.out.println("wait for one round to use it again because you used a previous turn ability");
                            }
                            round = false;
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

                if (currentEnemies.get(temp).getHealth() <= 0) {
                    if(currentEnemies.get(temp).getNormalAttack()){
                        a = true;
                    }
                    System.out.println(currentEnemies.get(temp).getName() + " is dead");
                    System.out.println("enemy drop " + currentEnemies.get(temp).getAward().getName());
                    System.out.println("press f to add this item to the inventory");
                    String invChoice = sc.next();
                    if(invChoice.equalsIgnoreCase("f")){
                        players.get(0).getInv().add(currentEnemies.get(temp).getAward());
                    }
                    nDamage=currentEnemies.get(temp).getHealth();
                    boolean n = true;
                    while (n) {
                        nDamage*=-1;
                        for (int i = 0; i < currentEnemies.size(); i++) {
                            if(nDamage%2==0){
                                currentEnemies.get(i).setHealth(currentEnemies.get(i).getHealth()-(nDamage/2));
                                nDamage/=2;
                            }
                            else if(nDamage%3==0){
                                currentEnemies.get(i).setHealth(currentEnemies.get(i).getHealth()-(nDamage/3));
                                nDamage/=3;

                            }
                            else {
                                currentEnemies.get(i).setHealth(currentEnemies.get(i).getHealth() - 1);
                                nDamage-=1;
                            }
                            if(nDamage == 0){
                                n = false;
                            }
                        }
                    }
                    currentEnemies.remove(temp);
                }

                numberOfEnemies = currentEnemies.size();
                targeted = false;

                if (numberOfEnemies == 1 || numberOfEnemies==0) {
                    temp = 0;
                } else {
                    temp =sr.nextInt(0,currentEnemies.size()-1);
                }
                if(a){
                    if(currentEnemies.size()>0) {
                        currentEnemies.get(temp).setNormalAttack(true);
                    }
                }
                if(currentEnemies.size()>0) {
                    System.out.println("It is " + currentEnemies.get(temp).getName() + "'s turn ");
                    for (int j = 0; j < fPlayers.size(); j++) {
                        if (fPlayers.get(j).getType().equals("Tank")) {
                            enemyTemp = j;
                            currentEnemies.get(temp).setTarget(fPlayers.get(enemyTemp));
                        }
                        else
                            currentEnemies.get(temp).setTarget(fPlayers.get(choice-1));
                    }
                    currentEnemies.get(temp).attack();

                    if (currentEnemies.get(temp).getTarget().getHealth() < 0) {
                        currentEnemies.get(temp).getTarget().setHealth(0);
                    }
                    if (currentEnemies.size() > 0) {
                        System.out.println("Current health of the " + currentEnemies.get(temp).getTarget().getCharacterName() + " is "
                                + currentEnemies.get(temp).getTarget().getHealth());
                    }
                    if (currentEnemies.get(temp).getTarget().getHealth() <= 0) {
                        System.out.println(fPlayers.get(choice-1).getCharacterName() + " is dead");
                        fPlayers.remove(choice-1);
                        numberOfPlayers = fPlayers.size();

                    }
                }

            }
            if (numberOfEnemies == 0) {
                fighting = false;
                System.out.println("All enemies are dead..");
                System.out.println("LEVEL CLEARED");

                for(int i = 0; i < players.get(0).getInv().size();i++){
                    System.out.println("inv print");
                    players.get(0).getInv().get(i).weaponsPrintInfo();
                }

                System.out.println("Do you want to fight or go home?");
                System.out.println("press 1 to go home");
                System.out.println("press 2 to start a new fight");
                System.out.println("press 3 to wish ");
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
                    case 3:
                        int totalPrimogen = 0;
                        for(int i = 0; i<players.get(0).getInv().size();i++) {
                            if (players.get(0).getInv().get(i).getName().equals("Primogen")) {
                                totalPrimogen++;
                            }
                        }
                        if (totalPrimogen > 10) {
                                    System.out.println("You have one wish");
                                    System.out.println("press w to make, good luck :)");
                                    String wish = sc.next();
                                    if (wish.equalsIgnoreCase("w")) {
                                        chr.wishCharacter();
                                        chr.wishCharacterPrintInfo(players.get(players.size() - 1));
                                    }
                                    System.out.println("back home now...");
                                    location = new Home(players);
                                    location.getLocation();
                                    //players.get(0).getInv().get(0).setPrimogen(players.get(0).getInv().get(0).getPrimogen()-10);
                                    }
                        else{
                            System.out.println("you do not have enough Primogen");
                            System.out.println("back home now...");
                            location = new Home(players);
                            location.getLocation();
                        }
                    default:
                        System.out.println("You entered a number other than 1, 2 or 3");
                        System.out.println("please enter one of these numbers");
                }

            }if (numberOfPlayers == 0) {
                fighting = false;
                System.out.println("All players are dead...");
                System.out.println("GAME OVER");
                System.exit(0);
            }
        }

    }



    public void playerStats(Player player){
        System.out.println("Name: \t"+player.getCharacterName()+"\t Type: \t"+player.getType()+ "\t Health: \t" + player.getHealth() + "\t Damage: \t" + player.getDamage()+"\t Money: \t" + player.getAllMoney()+"\t Weapon: \t" + player.getWeapons().getName());
        if(player.getBlock()>0){
            System.out.println("Armor: " + player.getArmors().getName());
        }
    }
    public void enemyStats() {
        for (int i = 0; i <currentEnemies.size(); i++) {
            System.out.println(currentEnemies.get(i).getName()+" Stats: ");
            System.out.println("Health: \t" + currentEnemies.get(i).getHealth() +"\t Damege: \t" + currentEnemies.get(i).getDamage()+ "\t Award: \t" + currentEnemies.get(i).getAward().getName());
        }
    }

}