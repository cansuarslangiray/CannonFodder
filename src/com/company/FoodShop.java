package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodShop extends SafePlace implements Locateable{
    public FoodShop(ArrayList<Player> players) {
        super(players);
    }
    Objects objects = new Objects();
    Scanner input= new Scanner(System.in);
    public void options(){
        System.out.println("Food Shop");
        System.out.println();
        System.out.println("1-Salad");
        System.out.println("2-Pizza");
        System.out.println("3-Egg");
        System.out.println("4-To view safe areas again");
        System.out.println("Select an option");
    }
    @Override
    public boolean getLocation() {
        options();
        boolean c = true;
        while (c) {
            int choice2 = input.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("Salads: ");
                    for (int i = 0; i < 2; i++) {
                        objects.getSaladArraylist().get(i).foodsDisplay();
                    }

                    System.out.println("1-Buy");
                    System.out.println("2-Cook");
                    System.out.println("3-return to the previous menu");
                    boolean d = true;
                    while(d){
                        int ch3 = input.nextInt();
                        switch (ch3){
                            case 1:

                                System.out.println("You have " + players.get(1).getAllMoney() +" money");
                                System.out.println("Which salad do you want ?");
                                int ch4 = input.nextInt();
                                buyFood(ch4,objects.getSaladArraylist());
                                double newHP= players.get(1).getrHealthy() + objects.getSaladArraylist().get(ch4-1).getAddHP()-100;
                                players.get(1).setrHealthy((int)newHP);
                                options();
                                d= false;
                                break;
                            case 2:

                                System.out.println("Which salad would you like to make?");
                                int choice= input.nextInt();
                                double newHP1= players.get(1).getrHealthy() + objects.getSaladArraylist().get(choice-1).getAddHP();
                                players.get(1).setrHealthy((int)newHP1);
                            case 3:
                                options();
                                d =false;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Pizzas: ");

                    for (int i = 0; i < 3; i++) {
                        objects.getPizzaArrayList().get(i).foodsDisplay();
                    }

                    System.out.println("1-Buy");
                    System.out.println("2- Cook");
                    System.out.println("3-return to the previous menu");
                    boolean f = true;
                    while(f){
                        int ch3 = input.nextInt();
                        switch (ch3){
                            case 1:
                                System.out.println("You have " + players.get(1).getAllMoney() +" money");
                                System.out.println("Which pizza do you want ?");
                                int ch4 = input.nextInt();
                                buyFood(ch4,objects.getPizzaArrayList());
                                double newHP= players.get(1).getrHealthy() + objects.getPizzaArrayList().get(ch4-1).getAddHP()-100;
                                players.get(1).setrHealthy((int)newHP);
                                f =false;
                                options();
                                break;
                            case 2:
                                System.out.println("Which pizza would you like to make?");
                                int choice= input.nextInt();
                                double newHP1= players.get(1).getrHealthy() + objects.getPizzaArrayList().get(choice-1).getAddHP();
                                players.get(1).setrHealthy((int)newHP1);

                            case 3:
                                options();
                                f =false;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Eggs: ");

                    for (int i = 0; i < 2; i++) {
                        objects.getEggArrayList().get(i).foodsDisplay();

                    }
                    System.out.println("1-Buy");
                    System.out.println("2-Cook");
                    System.out.println("3-return to the previous menu");
                    boolean s = true;
                    while(s){
                        int ch3 = input.nextInt();
                        switch (ch3){
                            case 1:

                                System.out.println("You have " + players.get(1).getAllMoney()  +" money");
                                System.out.println("Which egg do you want ?");
                                int ch4 = input.nextInt();
                                buyFood(ch4,objects.getEggArrayList());
                                double newHP= players.get(1).getrHealthy() + objects.getEggArrayList().get(ch4-1).getAddHP()-100;
                                players.get(1).setrHealthy((int)newHP);
                                options();
                                s=false;
                                break;
                            case 2:

                                System.out.println("Which egg would you like to make?");
                                int choice= input.nextInt();
                                double newHP1= players.get(1).getrHealthy() + objects.getEggArrayList().get(choice-1).getAddHP();
                                players.get(1).setrHealthy((int)newHP1);
                            case 3:
                                options();
                                s =false;
                                break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting this page");
                    Game.safePlace();
                    c = false;
                    break;

                default:
                    System.out.println("Please choose an appropriate option.");
                    options();
                    break;
            }
        }
        return true;

    }


    public void buyFood(int choice, ArrayList<Food>foods){

        if(players.get(1).getAllMoney() >= foods.get(choice-1).getPriceOfItem()) {
           // players.get(1).setItem(foods.get(choice-1));
            double newM = players.get(1).getAllMoney() - foods.get(choice-1).getPriceOfItem();
            players.get(1).setAllMoney(newM);
            System.out.println("You have succesfully purchased.");
            System.out.println("Remaining money: " + players.get(1).getAllMoney() );
        }
        else {
            System.out.println("Purchase failed, You do not have enough money");
            System.out.println("Try something else");
        }

    }}
