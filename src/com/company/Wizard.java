package com.company;



public class Wizard extends Player {


    public Wizard(String type, String characterName, int money) {
        super(type, characterName, money);

    }

    @Override
    public void assigningWeapons() {
        setWeapons(objects.getWandArrayList().get(sc.nextInt( objects.getWandArrayList().size()-1)));
    }

    @Override
    public void cast() {
        System.out.println("Casting " + getCharacterName() + " on " + getTarget().getName());
        setDamageAbsorber(getTarget().getDamage());
        getTarget().setHealth(getTarget().getHealth()- ( getDamage() + getDamageAbsorber()));
        System.out.println(getCharacterName() + " damaged " + getTarget().getName() + " for " + getDamageAbsorber() + " damage.");
        getTarget().setDamageAbsorber(true);
    }

    @Override
    public void attack() {
        super.attack();
    }
}
