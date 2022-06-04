package com.company;


public class Ability {
    private  String abilityName ;
    private Player ally;

    public Player getAlly() {
        return ally;
    }

    public void setAlly(Player ally) {
        this.ally = ally;
    }

    public Ability(String abilityName) {
        this.abilityName = abilityName;
    }
    public String getAbilityName() {
        return abilityName;
    }

    public void cast(Player mPlayer) {
        if (mPlayer.getType().equals("Knight")) {
            System.out.println("Casting " +mPlayer.getCharacterName() + " on " + mPlayer.getTarget().getName());
            mPlayer.getTarget().setStunned(true);
        }
        else if (mPlayer.getType().equals("Healer")) {
            System.out.println("Casting " + mPlayer.getCharacterName() + " on " + mPlayer.getTarget().getName());
            getAlly().setHealth(getAlly().getHealth()+5);
        }
        else if (mPlayer.getType().equals("Warrior")) {
            System.out.println("Casting " + mPlayer.getCharacterName() + " on " + mPlayer.getTarget().getName());
            mPlayer.getTarget().setHealth(mPlayer.getTarget().getHealth()-30);
        }
    }

}
