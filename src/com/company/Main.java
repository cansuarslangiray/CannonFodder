package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Game game = new Game();
            game.logIn();
            game.map();
            System.out.println("name: " + Game.player.getCharacterName());
    }
}
