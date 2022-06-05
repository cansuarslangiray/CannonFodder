package com.company;



public class Wizard extends Player {


    public Wizard(String type, String characterName, int money) {
        super(type, characterName, money);

    }

    @Override
    public void assigningWeapons() {
        setWeapons(objects.getWandArrayList().get(sc.nextInt( objects.getWandArrayList().size()-1)));
        setItem(objects.getWandArrayList().get(sc.nextInt( objects.getWandArrayList().size()-1)));
    }

    @Override
    public void cast() {

    }

    @Override
    public void attack() {
        super.attack();
    }
}
