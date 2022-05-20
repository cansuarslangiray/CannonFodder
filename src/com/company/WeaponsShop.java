package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class WeaponsShop extends SafePlace{
    public Game game ;
    Objects objects = new Objects();
    public WeaponsShop(ArrayList<Player> players) {
        super(players);
    }

    Scanner sc = new Scanner(System.in);



    @Override
    public boolean getLocation() {
        options();

        boolean c = true;
        while (c) {
            int choice2 = sc.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("printing swords");
                    for (int i = 0; i < 3; i++) {
                        objects.getSwordArrayList().get(i).weaponsPrintInfo();
                    }
                    System.out.println("do you want to buy ?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                    boolean d = true;
                    while(d){
                        int ch3 = sc.nextInt();
                        switch (ch3){
                            case 1:
                                System.out.println("you have " + game.allMoney +" money");
                                System.out.println("Which sword do you want ?");
                                int ch4 = sc.nextInt();
                               // buyWeapon(ch4);
                                break;
                            case 2:
                                options();
                                d =false;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("printing claymores");

                    for (int i = 0; i < 3; i++) {
                        objects.getClaymoreArrayList().get(i).weaponsPrintInfo();
                    }

                    System.out.println("do you want to buy ?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                    boolean f = true;
                    while(f){
                        int ch3 = sc.nextInt();
                        switch (ch3){
                            case 1:
                                System.out.println("you have " + game.allMoney +" money");
                                System.out.println("Which sword do you want ?");
                                int ch4 = sc.nextInt();
                                //buyWeapon(ch4);
                                break;
                            case 2:
                                options();
                                f =false;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("printing polearm");

                    for (int i = 0; i < 3; i++) {
                        objects.getPolearmsArrayList().get(i).weaponsPrintInfo();

                    }
                    System.out.println("do you want to buy ?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                    boolean s = true;
                    while(s){
                        int ch3 = sc.nextInt();
                        switch (ch3){
                            case 1:
                                System.out.println("you have " + game.allMoney +" money");
                                System.out.println("Which sword do you want ?");
                                int ch4 = sc.nextInt();
                                //buyWeapon(ch4);
                                break;
                            case 2:
                                options();
                                s =false;
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("printing wand");

                    for (int i = 0; i < 3; i++) {
                        objects.getWandArrayList().get(i).weaponsPrintInfo();

                    }
                    System.out.println("do you want to buy ?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                    boolean j= true;
                    while(j){
                        int ch3 = sc.nextInt();
                        switch (ch3){
                            case 1:
                                System.out.println("you have " + game.allMoney +" money");
                                System.out.println("Which sword do you want ?");
                                int ch4 = sc.nextInt();
                               // buyWeapon(ch4);
                                break;
                            case 2:
                                options();
                                j=false;
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("printing catalyst");

                    for (int i = 0; i <3; i++) {
                        objects.getCatalystArrayList().get(i).weaponsPrintInfo();

                    }
                    System.out.println("do you want to buy ?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                    boolean w = true;
                    while(w){
                        int ch3 = sc.nextInt();
                        switch (ch3){
                            case 1:
                                System.out.println("you have " + game.allMoney +" money");
                                System.out.println("Which sword do you want ?");
                                int ch4 = sc.nextInt();
                               // buyWeapon(ch4);
                                break;
                            case 2:
                                options();
                                w =false;
                                break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("printing scythe");

                    for (int i = 0; i < 3; i++) {
                        objects.getScytheArrayList().get(i).weaponsPrintInfo();

                    }
                    System.out.println("do you want to buy ?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                    boolean h = true;
                    while(h){
                        int ch3 = sc.nextInt();
                        switch (ch3){
                            case 1:
                                System.out.println("you have " + game.allMoney +" money");
                                System.out.println("Which sword do you want ?");
                                int ch4 = sc.nextInt();
                               // buyWeapon(ch4);
                                break;
                            case 2:
                                options();
                                h =false;
                                break;
                        }
                    }
                    break;
                    case 7:
                   Game.safePlace();
                    c = false;
                    break;

                default:
                    System.out.println("You entered numbers other than 1, 2, 3, 4,5,6 and 7. Please enter one of these numbers");
                    break;
            }
        }
        return true;
    }

   /* public void buyWeapon(int choice){

        ArrayList<Weapons> wps = new ArrayList<>();

        if(game.allMoney>=wps.get(choice-1).getPriceOfItem()) {
         players.get(1).getWps().add(wps.get(choice-1));
         wps.remove(wps.get(choice-1));
         double newM = game.allMoney- wps.get(choice-1).getPriceOfItem();
         game.setAllMoney(newM);
         System.out.println(game.getAllMoney());
     }
     else {
         System.out.println("you do not have enough money");
         System.out.println("other choice ? ");
     }

    }*/

    public void options(){
        System.out.println();
        System.out.println("welcome to the weapon shop");
        System.out.println("--------------------------------");
        System.out.println("press 1 to see swords");
        System.out.println("press 2 to see claymores");
        System.out.println("press 3 to see polearms");
        System.out.println("press 4 to see wand");
        System.out.println("press 5 to see catalyst");
        System.out.println("press 6 to see scythe");
        System.out.println("press 7 to go to first page");
        System.out.println("your choice ? ");
    }


}
