package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Ability {
     private final String abilityName ;

    public Ability(String abilityName) {
        this.abilityName = abilityName;
    }



    static Ability ability = new Ability("Hydro");
    static Ability ability1 = new Ability("Cryo");
    static Ability ability2 = new Ability("Pyro");
    static Ability ability3 = new Ability("Anemo");
    static Ability ability4 = new Ability("Electro");
    static Ability ability5 = new Ability("Geo");

   static ArrayList<Ability> abilityArrayList = new ArrayList<>();

    public static ArrayList<Ability> arrayList(){
        abilityArrayList.add(ability);
        abilityArrayList.add(ability1);
        abilityArrayList.add(ability2);
        abilityArrayList.add(ability3);
        abilityArrayList.add(ability4);
        abilityArrayList.add(ability5);
        return abilityArrayList;
    }

   /* public static void assigningAbility(Player player){

        SecureRandom secureRandom = new SecureRandom();
        for(int i = 0 ; i<abilityArrayList.size();i++){
            player.setAbility(abilityArrayList.get(secureRandom.nextInt(abilityArrayList.size()-1)));
        }
    }*/

    public String getAbilityName() {
        return abilityName;
    }

}
