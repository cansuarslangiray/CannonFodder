package com.company;

import java.util.Scanner;

public class Game {
    static Player player; // static ??
    static Location location; // static ???


    public static void logIn(){
        Scanner sc = new Scanner(System.in);
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
        //Wizard.wizardPrintInfo();

    }
    public static void map(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("currently displaying the map.....");
        System.out.println("press 1 to view safe areas");
        System.out.println("press 2 to view battlefields");
        System.out.println("press 3 to leave this page");
        System.out.println("Where do you want to go ?");

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


                     }
                     break;

                 case 2:
                     System.out.println("press 1 to Moonhallow. In this area, you may encounter siren or demon hunter. ");
                     System.out.println("press 2 to Wildfront. In this area, you may encounter goblin, rouge or monk ");
                     System.out.println("press 3 to Oceangulf. In this, you may encounter death knight, demon hunter or siren ");
                     System.out.println("press 4 to go to first page");
                     System.out.println("Where do you want to go ?");
                     break;

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
