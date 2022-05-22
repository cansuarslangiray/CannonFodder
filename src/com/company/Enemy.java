package com.company;

public class Enemy {
    private String name;
    private int damage,award,health,maxNumber;

    public Enemy(String name, int damage,int award,int health,int maxNumber){
        this.name = name;
        this.damage = damage;
        this.award = award;
        this.health = health;
        this.maxNumber = maxNumber;
    }
}
