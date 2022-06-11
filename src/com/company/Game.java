package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Game {
     ArrayList<Player>players;
     Location location;
     Scanner sc = new Scanner(System.in);
     Characters characters = new Characters();



    public void logIn(){//method of informing about the game
        System.out.println("Welcome the game!!!");
        System.out.println("Before to start game, you have to know something....");
        System.out.println("Firstly, When you start the game, you will have characters with 3 different abilities , and have one wish. With this wish, you will get the character");
        System.out.println("Good luck!!!");
        System.out.println("You can further develop the character you get by wishing, or you can create new characters by wishing again with the Primogen you earn each time you fight.");
        System.out.println("the adventure rang and your character will start from the lowest level and each time you fight and get stronger the level of the adventure rang will change.");
        System.out.println("As the level of the adventure rang changes, the difficulty level of the enemies you encounter will increase.");
        System.out.println("Secondly, If you are not healthy enough, you can buy food with the coins you earned during the fight, or you can make your own with the materials you earned during the fight. You can also go home and increase your health");
        System.out.println("You can also buy items that will increase your character's powers.");
        System.out.println("You can collect objects on the ground when you press the f key.");
        System.out.println("Before fighting, you can get information about the enemies there, such as their damage value and health, and you can decide accordingly");
        System.out.println("VERY IMPORTANCE!!!, if you lose three character against the enemy you will die");
        System.out.println("and the game is over :(");
        System.out.println("if you want to start now, press s");
        String start = sc.next();
        if(start.equalsIgnoreCase("s")) {
            players = characters.yourCharacters();
            for (int i = 0; i < players.size(); i++) {
                players.get(i).characterPrintInfo();
            }
            System.out.println("You have one wish");
            System.out.println("press w to make, good luck :)");
            String wish = sc.next();
            if(wish.equalsIgnoreCase("w")) {
                characters.wishCharacter();
                characters.wishCharacterPrintInfo(players.get(players.size() - 1));
            }
        }


    }
    public static void safePlace(){
        System.out.println("press 1 to return home");
        System.out.println("press 2 to go to the food shop");
        System.out.println("press 3 to go to the weapons shop");
        System.out.println("press 4 to go to the cloths shop");
        System.out.println("press 5 to view characters again");
        System.out.println("press 6 to exit safe areas");
        System.out.println("Where do you want to go ?");
    }
    public void firstPagePrintInfo(){
        System.out.println("Characters Information");
        System.out.println("--------------------------");
        System.out.println("press 1 for information about Wizards");
        System.out.println("press 2 for information about Worriers");
        System.out.println("press 3 for information about Elves");
        System.out.println("press 4 for information about Knight");
        System.out.println("press 5 for information about Lancer");
        System.out.println("press 6 for information about Healer");
        System.out.println("press 7 to exit this page");
        System.out.println("Your choice ?");
    }

    public  void charactersInfo(){//method of informing about the characters in the game
        firstPagePrintInfo();
        boolean d = true;
        while (d){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Information of the wizards in the game");
                    for(int i = 0 ; i<5;i++) {
                        characters.getCharacters().get(0).get(i).selectC();
                        characters.getCharacters().get(0).get(i).characterPrintInfo();


                    }
                    firstPagePrintInfo();
                    break;
                case 2:
                    System.out.println("Information of the worrier in the game");
                    for(int i = 0 ; i<5;i++) {
                        characters.getCharacters().get(1).get(i).selectC();
                        characters.getCharacters().get(1).get(i).characterPrintInfo();

                    }
                    firstPagePrintInfo();
                    break;
                case 3:
                    System.out.println("Information of the elves in the game");
                    for(int i = 0 ; i<5;i++) {
                        characters.getCharacters().get(3).get(i).selectC();
                        characters.getCharacters().get(3).get(i).characterPrintInfo();
                    }
                    firstPagePrintInfo();
                    break;
                case 4:
                    System.out.println("Information of the knights in the game");
                    for(int i = 0 ; i<5;i++) {
                        characters.getCharacters().get(2).get(i).selectC();
                        characters.getCharacters().get(2).get(i).characterPrintInfo();

                    }
                    firstPagePrintInfo();

                    break;
                case 5:
                    System.out.println("Information of the lancers in the game");
                    for(int i = 0 ; i<5;i++) {
                        characters.getCharacters().get(4).get(i).selectC();
                        characters.getCharacters().get(4).get(i).characterPrintInfo();

                    }
                    firstPagePrintInfo();
                    break;
                case 6:
                    System.out.println("Information of the healer in the game");
                    for(int i = 0 ; i<5;i++) {
                        characters.getCharacters().get(5).get(i).selectC();
                        characters.getCharacters().get(5).get(i).characterPrintInfo();

                    }
                    firstPagePrintInfo();
                    break;
                case 7:
                    firstPagePrintInfo();
                    break;
                case 8:
                    location = new Home(players);
                    location.getLocation();
                    d = false;
                    break;

                default:
                    System.out.println("You entered a number different from the numbers 1 to 7. Please enter one of the numbers from 1 to 7.");
                    System.out.println("Your choice ?");
                    break;

            }

        }

    }
    public static void mapList(){
        System.out.println();
        System.out.println("currently displaying areas.....");
        System.out.println("press 1 to view safe areas");
        System.out.println("press 2 to view battlefields");
        System.out.println("press 3 to leave this page");
        System.out.println("Where do you want to go ?");
    }
    public void map(){
        mapList();
        boolean a = true;
         while (a) {
             int choice = sc.nextInt();
             switch (choice) {
                 case 1:
                   safePlace();

                     boolean b = true;
                     while (b) {
                         int number =sc.nextInt();
                         switch (number) {
                             case 1:
                                 location = new Home(players);
                                 location.getLocation();

                                 break;
                             case 2:
                                 location = new FoodShop(players);
                                 location.getLocation();

                                 break;
                             case 3:

                                 location = new WeaponsShop(players);
                                 location.getLocation();
                                 break;
                             case 4:
                                 location = new ArmorsShop(players);
                                 location.getLocation();
                                 break;

                             case 5:
                                 System.out.println();
                                 charactersInfo();
                                 mapList();
                                 break;
                             case 6:
                                 System.out.println("Exiting safe areas");
                                 b = false;
                                 mapList();
                                 break;
                             default:
                                 System.out.println("You entered numbers other than 1, 2, 3, 4,5,6. Please enter one of these numbers");
                                 break;
                         }

                     }
                     break;
                 case 2:
                     System.out.println("press 1 to Moonhallow. ");
                     System.out.println("press 2 to go to first page");
                     System.out.println("Where do you want to go ?");
                     int number2 = sc.nextInt();
                    switch (number2){
                         case 1:
                             location = new Moonhallow(players);
                             location.getLocation();
                     }
                     break;

                 case 3:
                     System.out.println("currently leaving this page....");
                     a=false;
                     break;

                 default:
                     System.out.println("You entered a character other than 1 , 2 or 3 !!!");
                     System.out.println("Please enter the numbers 1 , 2 or 3");
                     System.out.println("Your choice ?");
                     break;
             }
         }

    }


}