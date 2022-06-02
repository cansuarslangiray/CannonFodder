package com.company;




public class Elf extends Player {

    public Elf(String type, String characterName, int money) {
        super(type, characterName, money);


    }
    @Override
    public void attack() {
        System.out.println(getCharacterName() + " is attacking " + getTarget().getName() + "...");
        getTarget().setHealth(getTarget().getHealth() - getDamage());
        System.out.println(getCharacterName() + " damaged " + getTarget().getName() + " for " + getDamage() + " damage.");
    }




}