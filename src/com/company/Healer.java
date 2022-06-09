package com.company;




public class Healer extends Player{

    public Healer(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public void assigningWeapons() {
        setWeapons(objects.getCatalystArrayList().get(sc.nextInt(objects.getCatalystArrayList().size() - 1)));

    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void cast() {
        System.out.println("Casting " + getCharacterName() + " on " + getTarget().getName());
        if(getAlly().getHealth()-15>=0) {
            getAlly().setHealth(getAlly().getHealth() + 15);
            System.out.println("Current health of the " + getAlly().getCharacterName() + " is "
                    + getAlly().getHealth());
        }
        else if(getAlly().getHealth()==getAlly().getrHealthy()){
            System.out.println("Healthy of all characters is full");
        }
        else {
            getAlly().setHealth(getAlly().getrHealthy());
            System.out.println(getAlly().getCharacterName()+ "is full of health");
        }
    }

}

