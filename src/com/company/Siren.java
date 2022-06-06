package com.company;

public class Siren extends Enemy{
    public Siren(int damage, int award, int health, int maxNumber) {
        super("Siren", damage, 90, health, maxNumber);
    }

    @Override

    public int enemyCounter() {


        int number=2;
        for(int i = 0 ; i<game.getAdventureRank();i++){
            number*=2;
        }
        setMaxNumber(number);

        return number;

    }
}
