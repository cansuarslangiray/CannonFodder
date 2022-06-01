package com.company;

public class DemonHunter extends Enemy{
    public DemonHunter( int award, int maxNumber) {
        super("Demon Hunter", 80, maxNumber);
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
