package com.company;


public class Ability {
    private  String abilityName ;
    private int abilityDamage;

    public int getAbilityDamage() {
        return abilityDamage;
    }

    public void setAbilityDamage(int abilityDamage) {
        this.abilityDamage = abilityDamage;
    }

    public Ability(String abilityName,int abilityDamage) {
        this.abilityName = abilityName;
        this.abilityDamage = abilityDamage;
    }
    public String getAbilityName() {
        return abilityName;
    }


}
