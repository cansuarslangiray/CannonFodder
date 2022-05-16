package com.company;

import java.util.ArrayList;

public class Characters {

    Wizard wizardPlayer = new Wizard("Wizard","Nao Tomori",5);
    Wizard wizardPlayer1 = new Wizard("Wizard","Yu Otosaka",25);
    Wizard wizardPlayer2 = new Wizard("Wizard","Ayumi Otosaka",56);
    Wizard wizardPlayer3 = new Wizard("Wizard","Misa Kurobane",56);
    Wizard wizardPlayer4 = new Wizard( "Wizard","Roswaal l Mathers",56);

    Elf elfPlayer = new Elf("Elf", "Usagi Tsukino",60);
    Elf elfPlayer1 = new Elf("Elf","Rei Hino",65);
    Elf elfPlayer2 = new Elf("Elf", "Hotaru Tomoe",68);
    Elf elfPlayer3 = new Elf("Elf","Rem",75);
    Elf elfPlayer4 = new Elf("Elf","Emilia",75);

    Knight knightPlayer = new Knight("Knight","Reinhard Van Astrea",81);
    Knight knightPlayer1 = new Knight("Knight","Kyoko Kirigiri",89);
    Knight knightPlayer2 = new Knight("Knight","Toko Fukawa",99);
    Knight knightPlayer3 = new Knight("Knight", "Byakuya Togami",69);
    Knight knightPlayer4 = new Knight("Knight","Makoto Naegi",85);

    Warrior worrierPlayer = new Warrior("Worrier", "Nagito Komaeda",86);
    Warrior worrierPlayer1 = new Warrior("Worrier", "Touka Kirişima",87);
    Warrior worrierPlayer2 = new Warrior("Worrier", "Kaneki Ken",97);
    Warrior worrierPlayer3 = new Warrior("Worrier", "Rize Kamishiro",97);
    Warrior worrierPlayer4 = new Warrior("Worrier","Juuzou Suzuya",85);

    Lancer lancerPlayer = new Lancer("Lancer", "Toga himiko",75);
    Lancer lancerPlayer1 = new Lancer("Lancer", "Shoto Todoroki",86);
    Lancer lancerPlayer2 = new Lancer("Lancer", "Katsuki Bakugo",96);
    Lancer lancerPlayer3 = new Lancer("Lancer", "Shota Aizawa",960);
    Lancer lancerPlayer4 = new Lancer("Lancer", "Tomura Shigaraki",63);



     ArrayList<Player> wizardArrayList = new ArrayList<>();
     ArrayList<Player> worrierArrayList = new ArrayList<>();
     ArrayList<Player> lancerArrayList = new ArrayList<>();
     ArrayList<Player> elfArrayList = new ArrayList<>();
     ArrayList<Player> knightArrayList = new ArrayList<>();


    public ArrayList<Player> getWizardArrayList() {
        return wizardArrayList;
    }

    public ArrayList<Player> getWorrierArrayList() {
        return worrierArrayList;
    }

    public ArrayList<Player> getElfArrayList() {
        return elfArrayList;
    }

    public ArrayList<Player> getKnightArrayList() {
        return knightArrayList;
    }

    public ArrayList<Player> getLancerArrayList() {
        return lancerArrayList;
    }
    

    public void setWizardArrayList(ArrayList<Player> wizardArrayList) {
        this.wizardArrayList = wizardArrayList;
    }


    public static void characterPrintInfo(ArrayList<Player> arrayList){
        System.out.println("Information of the worrier in the game");
        for(int i = 0; i< arrayList.size();i++) {
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("name: " + arrayList.get(i).getCharacterName());
            System.out.println("intelligence: " + arrayList.get(i).changeIntelligence());
            System.out.println("strenght: " + arrayList.get(i).changeStrenght());
            System.out.println("vitality: " + arrayList.get(i).changeVitality());
            System.out.println("health point: " + arrayList.get(i).healthPoint());
            System.out.println("rarity: " + arrayList.get(i).rarity());
            System.out.println("rh " + arrayList.get(i).getrHealthy());
            arrayList.get(i).assigningAbility();
            System.out.println("ability: " +arrayList.get(i).getAbility1().getAbilityName());
            arrayList.get(i).assigningWeapons();
            System.out.println("weapons: " + arrayList.get(i).getWeapons().getName());
            System.out.println("damage: " + arrayList.get(i).getDamage());
            System.out.println("money: " + arrayList.get(i).getMoney());
            System.out.println();
        }
    }

    public ArrayList<Player> wizardsGet(){
               wizardArrayList.add(wizardPlayer);
               wizardArrayList.add(wizardPlayer1);
               wizardArrayList.add(wizardPlayer2);
               wizardArrayList.add(wizardPlayer3);
               wizardArrayList.add(wizardPlayer4);
        return wizardArrayList;
    }


    public ArrayList<Player> elfGet(){
        elfArrayList.add(elfPlayer);
        elfArrayList.add(elfPlayer1);
        elfArrayList.add(elfPlayer2);
        elfArrayList.add(elfPlayer3);
        elfArrayList.add(elfPlayer4);
        return elfArrayList;
    }

    public ArrayList<Player> worriersGet(){
        worrierArrayList.add(worrierPlayer);
        worrierArrayList.add(worrierPlayer1);
        worrierArrayList.add(worrierPlayer2);
        worrierArrayList.add(worrierPlayer3);
        worrierArrayList.add(worrierPlayer4);
        return worrierArrayList;
    }

    public ArrayList<Player> knightsGet(){
        knightArrayList.add(knightPlayer);
        knightArrayList.add(knightPlayer1);
        knightArrayList.add(knightPlayer2);
        knightArrayList.add(knightPlayer3);
        knightArrayList.add(knightPlayer4);
        return knightArrayList;
    }

    public ArrayList<Player> lancerGet(){
        lancerArrayList.add(lancerPlayer);
        lancerArrayList.add(lancerPlayer1);
        lancerArrayList.add(lancerPlayer2);
        lancerArrayList.add(lancerPlayer3);
        lancerArrayList.add(lancerPlayer4);
        return lancerArrayList;
    }


}
