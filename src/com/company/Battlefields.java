
package com.company;

        import java.io.*;
        import java.security.SecureRandom;
        import java.util.*;
        import java.util.Objects;

public abstract class Battlefields extends Location implements Locateable{
    private boolean round = true;
    private boolean a = false;
    private boolean electric = false;
    int enemyTemp;
    Characters chr = new Characters();
    Scanner sc = new Scanner(System.in);
    SecureRandom sr = new SecureRandom();
    private int nDamage;
    Location location;
    private ArrayList<Enemy> currentEnemies ;
    private ArrayList<Player> fPlayers = new ArrayList<>();
    private boolean isInv=true;

    public boolean isInv() {
        return isInv;
    }

    public void setInv(boolean inv) {
        isInv = inv;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public Battlefields(ArrayList<Player> players) {
        super(players);
        setAdvRank(getAdvRank()+1);
        this.currentEnemies = initializeEnemies();


    }
    public boolean getLocation (){
            battle();

        return true;
    }


    public ArrayList<Enemy> initializeEnemies() {//Creation of enemies based on universe level (two base universe level)

        currentEnemies = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, getAdvRank()); i++) {
            Enemy enemy = new Enemy(("enemy(" + (i + 1) + ")"));
            enemy.sEnemy();
            currentEnemies.add(enemy);
        }

