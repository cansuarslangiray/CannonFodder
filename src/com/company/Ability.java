package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Ability {
     private  String abilityName ;

    public Ability(String abilityName) {
        this.abilityName = abilityName;
    }

    public String getAbilityName() {
        return abilityName;
    }


   /* public static void assigningAbility(Player player){

        SecureRandom secureRandom = new SecureRandom();
        for(int i = 0 ; i<abilityArrayList.size();i++){
            player.setAbility(abilityArrayList.get(secureRandom.nextInt(abilityArrayList.size()-1)));
        }
    }*/
}
