package com.company;

public class Goblin extends Enemy {
    public Goblin( ) {
        super("Goblin");
    }
    @Override
    public void attack() {
        System.out.println(getName() + " is attacking " + getTarget().getCharacterName() + "...");
        getTarget().setHealth(getTarget().getHealth() - getDamage());
        System.out.println(getName() + " damaged " + getTarget().getCharacterName() + " for " + getDamage() + " damage.");
    }
}
