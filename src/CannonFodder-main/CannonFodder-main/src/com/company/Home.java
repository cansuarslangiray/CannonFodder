package com.company;

import java.util.ArrayList;

public class Home extends SafePlace{

    public Home(ArrayList<Player> players) {
        super(players);
    }

    @Override
    public boolean getLocation() {
        System.out.println("you are at home now....");
        for(int i = 0 ; i<players.size();i++) {
            players.get(i).setHealth(players.get(i).getrHealthy());
        }
<<<<<<< HEAD:src/CannonFodder-main/CannonFodder-main/src/com/company/Home.java
        System.out.println("your health is full now."); // or your health has increased;
=======
        System.out.println("your health has increased.");
>>>>>>> upstream/main:src/com/company/Home.java
        return true;
    }
}
