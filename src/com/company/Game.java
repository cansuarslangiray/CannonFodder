package com.company;

import java.util.Scanner;

public class Game {
    Player player;


    public static void logIn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome the game!!!");
        System.out.println("Before to start game, you have to know something....");
        System.out.println("Firstly, When you start the game, you will have one wish. With this wish, you will get the character you will play.");
        System.out.println("Good luck!!!");
        System.out.println("You can further develop the character you get by wishing, or you can create new characters by wishing again with the Primogen you earn each time you fight.");
        System.out.println("But remember, there is no such thing as a character will come every time you make a wish, except for the beginning. You can get items that will help you during the game, such as weapons.");
        System.out.println("the adventure rang and your character will start from the lowest level and each time you fight and get stronger the level of the adventure rang will change.");
        System.out.println("As the level of the adventure rang changes, the difficulty level of the enemies you encounter will increase.");
        System.out.println("Secondly, If you are not healthy enough, you can buy food with the coins you earned during the fight, or you can make your own with the materials you earned during the fight.");
        System.out.println("You can also buy items that will increase your character's powers.");
        System.out.println("if you press the m key on the keyboard, you will see the game map");
        System.out.println("Finally, You may encounter different numbers and different enemies in every battlefield you go to.");
        System.out.println("Before fighting, you can get information about the enemies there, such as their damage value and health, and you can decide accordingly. Fight or run");
        System.out.println("DO NOT FORGET, if you lose against the enemy you will lose 10 Primogen");
        System.out.println("You can start now , have fun :)");
        System.out.println();
        Wizard.wizardPrintInfo();

    }
    public static void start(){

    }

}
