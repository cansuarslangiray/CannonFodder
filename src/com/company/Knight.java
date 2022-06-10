package com.company;


public class Knight extends  Player{


    public Knight(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public void assigningWeapons() {
        setWeapons(objects.getSwordArrayList().get(sc.nextInt(objects.getSwordArrayList().size()-1)));
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void cast() {
        System.out.println("Casting " +getCharacterName() + " on " + getTarget().getName());
        System.out.println("will electrocute enemies for three rounds");
        getTarget().setElectrified(true);

    }
}
