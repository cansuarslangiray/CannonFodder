package com.company;

import java.security.SecureRandom;

public class Enemy {
    SecureRandom sc = new SecureRandom();
    Player target;
    Enemy allyEnemy;
    private boolean isElectrified = false;
    private int physicalResistance =100;
    private String type;
    private String name;
    private int damage = 5 , health;
    private int strength;
    private int vitality;
    private int intelligence;
    private boolean isStunned = false;
    private boolean isDamageAbsorber = false;
    private int electricT;
    private boolean isNormalAttack = false;
    private boolean isCharmed = false;
    private Rewards award;
    private Objects objects = new Objects();

    public Rewards getAward() {
        return award;
    }

    public void setAward(Rewards award) {
        this.award = award;
    }

    public Enemy getAllyEnemy() {
        return allyEnemy;
    }

    public void setAllyEnemy(Enemy allyEnemy) {
        this.allyEnemy = allyEnemy;
    }

    public boolean getCharmed() {
        return isCharmed;
    }

    public void setCharmed(boolean charmed) {
        isCharmed = charmed;
    }

    public boolean getNormalAttack() {
        return isNormalAttack;
    }

    public void setNormalAttack(boolean normalAttack) {
        isNormalAttack = normalAttack;
    }

    public boolean getDamageAbsorber() {
        return isDamageAbsorber;
    }

    public void setDamageAbsorber(boolean damageAbsorber) {
        isDamageAbsorber = damageAbsorber;
    }

    public boolean getElectrified() {
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

    public int getElectricT() {
        return electricT;
    }

    public void setElectricT(int electricT) {
        this.electricT = electricT;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void changeStrength () {//method of calculating character's strength
        int random = sc.nextInt(1, 5);
        setStrength(random);
    }
    public void changeVitality () {//method of calculating character's vitality


        int random5 = sc.nextInt(1, 5);
        setVitality(random5);


    }

    public void changeIntelligence () {//method of calculating character's intelligence

        int random5 = sc.nextInt(1, 5);
        setIntelligence(random5);


    }
    public void healthPoint() {//method of calculating character's health
        double hp = (7 * getVitality()) + 2 * getStrength() + 1.2 * getIntelligence();
        setHealth((int) Math.round(hp));

    }
    public void calculateDamage () {//method of calculating character's damage
        setDamage(getDamage() * getIntelligence());

    }

    public void sEnemy(){//A new method that includes methods for determining all of the properties of the enemy
        changeIntelligence();
        changeVitality();
        changeStrength();
        calculateDamage();
        healthPoint();
        rewards();
    }

    public void rewards(){//method of determining rewards dropped by the enemy
        for(int i = 0 ; i<objects.getRewards().size();i++){
            setAward(objects.getRewards().get(sc.nextInt(0,objects.getRewards().size()-1)));
        }
    }

    public void attack() {//The method by which the enemy attacks the character
        int y = getTarget().getHealth();
        if(getElectrified()){
            System.out.println("electrocuted by " + getTarget().getCharacterName());
            setHealth(getHealth()-10);
            electricT++;
        }
        if(getDamageAbsorber()){
            System.out.println(getName()+"' damage is absorbed by " + getTarget().getCharacterName());
            System.out.println("damage taken from" + getName()+" was used by "+getTarget().getCharacterName() );
            setNormalAttack(false);
            setDamageAbsorber(false);

        }
        if(getIsStunned()){
            System.out.println(getName()+" is stunned by " +getTarget().getCharacterName());
            setNormalAttack(false);
            setStunned(false);
        }
        if(getTarget().getArmors()!=null){
            int x = (int) Math.round(getTarget().getHealth() - (getDamage() - getTarget().getArmors().getBlock() * 0.1));
            int z = y - x;
            getTarget().setHealth(z);
            System.out.println(getName() + " attacked " + getTarget().getCharacterName()+ " for " + z + " damage.");
        }
        if(getCharmed()){
            System.out.println(getName() + "is charmed by " + getTarget().getCharacterName());
            getAllyEnemy().setHealth(getAllyEnemy().getHealth()-getDamage());
            System.out.println(getName() + " attacked " + getAllyEnemy().getName() + " for " + getDamage() + " damage.");
            if(getAllyEnemy().getHealth()<=0){
                getAllyEnemy().setHealth(0);
            }
            System.out.println("Current health of the " + getAllyEnemy().getName() + " is "
                    + getAllyEnemy().getHealth());
            setNormalAttack(false);
            setCharmed(false);
        }
        if(electricT == 3){
            setElectrified(false);
            electricT=0;
        }
        if(getNormalAttack()){
            System.out.println(getName() + " attacked " + getTarget().getCharacterName() + " for " + getDamage() + " damage.");
            getTarget().setHealth(y-getDamage());
            setNormalAttack(false);
        }

    }


}
