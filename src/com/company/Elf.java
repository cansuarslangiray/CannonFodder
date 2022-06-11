package com.company;




public class Elf extends Player {

    public Elf(String type, String characterName, int money) {
        super(type, characterName, money);


    }

    @Override
    public void assigningWeapons() {
        setWeapons(objects.getScytheArrayList().get(sc.nextInt(objects.getScytheArrayList().size() - 1)));
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void cast() {
        System.out.println("Casting " + getCharacterName() + " on " + getTarget().getName());
        getTarget().setNormalAttack(false);
        getTarget().setCharmed(true);

    }

}