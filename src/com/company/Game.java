package com.company;

import java.util.Scanner;

public class Game {
    static Player player; // static ??
    static Location location; // static ???
    static Scanner sc = new Scanner(System.in);

    public void logIn(){
        System.out.println("Welcome the game!!!");
        System.out.println("Before to start game, you have to know something....");
        System.out.println("Firstly, When you start the game, you will have characters with 3 different abilities , and have one wish. With this wish, you will get the character or items that will help you during the game, such as weapons..");
        System.out.println("Good luck!!!");
        System.out.println("You can further develop the character you get by wishing, or you can create new characters by wishing again with the Primogen you earn each time you fight.");
        System.out.println("the adventure rang and your character will start from the lowest level and each time you fight and get stronger the level of the adventure rang will change.");
        System.out.println("As the level of the adventure rang changes, the difficulty level of the enemies you encounter will increase.");
        System.out.println("Secondly, If you are not healthy enough, you can buy food with the coins you earned during the fight, or you can make your own with the materials you earned during the fight. You can also go home and increase your health");
        System.out.println("You can also buy items that will increase your character's powers.");
        System.out.println("if you press the m key on the keyboard, you will see the game map");
        System.out.println("You can collect objects on the ground when you press the f key.");
        System.out.println("Finally, You may encounter different numbers and different enemies in every battlefield you go to.");
        System.out.println("Before fighting, you can get information about the enemies there, such as their damage value and health, and you can decide accordingly. Fight or run");
        System.out.println("DO NOT FORGET, if you lose your one character against the enemy you will lose 10 Primogen, if you you lose your two characters against the enemy you will lose 10 Primogen");
        System.out.println("VERY IMPORTANCE!!!, if you lose three character against the enemy you will die");
        System.out.println("and the game is over :(");
        System.out.println("You can start now , have fun :)");
        System.out.println();
        //player= new Wizard("Wizard","Barbara",100); //


       /* System.out.println("Information of the wizards in the game");
        System.out.println("------------------------------------------");
        System.out.println(player);
        System.out.println("n: " + player.getCharacterName());
        System.out.println("i: " + player.changeIntelligence());
        System.out.println("s: " + player.changeStrenght());
        System.out.println("v: " + player.changeVitality());
        System.out.println("h: " + player.healthPoint());
        System.out.println("r: " + player.rarity());
        System.out.println("rh " + player.getrHealthy());*/

        for(int i = 0 ; i< 1; i++){
            Characters characters = new Characters();
            player = characters.wizardsGet().get(i);
            Characters.wizardPrintInfo();
            System.out.println(player.getCharacterName());
        }

    }

    public static void charactersInfo(){
        System.out.println("Characters Information");
        System.out.println("--------------------------");
        System.out.println("press 1 for information about Wizards");
        System.out.println("press 2 for information about Worriers");
        System.out.println("press 3 for information about Elves");
        System.out.println("press 4 for information about Knight");
        System.out.println("press 5 for information about Lancer");
        System.out.println("press 6 to go to first page");
        System.out.println("press 7 to exit this page");
        System.out.println("Your choice ?");
        int choice = sc.nextInt();

        boolean b = true;
        while (b){
            switch (choice){
                case 1:
                    System.out.println("Character's name: \t" + "Character's weapon: \t" + "Character's ability: \t" + "Character's rarity: \t" + "Character's money: \t" + "Character's health: \t" + "Character's damage: \t\n" );
                    for(int i = 0 ; i< 5; i++){
                        Characters characters = new Characters();
                        player = characters.wizardsGet().get(i);
                        Characters.wizardPrintInfo();
                        System.out.println("Character's name: \t" + "Character's weapon: \t" + "Character's ability: \t" + "Character's rarity: \t" + "Character's money: \t" + "Character's health: \t" + "Character's damage: \t\n" );
                       // System.out.println(player.getCharacterName() \n + player.);


                    }


            }

        }

    }
    public static void mapList(){
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("currently displaying the map.....");
        System.out.println("press 1 to view safe areas");
        System.out.println("press 2 to view battlefields");
        System.out.println("press 3 to leave this page");
        System.out.println("Where do you want to go ?");
    }
    public void map(){
        mapList();
            int choice = sc.nextInt();
         boolean a = true;
         while (a) {
             switch (choice) {
                 case 1:
                     System.out.println("press 1 to return home");
                     System.out.println("press 2 to go to the food shop");
                     System.out.println("press 3 to go to the weapons shop");
                     System.out.println("press 4 to go to the cloths shop");
                     System.out.println("press 5 to go to first page");
                     System.out.println("Where do you want to go ?");
                     int number =sc.nextInt();
                     switch (number){
                         case 1:
                           location = new Home(player);
                           location.getLocation();

                           break;
                         case 2:
                             location = new FoodShop(player);
                             location.getLocation();

                             break;
                         case 3:
                             location = new WeaponsShop(player);
                             location.getLocation();

                             break;
                         case 4:
                             location = new ClothsShop(player);
                             location.getLocation();

                             break;
                         case 5:
                             mapList();
                             choice = sc.nextInt();
                             break;
                         default:
                             System.out.println("You entered numbers other than 1, 2, 3, 4. Please enter one of these numbers");
                             break;
                     }
                     break;

                 case 2:
                     System.out.println("press 1 to Moonhallow. In this area, you may encounter siren or demon hunter. ");
                     System.out.println("press 2 to Wildfront. In this area, you may encounter goblin, rouge or monk ");
                     System.out.println("press 3 to Oceangulf. In this, you may encounter death knight, demon hunter or siren ");
                     System.out.println("press 4 to go to first page");
                     System.out.println("Where do you want to go ?");
                     int number2 = sc.nextInt();
                    /* switch (number2){
                         case 1:
                             location = new Moonhallow(player,)
                     }
                     break;*/

                 case 3:
                     System.out.println("currently leaving this page....");
                     a=false;
                     break;

                 default:
                     System.out.println("You entered a character other than 1 , 2 or 3 !!!");
                     System.out.println("Please enter the numbers 1 , 2 or 3");
                     System.out.println("Your choice ?");
                     choice = sc.nextInt();
                     break;
             }
         }

    }

}
