package com.company;

import java.util.ArrayList;

public class Characters {
    Wizard player = new Wizard("Wizard","b",5);
    Wizard player1 = new Wizard("Wizard","c",25);
    Wizard player2 = new Wizard("Wizard","vf",56);

    ArrayList<Wizard> wizardArrayList = new ArrayList<>();



    public ArrayList<Wizard> getWizardArrayList() {
        return wizardArrayList;
    }

    public void setWizardArrayList(ArrayList<Wizard> wizardArrayList) {
        this.wizardArrayList = wizardArrayList;
    }
    public static void wizardPrintInfo(Player player){

        System.out.println("Information of the wizards in the game");
        System.out.println("------------------------------------------");
        System.out.println("n: " +player.getCharacterName());
        System.out.println("i: " + player.changeIntelligence());
        System.out.println("s: " + player.changeStrenght());
        System.out.println("v: " + player.changeVitality());
        System.out.println("h: " + player.healthPoint());
        System.out.println("r: " + player.rarity());
        System.out.println("rh " + player.getrHealthy());

    }

    public ArrayList<Wizard> get(){
        wizardArrayList.add(player);
        wizardArrayList.add(player1);
        wizardArrayList.add(player2);
        return wizardArrayList;
    }


}
