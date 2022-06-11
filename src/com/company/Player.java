

package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;


public class Player {
    double allMoney;
    Enemy target;
    private Weapons weapons;
    private Armors armors;
    ArrayList<Item>ınv = new ArrayList<>();
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
    private int rHealthy;
    private int block;
    private Player ally;
    private int damageAbsorber;
    private int score;



    public Player(String type, String characterName, int money) {
        this.type = type;
        this.characterName = characterName;
        this.money = money;

    }

    public int getDamageAbsorber() {
        return damageAbsorber;
    }

    public void setDamageAbsorber(int damageAbsorber) {
        this.damageAbsorber = damageAbsorber;
    }

    public Player getAlly() {
        return ally;
    }

    public void setAlly(Player ally) {
        this.ally = ally;
    }
    public double getAllMoney() {
        return allMoney;
    }


    public void setAllMoney(double allMoney) {
        this.allMoney = allMoney;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCharacterName() {
        return characterName;
    }

    public Enemy getTarget() {
        return target;
    }

    public void setTarget(Enemy enemy) {
        this.target = enemy;
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

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }
    public Armors getArmors(){
        return armors;
    }
    public void setArmors(Armors armors){
        this.armors= armors;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public ArrayList<Item> getInv() {
        return ınv;
    }

    public void setInv(ArrayList<Item> ınv) {
        this.ınv = ınv;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void changeStrenght() {//method of assigning strenght to the character

        if (getType().equals("Wizard")) {
            setStrength(sc.nextInt(1, 5));

        } else if (getType().equals("Knight")) {
            setStrength(sc.nextInt(6, 10));

        } else if (getType().equals("Worrier")) {
            setStrength(sc.nextInt(5,9));
        } else if (getType().equals("Elf")) {
            setStrength(sc.nextInt(3,6));

        } else if (getType().equals("Healer"))
            setStrength(sc.nextInt(6, 10));

        else if(getType().equals("Tank")){
            setStrength(sc.nextInt(3,7));
        }
    }

    public void changeVitality() {//method of assigning vitality to the character

        if (getType().equals("Wizard")) {
            setVitality(sc.nextInt(1, 6));
        } else if (getType().equals("Knight")) {
            setVitality(sc.nextInt(3, 7));

        } else if (getType().equals("Worrier")) {
            setVitality(sc.nextInt(6, 10));
        } else if (getType().equals("Elf")) {
            setVitality(sc.nextInt(1, 6));

        }  else if (getType().equals("Healer")) {
            setVitality(sc.nextInt(3, 6));
        }
        else if(getType().equals("Tank")){
            setVitality(sc.nextInt(6,10));
        }
    }

    public void changeIntelligence() { //method of assigning intelligence to the character

        if (getType().equals("Wizard")) {
            setIntelligence(sc.nextInt(6, 12));

        } else if (getType().equals("Knight")) {
            setIntelligence(sc.nextInt(1, 5));


        } else if (getType().equals("Worrier")) {
            setIntelligence(sc.nextInt(4, 8));

        } else if (getType().equals("Elf")) {
            setIntelligence(sc.nextInt(9, 13));


        } else if (getType().equals("Healer"))
            setIntelligence(sc.nextInt(6, 10));

        else if(getType().equals("Tank")){
            setIntelligence(sc.nextInt(3,7));
        }


    }

    public void rarity() {//method of assigning rarity to the character
        if (getHealth() >= 67) {
            setRarity(5);

        } else if (getHealth() < 67 && getHealth() >= 50) {
            setRarity(4);

        } else {
            setRarity(3);

        }
    }
    public void playerDamage(){//method of calculating character's damage
        if(getWeapons().getType().equals("Sword")){
            setDamage(getWeapons().getDamage()*getStrength());
        }
        else if(getWeapons().getType().equals("Wand")){
            setDamage(getWeapons().getDamage()*getIntelligence());
        }
        else if(getWeapons().getType().equals("Catalyst")){
            setDamage(getWeapons().getDamage()*getIntelligence());
        }
        else if(getWeapons().getType().equals("Claymore")){
            setDamage(getWeapons().getDamage()*getVitality());
        }
        else if(getWeapons().getType().equals("Polearms")){
            setDamage(getWeapons().getDamage()*getStrength());
        }
        else if(getWeapons().getType().equals("Scythe")){
            setDamage(getWeapons().getDamage()*getStrength());
        }
        else if(getWeapons().getType().equals("Shield")){
            setDamage(getWeapons().getDamage()*getVitality());
        }
    }

    public void healthPoint() {//method of calculating character's health
        double hp = (7 * getVitality()) + 2 * getStrength() + 1 * getIntelligence();
        setHealth((int) Math.round(hp));
        setrHealthy((int) Math.round(hp));
    }

    public void assigningWeapons() { //method of assigning weapons to the character


    }


    public void attack() {//The method by which the character attacks the enemy
        System.out.println(getCharacterName() + " is attacking " + getTarget().getName() + "...");
        getTarget().setHealth(getTarget().getHealth() - getDamage());
        System.out.println(getCharacterName() + " damaged " + getTarget().getName() + " for " + getDamage() + " damage.");
        getWeapons().setQuality(getWeapons().getQuality()-1);
        if(getTarget().getHealth()<=0){
            getTarget().setHealth(0);
            System.out.println("Current health of the enemy is " + 0);
        }
        else{
        System.out.println("Current health of the enemy is " + getTarget().getHealth());}
        getTarget().setNormalAttack(true);
        if(getWeapons().getQuality()<=10){
            System.out.println(getWeapons().getType() + " named " + getWeapons().getName() +" is about to break");
            System.out.println("either get your weapon repaired or buy a new one");
            System.out.println("If you do not do any of these, you will not be able to use this weapon again");
        }
    }


    public void cast() {//character's own special ability method

    }

    public void selectC(){//A new method that includes methods for determining all of the properties of the characters

        rarity();
        changeIntelligence();
        changeVitality();
        changeStrenght();
        healthPoint();
        assigningWeapons();
        playerDamage();

    }
    public void characterPrintInfo(){//method that extracts information about characters

        System.out.println("Information of the Characters ");
        System.out.println("------------------------------------------");
        System.out.println("name: \t" + getCharacterName()+ "\t Type: \t" + getType());
        System.out.println("intelligence: \t"+getIntelligence()+"\t strenght: \t"+getStrength()+"\t vitality: \t"+getVitality() );
        System.out.println("health point: \t"+getHealth()+"\t rarity: \t "+getRarity()+"\t money: \t"+getMoney());
        System.out.println("damage: \t\t"+getDamage()+"\t weapons: \t"+getWeapons().getName());
        System.out.println();
    }



}

