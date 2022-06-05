package com.company;

import java.security.SecureRandom;

public class Enemy {
    SecureRandom sc = new SecureRandom();
    Player target;
    private boolean isElectrified = false;
    private int physicalResistance =100;
    private String type;
    private String name;
    private int damage = 5 , award, health;
    private int strength;
    private int vitality;
    private int intelligence;
    private boolean isStunned = false;

    public boolean isElectrified() {
        return isElectrified;
    }

    public void setElectrified(boolean electrified) {
        isElectrified = electrified;
    }

    public int getPhysicalResistance() {
        return physicalResistance;
    }

    public void setPhysicalResistance(int physicalResistance) {
        this.physicalResistance = physicalResistance;
    }

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

    public Player getTarget() {
        return target;
    }

    public void setTarget(Player target) {
        this.target = target;
    }

    public boolean getIsStunned(){
        return isStunned;
    }

    public void setStunned(boolean isStunned) {
        this.isStunned = isStunned;
    }

    public Enemy(String name) {
        this.name = name;
        this.damage = getDamage();
        this.type = getType();
        this.health = getHealth();

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

        public void changeStrength () {
            int random = sc.nextInt(1, 5);
            setStrength(random);
        }
        public void changeVitality () {


                int random5 = sc.nextInt(1, 5);
                setVitality(random5);


        }

        public void changeIntelligence () {

                int random5 = sc.nextInt(1, 5);
                setIntelligence(random5);


        }
        public void healthPoint() {
          double hp = (7 * getVitality()) + 2 * getStrength() + 1.2 * getIntelligence();
          setHealth((int) Math.round(hp));

       }
        public void calculateDamage () {
                setDamage(getDamage() * getIntelligence());

        }

        public void sEnemy(){
            changeIntelligence();
            changeVitality();
            changeStrength();
            calculateDamage();
            healthPoint();

        }

          public void attack() {
                int y = getTarget().getHealth();
                if(getIsStunned()){
                    System.out.println(getName() + " is stunned ");
                }
                if(getTarget().getArmors()!=null){
                    int x = (int) Math.round(getTarget().getHealth() - (getDamage() - getTarget().getArmors().getBlock() * 0.1));
                    int z = y - x;
                    getTarget().setHealth(z);
                    System.out.println(getName() + " attacked " + getTarget().getCharacterName()+ " for " + z + " damage.");
                }
                else {
                    System.out.println(getName() + " attacked " + getTarget().getCharacterName() + " for " + getDamage() + " damage.");
                    getTarget().setHealth(y-getDamage());
                }
            }


    }
