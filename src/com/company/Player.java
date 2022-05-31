package com.company;

import java.security.SecureRandom;


public class Player {
    double allMoney ;

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
    private Weapons weapons;
    private Ability ability1;
    private Armors armors;
    private Inventory item;



    public Player(String type, String characterName, int money) {
        this.type = type;
        this.characterName = characterName;
        this.money = money;
        this.item = new Inventory();
    }

    public Inventory getItem() {
        return item;
    }

    public void setItem(Inventory item) {
        this.item = item;
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

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
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

    public Ability getAbility1() {
        return ability1;
    }

    public void setAbility1(Ability ability1) {
        this.ability1 = ability1;
    }








    public void changeStrenght() {

        if (getType().equals("Wizard")) {
            setStrength(sc.nextInt(1, 5));

        } else if (getType().equals("Knight")) {
            setStrength(sc.nextInt(6, 10));

        } else if (getType().equals("Worrier")) {
            setStrength(sc.nextInt(5,9));
        } else if (getType().equals("Elf")) {
            setStrength(sc.nextInt(3,6));

        } else if (getType().equals("Lancer")) {
            setStrength(sc.nextInt(5, 8));


        } else if (getType().equals("Healer"))
            setStrength(sc.nextInt(6, 10));

        else if(getType().equals("Tank")){
            setStrength(sc.nextInt(3,7));
        }
    }

    public void changeVitality() {

        if (getType().equals("Wizard")) {

            setVitality(sc.nextInt(1, 6));
        } else if (getType().equals("Knight")) {
            setVitality(sc.nextInt(3, 7));

        } else if (getType().equals("Worrier")) {
            setVitality(sc.nextInt(6, 10));
        } else if (getType().equals("Elf")) {
            setVitality(sc.nextInt(1, 6));

        } else if (getType().equals("Lancer")) {
            setVitality(sc.nextInt(5, 8));

        } else if (getType().equals("Healer")) {
            setVitality(sc.nextInt(3, 6));
        }
        else if(getType().equals("Tank")){
            setVitality(sc.nextInt(6,10));
        }
    }

    public void changeIntelligence() {

        if (getType().equals("Wizard")) {
            setIntelligence(sc.nextInt(6, 12));

        } else if (getType().equals("Knight")) {
            setIntelligence(sc.nextInt(1, 5));


        } else if (getType().equals("Worrier")) {
            setIntelligence(sc.nextInt(4, 8));

        } else if (getType().equals("Elf")) {
            setIntelligence(sc.nextInt(9, 13));


        } else if (getType().equals("Lancer")) {
            setIntelligence(sc.nextInt(2, 6));

        } else if (getType().equals("Healer"))
            setIntelligence(sc.nextInt(6, 10));

        else if(getType().equals("Tank")){
            setIntelligence(sc.nextInt(3,7));
        }


    }

    public void rarity() {
        if (getHealth() >= 67) {
            setRarity(5);

        } else if (getHealth() < 67 && getHealth() >= 50) {
            setRarity(4);

        } else {
            setRarity(3);

        }
    }

    public void healthPoint() {
        double hp = (7 * getVitality()) + 2.3 * getStrength() + 1.9 * getIntelligence();
        setHealth((int) Math.round(hp));
        setrHealthy((int) Math.round(hp));
    }

    public void assigningWeapons() {
        if(getType().equals("Wizard")){
            setWeapons(objects.getWandArrayList().get(sc.nextInt( objects.getWandArrayList().size()-1)));
            setItem(objects.getWandArrayList().get(sc.nextInt( objects.getWandArrayList().size()-1)));

        }
        else if(getType().equals("Worrier")){
            setWeapons(objects.getClaymoreArrayList().get(sc.nextInt(objects.getClaymoreArrayList().size() - 1)));
            setItem(objects.getClaymoreArrayList().get(sc.nextInt(objects.getClaymoreArrayList().size() - 1)));

        }
        else if(getType().equals("Elf")){
            setWeapons(objects.getScytheArrayList().get(sc.nextInt(objects.getScytheArrayList().size() - 1)));
            setItem(objects.getScytheArrayList().get(sc.nextInt(objects.getScytheArrayList().size() - 1)));
        }
        else if(getType().equals("Healer")){
            setWeapons(objects.getCatalystArrayList().get(sc.nextInt(objects.getCatalystArrayList().size() - 1)));
            setItem(objects.getCatalystArrayList().get(sc.nextInt(objects.getCatalystArrayList().size() - 1)));
        }
        else if(getType().equals("Lancer")){
            setWeapons(objects.getPolearmsArrayList().get(sc.nextInt(objects.getPolearmsArrayList().size() - 1)));
            setItem(objects.getPolearmsArrayList().get(sc.nextInt(objects.getPolearmsArrayList().size() - 1)));

        }
        else if(getType().equals("Knight")){
            setWeapons(objects.getSwordArrayList().get(sc.nextInt(objects.getSwordArrayList().size()-1)));
            setItem(objects.getSwordArrayList().get(sc.nextInt(objects.getSwordArrayList().size()-1)));
        }
        else if(getType().equals("Tank")){
            setItem(objects.getSwordArrayList().get(sc.nextInt(objects.getSwordArrayList().size()-1)));

        }

    }


    public  void assigningAbility() {

        setAbility1(objects.getAbilityArrayList().get(sc.nextInt((objects.getAbilityArrayList().size())- 1)));

    }

    public void selectC(){
        rarity();
        changeIntelligence();
        changeVitality();
        changeStrenght();
        healthPoint();
        assigningAbility();
        assigningWeapons();
        System.out.println(" type: "+getItem().getItemType());
    }

    public void characterPrintInfo(){
        System.out.println("Information of the Characters in the game");
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("name: " + getCharacterName());
        System.out.println("intelligence: " + getIntelligence());
        System.out.println("strenght: " + getStrength());
        System.out.println("vitality: " + getVitality());
        System.out.println("health point: " + getHealth());
        System.out.println("rarity: " + getRarity());
        System.out.println("rh " + getrHealthy());

        System.out.println("ability: " + getAbility1().getAbilityName());
        System.out.println("weapons: " + getWeapons().getName());
      //  System.out.println("Armours: " + getArmors().getName());
        System.out.println("damage: " + getDamage());
        System.out.println("money: " + getMoney());
        System.out.println();
    }


    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
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