        return currentEnemies;
    }
    public void fPlayer() {//determining characters to play on the battlefield

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
                    boolean firstCharacter = true;
                    while (firstCharacter) {
                        System.out.println("Which character do you want to fight (enter character's name)?");
                        System.out.print("first choice:");
                        String chChoice = sc.nextLine();
                        for (int i = 0; i < players.size(); i++) {
                            if (players.get(i).getCharacterName().equalsIgnoreCase(chChoice)) {
                                fPlayers.add(players.get(i));
                                System.out.println("character selected successfully");
                                firstCharacter = false;
                            }

                        }
                    }
                    boolean secondChoice = true;
                    while (secondChoice) {
                    System.out.print("second choice: ");
                    String chChoice2 = sc.nextLine();
                    if (fPlayers.get(0).getCharacterName().equalsIgnoreCase(chChoice2)) {
                          System.out.println("you cannot select a character you have chosen");
                            System.out.println("choose another character");
                        String choice4 = sc.nextLine();
                            for(int i = 0; i<players.size();i++){
                                if(players.get(i).getCharacterName().equalsIgnoreCase(choice4) && !players.get(0).getCharacterName().equalsIgnoreCase(choice4) ){
                                    fPlayers.add(players.get(i));
                                    System.out.println("character selected successfully");
                                    secondChoice=false;
                                }
                            }
                        }
                    else {
                        for (int i = 0; i < players.size(); i++) {
                            if (players.get(i).getCharacterName().equalsIgnoreCase(chChoice2)) {
                                fPlayers.add(players.get(i));
                                System.out.println("character selected successfully");
                                secondChoice = false;
                            }
                        }
                    }
                    }
                    boolean k = true;
                    while (k) {
                        System.out.print("third choice: ");
                        String choice2 = sc.nextLine();
                        if (fPlayers.get(0).getCharacterName().equalsIgnoreCase(choice2) || fPlayers.get(1).getCharacterName().equalsIgnoreCase(choice2)) {
                            System.out.println("you cannot select a character you have chosen");
                            System.out.println("choose another character");
                            String choice4 = sc.nextLine();
                            for (int i = 0; i < players.size(); i++) {
                                if (players.get(i).getCharacterName().equalsIgnoreCase(choice4) && (!players.get(0).getCharacterName().equalsIgnoreCase(choice2) || !players.get(1).getCharacterName().equalsIgnoreCase(choice2))) {
                                    fPlayers.add(players.get(i));
                                    System.out.println("character selected successfully");
                                    allCharactersDifferent =false;
                                    a = false;
                                    k = false;


                                }
                            }
                        } else {
                            for (int i = 0; i < players.size(); i++) {
                                if (players.get(i).getCharacterName().equalsIgnoreCase(choice2)) {
                                    fPlayers.add(players.get(i));
                                    System.out.println("character selected successfully");
                                    allCharactersDifferent =false;
                                    k = false;
                                }
                            }
                        }
                    }

                }
                again=false;
            }
            catch (InputMismatchException e) {
                System.out.println("The exception type is: "+ e);
                System.out.println("enter a new character name");
            }

        }

    }


    public void battle()  {//battlefield method.
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
                sc.nextLine();
                System.out.println(
                        "It is " + fPlayers.get(choice - 1).getType() + " " + fPlayers.get(choice - 1).getCharacterName()
                                + "'s turn.");
                fPlayers.get(choice - 1).setTarget(currentEnemies.get(temp));
                boolean menu = true;
                while (menu) {
                    System.out.println("------------------------------------------------------");
                    System.out.println("Here are your player options");
                    System.out.println("Enter attack to basic attack enemy(attack)");
                    System.out.println("Enter ability special to use special ability(ability)");
                    System.out.println("Enter inventory to display inventory(inventory)");
                    System.out.println("Enter display to display character information and stats(display)");
                    System.out.println("------------------------------------------------------");
                    String answer = sc.nextLine();
                    switch (answer) {
                        case "attack":
                            fPlayers.get(choice - 1).attack();
                            menu = false;
                            round =true;
                            break;

                        case "ability":
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
                                            d =false;

                                        }
                                    }
                                }

                                fPlayers.get(choice-1).cast();
                                menu = false;
                            }
                            else{
                                System.out.println("wait for one round to use it again because you used a previous turn ");
                            }
                            round = false;
                            break;
                        case "inventory":


                            System.out.println("rewards from enemies\n");
                            for(int i = 0; i<players.size();i++){
                                if(players.get(i).getInv()!=null){
                                    setInv(false);
                                    for(int j = 0; j<players.get(i).getInv().size();j++){
                                        players.get(i).getInv().get(j).display();
                                    }
                                }
                                targeted =false;
                            }
                            if(isInv()){
                                System.out.println("you do not have any rewards");
                                targeted = false;
                            }
                            break;

                        case "display":
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
                    fPlayers.get(choice-1).setScore(fPlayers.get(choice-1).getScore()+1);
                    System.out.println("enemy drop " + currentEnemies.get(temp).getAward().getName());
                    System.out.println("press f to add this item to the inventory");
                    String invChoice = sc.next();
                    System.out.println(currentEnemies.get(temp).getAward().getName() + " is picked by " + fPlayers.get(choice-1).getCharacterName());
                    fPlayers.get(choice-1).setMoney((int)Math.round(fPlayers.get(choice-1).getMoney() + currentEnemies.get(temp).getAward().getPriceOfItem()));
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
                    if(currentEnemies.get(temp).getElectricT()<3 && currentEnemies.get(temp).getElectrified()){
                        setElectric(true);
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
                if(electric){
                    currentEnemies.get(temp).setElectrified(true);
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


                System.out.println("Do you want to fight or go home?");
                System.out.println("press 1 to go home");
                System.out.println("press 2 to start a new fight");
                System.out.println("press 3 to wish ");
                System.out.println("press 4 to see the score");
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

                                    System.out.println("you are going back home...");
                                    location = new Home(players);
                                    location.getLocation();
                                    }
                        else{
                            System.out.println("you do not have enough Primogen");
                            System.out.println("you are going back home...");
                            location = new Home(players);
                            location.getLocation();
                        }
                        break;
                    case 4:
                        score();
                        System.out.println("back home now...");
                        location = new Home(players);
                        location.getLocation();
                        break;

                    default:
                        System.out.println("You entered a number other than 1, 2, 3 or 4");
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



    public void playerStats(Player player){//method to display brief player information
        System.out.println("Name:\t"+player.getCharacterName()+"\t Type: \t"+player.getType()+ "\t Health: \t" + player.getHealth() + "\t Damage: \t" + player.getDamage()+"\t Money: \t" + player.getAllMoney()+"\t Weapon: \t" + player.getWeapons().getName());
        if(player.getBlock()>0){
            System.out.println("Armor: " + player.getArmors().getName());
        }
    }
    public void enemyStats() {//method to display brief enemy information
        for (int i = 0; i <currentEnemies.size(); i++) {
            System.out.println(currentEnemies.get(i).getName()+" Stats: ");
            System.out.println("Health: \t" + currentEnemies.get(i).getHealth() +"\t Damege: \t" + currentEnemies.get(i).getDamage()+ "\t Award: \t" + currentEnemies.get(i).getAward().getName());
        }
    }
    public void score()  {//method that shows how many enemies each character has killed on the battlefield
        try {
            File file = new File("score.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            String playersScores = "Number of enemies killed by players "+"\n";
            FileWriter fWriter = new FileWriter(file, false);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write(playersScores);
            for (int i = 0; i < players.size(); i++) {
              bWriter.write("name: " + players.get(i).getCharacterName() + "score: " + players.get(i).getScore() +"\n");
            }
            bWriter.close();
            FileReader fReader = new FileReader(file);
            String line;
            BufferedReader bReader = new BufferedReader(fReader);
            while ((line = bReader.readLine()) != null) {
                System.out.println(line);
            }
            bReader.close();
        }
        catch (IOException e){
        }
    }

}