package com.company;

public class DemonHunter extends Enemy{
    public DemonHunter( ) {
        super("Demon Hunter");
    }
    @Override
    public void attack() {
        System.out.println(getName() + " is attacking " + getTarget().getCharacterName() + "...");
        getTarget().setHealth(getTarget().getHealth() - getDamage());
        System.out.println(getName() + " damaged " + getTarget().getCharacterName() + " for " + getDamage() + " damage.");
    }

}
