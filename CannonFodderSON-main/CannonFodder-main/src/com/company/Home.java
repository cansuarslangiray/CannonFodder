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
        System.out.println("your health has increased.");
        return true;
    }
}
