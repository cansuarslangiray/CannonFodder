package com.company;




public class Warrior extends Player {


    public Warrior(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public void assigningWeapons() {
        setWeapons(objects.getClaymoreArrayList().get(sc.nextInt(objects.getClaymoreArrayList().size() - 1)));
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void cast() {
        System.out.println("Casting " + getCharacterName() + " on " + getTarget().getName());
            getTarget().setPhysicalResistance(getTarget().getPhysicalResistance()-(getTarget().getPhysicalResistance()/2));
            System.out.println("physical resistance of all enemy decreased by 50%");
            System.out.println("Current physical resistance of the " + getTarget().getName() + " is " + getTarget().getPhysicalResistance());
            getTarget().setNormalAttack(true);
    }

}

