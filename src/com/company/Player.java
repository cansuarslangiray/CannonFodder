package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Player {
    private String type;
    private String characterName;
    private int damage;
    private int health;
    private int money;
    private int rarity;
    private int strength; // güç
    private int vitality; // canlılık
    private int intelligence;
    //private Inventory inventory;
    Weapons weapons;
    private String weaponsName;
    private String ability;
    private int rHealthy;
    private Ability ability1;


    public Player(String type, String characterName, int money) {
        this.type = type;
        this.characterName = characterName;
        this.health = healthPoint();
        this.money = money;
        this.rarity = rarity();
        this.strength = changeStrenght();
        this.vitality = changeVitality();
        this.intelligence = changeIntelligence();
        //this.inventory =  new Inventory();
        this.ability =  getAbility();
        this.rHealthy = getrHealthy();
        this.weapons = getWeapons();
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

   /* public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }*/

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


    public int changeStrenght() {
        SecureRandom sc = new SecureRandom();
        if (getType().equals("Wizard")) {
            setStrength(sc.nextInt(1, 5));
            return sc.nextInt(1, 5);
        } else if (getType().equals("Knight")) {
            return sc.nextInt(6, 10);

        } else if (getType().equals("Worrier")) {
            return sc.nextInt(1, 5);
        } else if (getType().equals("Elf")) {
            return sc.nextInt(3, 7);

        } else if (getType().equals("Lancer")) {
            return sc.nextInt(5, 8);

        } else if (getType().equals("Healer")) {
            return sc.nextInt(3, 6);

        } else
            return sc.nextInt(1, 4);
    }

    public int changeVitality() {
        SecureRandom sc = new SecureRandom();
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
        SecureRandom sc = new SecureRandom();
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
        if (getHealth() >= 69) {
            setRarity(5);
            return 5;
        } else if (getHealth() < 69 && getHealth() >= 50) {
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

    

    public void assigningWeapons() {
        SecureRandom secureRandom = new SecureRandom();
        ArrayList<Weapons> arrayList = new ArrayList<>();
        setWeapons(arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)));
    }
    public final void assigningAbility() {
        SecureRandom secureRandom = new SecureRandom();
        Objects objects = new Objects();
        ArrayList<Ability> arrayList1 = new ArrayList<>();
        arrayList1= objects.arrayList();
        setAbility1(arrayList1.get(secureRandom.nextInt((arrayList1.size()) - 1)));
    }
}


       /* public String assigningWeapons() {
        ArrayList<Weapons> arrayList = new ArrayList<>();
        SecureRandom secureRandom = new SecureRandom();
        if (getType().equals("Wizard")) {
            arrayList = Weapons.getWandArrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                setWeapons(arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)));

                return (arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)).getName());
            }
        } else if (getType().equals("Worrier")) {
            arrayList = Weapons.getClaymoreArrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                setWeapons(arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)));

                return (arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)).getName());
            }
        } else if (getType().equals("Elf")) {
            arrayList = Weapons.getScytheArrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                setWeapons(arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)));

                return (arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)).getName());
            }
        } else if (getType().equals("Healer")) {
            arrayList = Weapons.getCatalystArrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                setWeapons(arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)));

                return (arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)).getName());
            }
        } else if (getType().equals("Knight")) {
            arrayList = Weapons.getSwordArrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                setWeapons(arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)));

                return (arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)).getName());
            }
        } else if (getType().equals("Lancer")) {
            arrayList = Weapons.getPolearmsArrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                setWeapons(arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)));

                return (arrayList.get(secureRandom.nextInt(0, arrayList.size() - 1)).getName());
            }
        }


    }*/
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




