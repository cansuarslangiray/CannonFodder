package com.company;

public class DeathKnight extends Enemy{
    public DeathKnight() {
        super("Death Knight");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking " + getTarget().getCharacterName() + "...");
        getTarget().setHealth(getTarget().getHealth() - getDamage());
        System.out.println(getName() + " damaged " + getTarget().getCharacterName() + " for " + getDamage() + " damage.");
    }
}
