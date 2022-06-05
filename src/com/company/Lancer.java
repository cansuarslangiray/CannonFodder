package com.company;



public class Lancer  extends Player{

    public Lancer(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public void assigningWeapons() {
        setWeapons(objects.getPolearmsArrayList().get(sc.nextInt(objects.getPolearmsArrayList().size() - 1)));
        setItem(objects.getPolearmsArrayList().get(sc.nextInt(objects.getPolearmsArrayList().size() - 1)));
    }

    @Override
    public void attack() {
        super.attack();
    }
}
