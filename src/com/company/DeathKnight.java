package com.company;

public class DeathKnight extends Enemy{
    public DeathKnight( int award, int maxNumber) {
        super("Death Knight", 50, maxNumber);
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
