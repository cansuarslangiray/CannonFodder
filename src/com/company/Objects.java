package com.company;

import java.util.ArrayList;

public class Objects {

    public Objects(){


        Weapons wand = new Wand("Exiled Heart","Wand",4,50000,50,1,1,0.5);
        Weapons wand1 = new Wand(" Touch of Woe","Wand",3,40000,40,1,1,0.9);
        Weapons wand2 = new Wand(" Bag of the Night","Wand",5,60000,60,1,1,0.4);

        Weapons catalyst = new Catalyst(" Pact of the Night","Catalyst",5,68200,60,1,1,0.7);
        Weapons catalyst1 = new Catalyst("Nightfall","Catalyst",4,45000,45,1,1,0.9);
        Weapons catalyst2 = new Catalyst("Starlight","Catalyst",3,33000,30,1,1,1);

        Weapons sword = new Sword("summit sharper", "Sword",4,70000,70,1,1,1.5);
        Weapons sword1 = new Sword("mistspiltter reforged","Sword",5,68000,55,1,1,1.6);
        Weapons sword2 = new Sword("skyword blade","Sword",3,65000,40,1,1,1.9);

        Weapons polearms = new Polearms(" Incarnation of Immortality","Polearms",3,55000,35,1,1,1.2);
        Weapons polearms1 = new Polearms(" Breaker of Horrid Dreams","Polearms",4,60000,40,1,1,1.1);
        Weapons polearms2 = new Polearms("Misery's End","Polearms",5,65000,50,1,1,0.75);

        Weapons scythe = new Scythe("Anguish","Scythe",4,80500,55,1,1,2.2);
        Weapons scythe1 = new Scythe("Stormfury Blade","Scythe",5,80000,60,1,1,2.1);
        Weapons scythe2 = new Scythe("Death's Claw","Scythe",3,75000,45,1,1,2.4);

        Weapons claymore = new Claymore("Amnesia","Claymore",4,48000,65,1,1,3.5);
        Weapons claymore1 = new Claymore("Hope's End","Claymore",5,50000,80,1,1,3.3);
        Weapons claymore2 = new Claymore(" Emissary of the Whispers","Claymore",3,54000,70,1,1,3.4);

        Ability ability = new Ability("Hydro");
        Ability ability1 = new Ability("Cryo");
        Ability ability2 = new Ability("Pyro");
        Ability ability3 = new Ability("Anemo");
        Ability ability4 = new Ability("Electro");
        Ability ability5 = new Ability("Geo");


    WandArrayList.add(wand);
    WandArrayList.add(wand1);
    WandArrayList.add(wand2);

    CatalystArrayList.add(catalyst);
    CatalystArrayList.add(catalyst1);
    CatalystArrayList.add(catalyst2);

    ClaymoreArrayList.add(claymore);
    ClaymoreArrayList.add(claymore1);
    ClaymoreArrayList.add(claymore2);

    SwordArrayList.add(sword);
    SwordArrayList.add(sword1);
    SwordArrayList.add(sword2);

    PolearmsArrayList.add(polearms);
    PolearmsArrayList.add(polearms1);
    PolearmsArrayList.add(polearms2);

    ScytheArrayList.add(scythe);
    ScytheArrayList.add(scythe1);
    ScytheArrayList.add(scythe2);

    abilityArrayList.add(ability);
    abilityArrayList.add(ability1);
    abilityArrayList.add(ability2);
    abilityArrayList.add(ability3);
    abilityArrayList.add(ability4);
    abilityArrayList.add(ability5);
}
    private ArrayList<Ability> abilityArrayList = new ArrayList<>();
    private ArrayList<Weapons> WandArrayList = new ArrayList<>();
    private ArrayList<Weapons> CatalystArrayList = new ArrayList<>();
    private ArrayList<Weapons> ClaymoreArrayList = new ArrayList<>();
    private ArrayList<Weapons> SwordArrayList = new ArrayList<>();
    private ArrayList<Weapons> PolearmsArrayList = new ArrayList<>();
    private ArrayList<Weapons> ScytheArrayList = new ArrayList<>();


    public ArrayList<Ability> getAbilityArrayList() {
        return abilityArrayList;
    }

    public void setAbilityArrayList(ArrayList<Ability> abilityArrayList) {
        this.abilityArrayList = abilityArrayList;
    }

    public ArrayList<Weapons> getWandArrayList() {
        System.out.println(WandArrayList.size());
        return WandArrayList;
    }

    public void setWandArrayList(ArrayList<Weapons> wandArrayList) {
        WandArrayList = wandArrayList;
    }

    public ArrayList<Weapons> getCatalystArrayList() {
        return CatalystArrayList;
    }

    public void setCatalystArrayList(ArrayList<Weapons> catalystArrayList) {
        CatalystArrayList = catalystArrayList;
    }

    public ArrayList<Weapons> getClaymoreArrayList() {
        return ClaymoreArrayList;
    }

    public void setClaymoreArrayList(ArrayList<Weapons> claymoreArrayList) {
        ClaymoreArrayList = claymoreArrayList;
    }

    public ArrayList<Weapons> getSwordArrayList() {
        return SwordArrayList;
    }

    public void setSwordArrayList(ArrayList<Weapons> swordArrayList) {
        SwordArrayList = swordArrayList;
    }

    public ArrayList<Weapons> getPolearmsArrayList() {
        return PolearmsArrayList;
    }

    public void setPolearmsArrayList(ArrayList<Weapons> polearmsArrayList) {
        PolearmsArrayList = polearmsArrayList;
    }

    public ArrayList<Weapons> getScytheArrayList() {
        return ScytheArrayList;
    }

    public void setScytheArrayList(ArrayList<Weapons> scytheArrayList) {
        ScytheArrayList = scytheArrayList;
    }

   

}
