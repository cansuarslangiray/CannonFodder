package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Player {
    Objects objects = new Objects();
    SecureRandom sc = new SecureRandom();
    private String type;
    private String characterName;
    private int damage;
    private int health;
    private int money;
    private int rarity;
    private int strength;
    private int vitality;
    private int intelligence;
    private ArrayList<Item> inv;
    private ArrayList<ArrayList<Item>> inventory;
    private ArrayList<Item> wps;
    private ArrayList<Item> clh;
    private ArrayList<Item> food;
    private Weapons weapons;
    private String ability;
    private int rHealthy;
    private Ability ability1;
    Item iwps ;


    public Player(String type, String characterName, int money) {

        this.type = type;
        this.characterName = characterName;
        this.health = healthPoint();
        this.money = money;
        this.rarity = rarity();
        this.strength = changeStrenght();
        this.vitality = changeVitality();
        this.intelligence = changeIntelligence();
        this.ability =  getAbility();
        this.rHealthy = getrHealthy();
        this.weapons = assigningWeapons();

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }


    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }



    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getrHealthy() {
        return rHealthy;
    }

   /* public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }*/

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Ability getAbility1() {
        return ability1;
    }

    public void setAbility1(Ability ability1) {
        this.ability1 = ability1;
    }

    public ArrayList<Item> getWps() {
        return wps;
    }

    public void setWps(ArrayList<Item> wps) {
        this.wps = wps;
    }

   /* public  ArrayList<ArrayList<Item>> getInventory() {

        inventory.add(clh);
        inventory.add(food);
        return inventory;
    }*/




    public int changeStrenght() {

        if (getType().equals("Wizard")) {
            setStrength(sc.nextInt(1, 5));
            return sc.nextInt(1, 5);
        } else if (getType().equals("Knight")) {
            setStrength(sc.nextInt(6, 10));
         return sc.nextInt(6, 10);
        } else if (getType().equals("Worrier")) {
            return sc.nextInt(1, 5);
        } else if (getType().equals("Elf")) {
            return sc.nextInt(3, 7);

        } else if (getType().equals("Lancer")) {
            setStrength(sc.nextInt(5, 8));
            return sc.nextInt(5, 8);

        } else if (getType().equals("Healer")) {
            setStrength(sc.nextInt(3, 6));
            return sc.nextInt(3, 6);
        }
        else
           return sc.nextInt(6, 10);
    }

    public int changeVitality() {

        if (getType().equals("Wizard")) {

            return sc.nextInt(1, 6);
        } else if (getType().equals("Knight")) {
            return sc.nextInt(3, 7);

        } else if (getType().equals("Worrier")) {
            return sc.nextInt(6, 10);
        } else if (getType().equals("Elf")) {
            return sc.nextInt(1, 6);

        } else if (getType().equals("Lancer")) {
            return sc.nextInt(5, 8);

        } else if (getType().equals("Healer")) {
            return sc.nextInt(3, 6);

        } else
            return sc.nextInt(1, 5);

    }

    public int changeIntelligence() {

        if (getType().equals("Wizard")) {
            setIntelligence(sc.nextInt(6, 12));
            return sc.nextInt(6, 12);
        } else if (getType().equals("Knight")) {
            setIntelligence(sc.nextInt(1, 5));
            return sc.nextInt(1, 5);

        } else if (getType().equals("Worrier")) {
            setIntelligence(sc.nextInt(4, 8));
            return sc.nextInt(4, 8);
        } else if (getType().equals("Elf")) {
            setIntelligence(sc.nextInt(9, 13));
            return sc.nextInt(9, 13);

        } else if (getType().equals("Lancer")) {
            return sc.nextInt(2, 6);

        } else if (getType().equals("Healer")) {
            return sc.nextInt(7, 11);

        } else
            return sc.nextInt(2, 4);
    }

    public int rarity() {
        if (getHealth() >= 67) {
            setRarity(5);
            return 5;
        } else if (getHealth() < 67 && getHealth() >= 50) {
            setRarity(4);
            return 4;
        } else {
            setRarity(3);
            return 3;
        }
    }

    public int healthPoint() {
        double hp = (7 * getVitality()) + 2.3 * getStrength() + 1.9 * getIntelligence();
        setHealth((int) Math.round(hp));
        rHealthy = (int) Math.round(hp);
        return (int) Math.round(hp);
    }

    

    public Weapons assigningWeapons() {
        return weapons;
    }
    public  void assigningAbility() {

        setAbility1(objects.getAbilityArrayList().get(sc.nextInt((objects.getAbilityArrayList().size())- 1)));

    }


    public  void characterPrintInfo(){
        System.out.println("Information of the Characters in the game");

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("name: " + getCharacterName());
        System.out.println("intelligence: " + changeIntelligence());
        System.out.println("strenght: " + changeStrenght());
        System.out.println("vitality: " + changeVitality());
        System.out.println("health point: " + healthPoint());
        System.out.println("rarity: " + rarity());
        System.out.println("rh " + getrHealthy());
        System.out.println("weapons: " + getWeapons().getName());
        System.out.println("ability: " + getAbility1().getAbilityName());

        System.out.println("damage: " + getDamage());
        System.out.println("money: " + getMoney());
        System.out.println();
    }

}






    /*public int calculateDamage() {
        if (getType().equals("Wizard")) {
            return getDamage() * changeIntelligence();
        } else if (getType().equals("Knight")) {
            return getDamage() * getStrength();
        } else if (getType().equals("Worrier")) {
            return getDamage() * getStrength();
        } else if (getType().equals("Elf")) {
            return getDamage() * changeIntelligence();
        } else if (getType().equals("Lancer")) {

        }




    /*public void wishCharacter(){
        SecureRandom secureRandom = new SecureRandom();
    }
    }*/




