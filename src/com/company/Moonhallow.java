package com.company;

import java.util.ArrayList;

public class Moonhallow extends Battlefields{

    public Moonhallow(ArrayList<Player> players, ArrayList<Enemy> enemy) {
        super(players, enemy);
    }

    @Override
    protected int enemyCounter() {
        return 0;
    }
}