package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Ability {
     private String abilityName ;

    public Ability(String abilityName) {
        this.abilityName = abilityName;
    }

    Ability ability = new Ability("Hydro");
    Ability ability1 = new Ability("Cryo");
    Ability ability2 = new Ability("Pyro");
    Ability ability3 = new Ability("Anemo");
    Ability ability4 = new Ability("Electro");
    Ability ability5 = new Ability("Geo");

   static ArrayList<Ability> abilityArrayList = new ArrayList<>();

    public ArrayList<Ability> arrayList(){
        abilityArrayList.add(ability);
        abilityArrayList.add(ability1);
        abilityArrayList.add(ability2);
        abilityArrayList.add(ability3);
        abilityArrayList.add(ability4);
        abilityArrayList.add(ability5);
        return abilityArrayList;
    }

    public static void assigningAbility(Player player){
        SecureRandom secureRandom = new SecureRandom();
        for(int i = 0 ; i<abilityArrayList.size();i++){
            player.setAbility(abilityArrayList.get(secureRandom.nextInt(abilityArrayList.size()-1)));
        }
    }

    public String getAbilityName() {
        return abilityName;
    }

    public void setAbilityName(String abilityName) {
        this.abilityName = abilityName;
    }
}
