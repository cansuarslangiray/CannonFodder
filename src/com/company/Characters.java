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

    Worrier worrierPlayer = new Worrier("Worrier", "Nagito Komaeda",86);
    Worrier worrierPlayer1 = new Worrier("Worrier", "Touka Kirişima",87);
    Worrier worrierPlayer2 = new Worrier("Worrier", "Kaneki Ken",97);
    Worrier worrierPlayer3 = new Worrier("Worrier", "Rize Kamishiro",97);
    Worrier worrierPlayer4 = new Worrier("Worrier","Juuzou Suzuya",85);

    Lancer lancerPlayer = new Lancer("Lancer", "Toga himiko",75);
    Lancer lancerPlayer1 = new Lancer("Lancer", "Shoto Todoroki",86);
    Lancer lancerPlayer2 = new Lancer("Lancer", "Katsuki Bakugo",96);
    Lancer lancerPlayer3 = new Lancer("Lancer", "Shota Aizawa",960);
    Lancer lancerPlayer4 = new Lancer("Lancer", "Tomura Shigaraki",63);



    ArrayList<Wizard> wizardArrayList = new ArrayList<>();
    ArrayList<Worrier> worrierArrayList = new ArrayList<>();
    ArrayList<Lancer> lancerArrayList = new ArrayList<>();
    ArrayList<Elf> elfArrayList = new ArrayList<>();
    ArrayList<Knight> knightArrayList = new ArrayList<>();


    public ArrayList<Wizard> getWizardArrayList() {
        return wizardArrayList;
    }

    public ArrayList<Worrier> getWorrierArrayList() {
        return worrierArrayList;
    }

    public ArrayList<Elf> getElfArrayList() {
        return elfArrayList;
    }

    public ArrayList<Knight> getKnightArrayList() {
        return knightArrayList;
    }

    public ArrayList<Lancer> getLancerArrayList() {
        return lancerArrayList;
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

    public ArrayList<Wizard> wizardsGet(){
               wizardArrayList.add(wizardPlayer);
               wizardArrayList.add(wizardPlayer1);
               wizardArrayList.add(wizardPlayer2);
               wizardArrayList.add(wizardPlayer3);
               wizardArrayList.add(wizardPlayer4);
        return wizardArrayList;
    }


    public ArrayList<Elf> elfGet(){
        elfArrayList.add(elfPlayer);
        elfArrayList.add(elfPlayer1);
        elfArrayList.add(elfPlayer2);
        elfArrayList.add(elfPlayer3);
        elfArrayList.add(elfPlayer4);
        return elfArrayList;
    }

    public ArrayList<Worrier> worriersGet(){
        worrierArrayList.add(worrierPlayer);
        worrierArrayList.add(worrierPlayer1);
        worrierArrayList.add(worrierPlayer2);
        worrierArrayList.add(worrierPlayer3);
        worrierArrayList.add(worrierPlayer4);
        return worrierArrayList;
    }

    public ArrayList<Knight> knightsGet(){
        knightArrayList.add(knightPlayer);
        knightArrayList.add(knightPlayer1);
        knightArrayList.add(knightPlayer2);
        knightArrayList.add(knightPlayer3);
        knightArrayList.add(knightPlayer4);
        return knightArrayList;
    }

    public ArrayList<Lancer> lancerGet(){
        lancerArrayList.add(lancerPlayer);
        lancerArrayList.add(lancerPlayer1);
        lancerArrayList.add(lancerPlayer2);
        lancerArrayList.add(lancerPlayer3);
        lancerArrayList.add(lancerPlayer4);
        return lancerArrayList;
    }


}
