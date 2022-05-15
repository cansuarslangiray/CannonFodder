package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Wizard extends Player {


    public Wizard(String type, String characterName, int money) {
        super(type, characterName, money);

    }
    public static void wizardPrintInfo(){

       Player wizard= new Wizard("Wizard","Barbara",100);

        System.out.println("Information of the wizards in the game");
        System.out.println("------------------------------------------");
        System.out.println(wizard);
        System.out.println("n: " +wizard.getCharacterName());
        System.out.println("i: " + wizard.changeIntelligence());
        System.out.println("s: " + wizard.changeStrenght());
        System.out.println("v: " + wizard.changeVitality());
        System.out.println("h: " + wizard.healthPoint());
        System.out.println("r: " + wizard.rarity());
        System.out.println("rh " + wizard.getrHealthy());
       }


}
