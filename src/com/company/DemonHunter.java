package com.company;

public class DemonHunter extends Enemy{
    public DemonHunter( int damage, int award, int health, int maxNumber) {
        super("Demon Hunter", damage, 80, health, maxNumber);
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
