package com.company;

import java.security.SecureRandom;

public class Player {
    private String type;
    private String characterName;
    private int damage;
    private int health = healthPoint();
    private int money;
    private int rarity;
    private int strength; // güç
    private int vitality; // canlılık
    private int intelligence ; // zeka
    private Inventory inventory;



    public Player(String type,String characterName, int money) {
        this.type = type;
        this.characterName = characterName;
        this.health = healthPoint();
        this.money = money;
        this.rarity = rarity();
        this.strength=changeStrenght();
        this.vitality = changeVitality();
        this.intelligence = changeIntelligence();
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

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
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

    public int changeStrenght(){
        SecureRandom sc = new SecureRandom();
        if(getType().equals("Wizard")) {
            return sc.nextInt(1, 5);
        }
        else if (getType().equals("Knight")){
            return sc.nextInt(6,10);

        }
        else if(getType().equals("Worrier")){
            return sc.nextInt(1,5);
        }
        else if(getType().equals("Elf")){
            return sc.nextInt(3,7);

        }
        else if(getType().equals("Lancer")){
            return sc.nextInt(5,8);

        }
        else
            return sc.nextInt(1,4);
    }
    public int changeVitality(){
        SecureRandom sc = new SecureRandom();
        if(getType().equals("Wizard")) {
            return sc.nextInt(1, 6);
        }
        else if (getType().equals("Knight")){
            return sc.nextInt(3,7);

        }
        else if(getType().equals("Worrier")){
            return sc.nextInt(6,10);
        }
        else if(getType().equals("Elf")){
            return sc.nextInt(1,6);

        }
        else if(getType().equals("Lancer")){
            return sc.nextInt(5,8);

        }
        else
            return sc.nextInt(2,6);

    }

    public int changeIntelligence(){
        SecureRandom sc = new SecureRandom();
        if(getType().equals("Wizard")) {
            return sc.nextInt(6, 12);
        }
        else if (getType().equals("Knight")){
            return sc.nextInt(1,5);

        }
        else if(getType().equals("Worrier")){
            return sc.nextInt(4,8);
        }
        else if(getType().equals("Elf")){
            return sc.nextInt(9,13);

        }
        else if(getType().equals("Lancer")){
            return sc.nextInt(2,6);

        }
        else
            return sc.nextInt(2,4);
    }

    public int rarity(){
        if(healthPoint()>=5.9){
            return 5;
        }
        else if(healthPoint()<5.9 && healthPoint()>= 4){
            return 4;
        }
        else
            return 3;
    }
    public int healthPoint(){
        double hp = (0.7*getVitality()) + 0.2*getStrength() +0.1*getIntelligence();
        return (int) Math.round(hp);
    }
    /*public int calculateDamage(){
        if(getType().equals("Wizard")) {
            return getDamage()*changeIntelligence();
        }
        else if()
    }*/

    public void wishCharacter(){
        SecureRandom secureRandom = new SecureRandom();
    }
}
