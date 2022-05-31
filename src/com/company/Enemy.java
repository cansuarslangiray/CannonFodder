package com.company;

import java.security.SecureRandom;

public class Enemy {
    Game game;
    SecureRandom sc = new SecureRandom();
    private String type;
    private String name;
    private int damage, award, health, maxNumber;
    private int strength;
    private int vitality;
    private int intelligence;

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Enemy(String name, int damage, int award, int health, int maxNumber) {
        this.name = name;
        this.damage = damage;
        this.award = award;
        this.health = health;
        this.maxNumber = maxNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }


    public void changeAventureRank() {

    }


     public int enemyCounter(){
        int number=2;
        for(int i = 0 ; i<game.getAdventureRank();i++){
            number*=2;
        }

        setMaxNumber(number);
        return number;

    

    public int changeStrength() {
        if (getType().equals("DeathKnight")) {
            int random = sc.nextInt(1, 5);
            setStrength(random);
            return random;
        }
        if (getType().equals("DemonHunter")) {
            int random1 = sc.nextInt(1, 5);
            setStrength(random1);
            return random1;
        }
        if (getType().equals("Goblin")) {
            int random2 = sc.nextInt(1, 5);
            setStrength(random2);
            return random2;
        }
        if (getType().equals("Monk")) {
            int random3 = sc.nextInt(1, 5);
            setStrength(random3);
            return random3;
        }
        if (getType().equals("Rouge")) {
            int random4 = sc.nextInt(1, 5);
            setStrength(random4);
            return random4;
        } else if (getType().equals("Siren")) {
            int random5= sc.nextInt(1, 5);
            setStrength(random5);
            return random5;
        }
        else
            return 0;
    }
    public int changeVitality() {

        if (getType().equals("DeathKnight")) {
            int random=sc.nextInt(1,5);
            setVitality(random);
            return random;
        } if (getType().equals("DemonHunter")) {
            int random1=sc.nextInt(1,5);
            setVitality(random1);
            return random1;
        }  if (getType().equals("Goblin")) {
            int random2=sc.nextInt(1,5);
            setVitality(random2);
            return random2;
        }  if (getType().equals("Monk")) {
            int random3=sc.nextInt(1, 5);
            setVitality(random3);
            return random3;
        } if (getType().equals("Rouge")) {
            int random4=sc.nextInt(1, 5);
            setVitality(random4);
            return random4;
        }  if (getType().equals("Siren")) {
            int random5=sc.nextInt(1, 5);
            setVitality(random5);
            return random5;
        }
        else
            return 0;
    }

    public int changeIntelligence() {
        if (getType().equals("DeathKnight")) {
            int random = sc.nextInt(1, 5);
            setIntelligence(random);
            return random;
        }
        if (getType().equals("DemonHunter")) {
            int random1 = sc.nextInt(1, 5);
            setIntelligence(random1);
            return random1;
        }
        if (getType().equals("Goblin")) {
            int random2 = sc.nextInt(1,5);
            setIntelligence(random2);
            return random2;
        }
        if (getType().equals("Monk")) {
            int random3 = sc.nextInt(1,5);
            setIntelligence(random3);
            return random3;
        }
        if (getType().equals("Rouge")) {
            int random4 = sc.nextInt(1, 5);
            setIntelligence(random4);
            return random4;
        }
        if (getType().equals("Siren")) {
            int random5 = sc.nextInt(1, 5);
            setIntelligence(random5);
            return random5;
        }
        else
            return 0;

    }
    public int calculateDamage() {
        if (getType().equals("DeathKnight")) {
            return getDamage() * changeIntelligence();
        } if (getType().equals("DemonHunter")) {
            return getDamage() * changeStrength();
        }  if (getType().equals("Goblin")) {
            return getDamage() * changeStrength();
        } if (getType().equals("Monk")) {
            return getDamage() * changeIntelligence();
        }  if (getType().equals("Rouge")) {
            return getDamage() * changeVitality();
        }
        if(getType().equals("Siren")){
            return getDamage()*getVitality();
        }else
            return 0;
    }

}