package com.company;

public class Tank extends Player{
    public Tank(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public void assigningWeapons() {
        setWeapons(objects.getShieldArrayList().get(sc.nextInt(objects.getSwordArrayList().size()-1)));

    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void cast() {
        System.out.println("Casting " + getCharacterName() + " on " + getTarget().getName());
        System.out.println(getTarget().getName() + " is stunned " + getCharacterName());
        getTarget().setStunned(true);

    }

   
}
