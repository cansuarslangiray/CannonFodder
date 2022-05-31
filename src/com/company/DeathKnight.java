package com.company;

public class DeathKnight extends Enemy{
    public DeathKnight(int damage, int award, int health, int maxNumber) {
        super("Death Knight", damage, 50, health, maxNumber);
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
