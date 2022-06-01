package com.company;

public class Goblin extends Enemy {
    public Goblin(int award, int maxNumber) {
        super("Goblin", 75, maxNumber);
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
