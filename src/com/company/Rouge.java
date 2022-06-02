package com.company;

public class Rouge extends Enemy{
    public Rouge( ) {
        super("Rouge");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking " + getTarget().getCharacterName() + "...");
        getTarget().setHealth(getTarget().getHealth() - getDamage());
        System.out.println(getName() + " damaged " + getTarget().getCharacterName() + " for " + getDamage() + " damage.");
    }
}
