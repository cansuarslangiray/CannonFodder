package com.company;




public class Warrior extends Player {


    public Warrior(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public void assigningWeapons() {
        setWeapons(objects.getClaymoreArrayList().get(sc.nextInt(objects.getClaymoreArrayList().size() - 1)));
        setItem(objects.getClaymoreArrayList().get(sc.nextInt(objects.getClaymoreArrayList().size() - 1)));
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void cast() {
        System.out.println("Casting " + getCharacterName() + " on " + getTarget().getName());
        getTarget().setHealth(getTarget().getHealth()-30);
        System.out.println("Current health of the " + getTarget().getName() + " is " + getTarget().getHealth());
    }
}

