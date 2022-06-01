package com.company;

public class Monk extends Enemy{
    public Monk( int award, int maxNumber) {
        super("Monk",95, maxNumber);
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
