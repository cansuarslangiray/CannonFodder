package com.company;

import java.util.ArrayList;

public class Objects {
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


   public void allWeapons(ArrayList<Weapons> weapons){
       weapons.add(wand);
       weapons.add(wand1);
       weapons.add(wand2);
       weapons.add(catalyst);
       weapons.add(catalyst1);
       weapons.add(catalyst2);
       weapons.add(claymore);
       weapons.add(claymore1);
       weapons.add(claymore2);
       weapons.add(sword);
       weapons.add(sword1);
       weapons.add(sword2);
       weapons.add(polearms);
       weapons.add(polearms1);
       weapons.add(polearms2);
       weapons.add(scythe);
       weapons.add(scythe1);
       weapons.add(scythe2);
   }

   public void weaponsShopPrintInfo(Weapons weapons){
            System.out.println("---------------------------------------------");
            System.out.println("weapons' name: \t" + weapons.getName() );
            System.out.println("weapons' price: \t" + weapons.getPriceOfItem() );
            System.out.println("weapons' damage: \t" + weapons.getDamage());
            System.out.println("weapons' rarity: \t" + weapons.getRarity());
            System.out.println("weapons' level: \t" + weapons.getLevel());
            System.out.println("weapons' quality: \t" + weapons.getQuality());
            System.out.println("weapons' weight: \t" + weapons.getWeight());
            System.out.println();

    }


   public void wandArrayList(ArrayList<Weapons> WandArrayList) {
    WandArrayList.add(wand);
    WandArrayList.add(wand1);
    WandArrayList.add(wand2);
}

public void catalystArrayList(ArrayList<Weapons> getCatalystArrayList){
    getCatalystArrayList.add(catalyst);
    getCatalystArrayList.add(catalyst1);
    getCatalystArrayList.add(catalyst2);
}

public void  claymoreArrayList(ArrayList<Weapons> getClaymoreArrayList){
    getClaymoreArrayList.add(claymore);
    getClaymoreArrayList.add(claymore1);
    getClaymoreArrayList.add(claymore2);


}
public void swordArrayList(ArrayList<Weapons> getSwordArrayList){
    getSwordArrayList.add(sword);
    getSwordArrayList.add(sword1);
    getSwordArrayList.add(sword2);


}

public void polearmsArrayList(ArrayList<Weapons> getPolearmsArrayList){
    getPolearmsArrayList.add(polearms);
    getPolearmsArrayList.add(polearms1);
    getPolearmsArrayList.add(polearms2);

}

public void  scytheArrayList(ArrayList<Weapons> getScytheArrayList){
    getScytheArrayList.add(scythe);
    getScytheArrayList.add(scythe1);
    getScytheArrayList.add(scythe2);

}

Ability ability = new Ability("Hydro");
Ability ability1 = new Ability("Cryo");
Ability ability2 = new Ability("Pyro");
Ability ability3 = new Ability("Anemo");
Ability ability4 = new Ability("Electro");
Ability ability5 = new Ability("Geo");

ArrayList<Ability> abilityArrayList = new ArrayList<>();

public ArrayList<Ability> arrayList(){ // harika method ismi :D
    abilityArrayList.add(ability);
    abilityArrayList.add(ability1);
    abilityArrayList.add(ability2);
    abilityArrayList.add(ability3);
    abilityArrayList.add(ability4);
    abilityArrayList.add(ability5);
    return abilityArrayList;
}
}
