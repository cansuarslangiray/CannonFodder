package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmorsShop extends SafePlace implements Locateable{
    public ArmorsShop(ArrayList<Player> players) {
        super(players);
    }
    Objects objects = new Objects();
    Scanner input = new Scanner(System.in);


    public void options(){
        System.out.println("Armor Shop");
        System.out.println();
        System.out.println("1-Helmets");
        System.out.println("2-Chestplates");
        System.out.println("3-Boots");
        System.out.println("4-Turn Back");
        System.out.println("Select an option");
    }

    public void buyArmor(int choice, ArrayList<Armors> arm){

        if(players.get(1).getAllMoney() >=arm.get(choice-1).getPriceOfItem()) {
            double newM = players.get(1).getAllMoney() - arm.get(choice-1).getPriceOfItem();
            players.get(1).setAllMoney(newM);
            System.out.println("You have succesfully purchased.");
            System.out.println("Remaining money: " + players.get(1).getAllMoney() );
        }
        else {
            System.out.println("Purchase failed, You do not have enough money");
            System.out.println("Try something else");
        }

    }
    @Override
    public boolean getLocation() {
        options();
        boolean c = true;
        while (c) {
            int choice2 = input.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("Helmets: ");
                    for (int i = 0; i < 3; i++) {
                        objects.getHelmetArrayList().get(i).armorsDisplay();
                    }
                    System.out.println("1-Buy");
                    System.out.println("2-return to the previous menu");
                    boolean d = true;
                    while(d){
                        int ch3 = input.nextInt();
                        switch (ch3){
                            case 1:
                                System.out.println("you have " + players.get(1).getAllMoney() +" money");
                                System.out.println("Which helmet do you want ?");
                                int ch4 = input.nextInt();
                                buyArmor(ch4,objects.getHelmetArrayList());
                                options();
                                d= false;
                                break;
                            case 2:
                                options();
                                d =false;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Chestplates: ");

                    for (int i = 0; i < 3; i++) {
                        objects.getChestplateArrayList().get(i).armorsDisplay();
                    }

                    System.out.println("1-Buy");
                    System.out.println("2-return to the previous menu");
                    boolean f = true;
                    while(f){
                        int ch3 = input.nextInt();
                        switch (ch3){
                            case 1:
                                System.out.println("You have " + players.get(1).getAllMoney() +" money");
                                System.out.println("Which chestplate do you want ?");
                                int ch4 = input.nextInt();
                                buyArmor(ch4,objects.getChestplateArrayList());
                                f =false;
                                options();
                                break;

                            case 2:
                                options();
                                f =false;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Boots: ");

                    for (int i = 0; i < 3; i++) {
                        objects.getBootsArrayList().get(i).armorsDisplay();

                    }
                    System.out.println("1-Buy");
                    System.out.println("2-return to the previous menu");
                    boolean s = true;
                    while(s){
                        int ch3 = input.nextInt();
                        switch (ch3){
                            case 1:
                                System.out.println("you have " + players.get(1).getAllMoney()  +" money");
                                System.out.println("Which boots do you want ?");
                                int ch4 = input.nextInt();
                                buyArmor(ch4,objects.getBootsArrayList());
                                options();
                                s=false;
                                break;
                            case 2:
                                options();
                                s =false;
                                break;
                        }
                    }
                    break;

                case 4:
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

}
