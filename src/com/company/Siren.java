package com.company;

public class Siren extends Enemy{
    public Siren(int award,int maxNumber) {
        super("Siren", 90,maxNumber);
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
