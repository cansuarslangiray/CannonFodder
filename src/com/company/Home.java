package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Home extends SafePlace implements Locateable{
    Location location;
    Scanner sc = new Scanner(System.in);
    public Home(ArrayList<Player> players) {
        super(players);
    }

    @Override
    public boolean getLocation() {//How to restore your character's health and display other regions
        System.out.println("you are at home now....");
        for(int i = 0 ; i<players.size();i++) {
            if(players.get(i).getHealth()<players.get(i).getrHealthy()) {
                players.get(i).setHealth(players.get(i).getrHealthy());
            }
        }
        System.out.println("your health has increased.");
        System.out.println("if you want to go to other areas press m");
        String areaChoice = sc.next();
        if(areaChoice.equalsIgnoreCase("m")) {
            boolean a = true;
            shortMap();
            while (a){

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    location = new FoodShop(players);
                    location.getLocation();
                    break;
                case 2:
                    location = new ArmorsShop(players);
                    location.getLocation();
                    break;
                case 3:
                    location = new WeaponsShop(players);
                    location.getLocation();
                    break;
                case 4:
                    location = new Moonhallow(players);
                    location.getLocation();
                    break;
                case 5:
                    shortMap();
                    a = false;
                    break;
            }
            }
        }
        return true;
    }

    public void shortMap(){
        System.out.println("press 1 to go food shop");
        System.out.println("press 2 to go armors shop");
        System.out.println("press 3 to go weapons shop");
        System.out.println("press 4 to go battelfield");
        System.out.println("press 5 to go first page");
    }
}
