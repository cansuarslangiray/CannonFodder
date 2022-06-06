package com.company;

public class Rouge extends Enemy{
    public Rouge( int damage, int award, int health, int maxNumber) {
        super("Rouge", damage, 95, health, maxNumber);
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
