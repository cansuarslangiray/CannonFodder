package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Wizard extends Player {


    public Wizard(String type, String characterName, int money,Ability ability) {
        super(type, characterName, money,ability);

    }
   /* public static void wizardPrintInfo(){
        ArrayList<Wizard> wizardArrayList = new ArrayList<>();
        Wizard wizard = new Wizard("Wizard","Barbara",100);
        wizardArrayList.add(wizard);
        System.out.println("Information of the wizards in the game");
        System.out.println("------------------------------------------");
        System.out.println(wizard);
        System.out.println("n: " +wizard.getCharacterName());
        System.out.println("i: " + wizard.changeIntelligence());
        System.out.println("s: " + wizard.changeStrenght());
        System.out.println("v: " + wizard.changeVitality());
        System.out.println("h: " + wizard.healthPoint());
        System.out.println("r: " + wizard.rarity());
       }*/
}
