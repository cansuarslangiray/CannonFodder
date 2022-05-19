package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class WeaponsShop extends SafePlace{
    public Game game ;
    public WeaponsShop(ArrayList<Player> players) {
        super(players);
    }

    Scanner sc = new Scanner(System.in);



    @Override
    public boolean getLocation() {
        Objects objects = new Objects();
        ArrayList<Weapons> weaponsArrayList = new ArrayList<>();
        options();

        boolean c = true;
        while (c) {
            int choice2 = sc.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("printing swords");
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Sword")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }
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
                                buyWeapon(ch4);
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
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Claymore")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }
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
                                buyWeapon(ch4);
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
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Polearms")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }

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
                                buyWeapon(ch4);
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
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Wand")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }

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
                                buyWeapon(ch4);
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
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Catalyst")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }

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
                                buyWeapon(ch4);
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
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Scythe")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }

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
                                buyWeapon(ch4);
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

    public void buyWeapon(int choice){
        Objects obj = new Objects();
        ArrayList<Weapons> wps = new ArrayList<>();
        obj.swordArrayList(wps);
        if(game.allMoney>=wps.get(choice-1).getPriceOfItem()) {
         players.get(1).getInventory().get(0).add(wps.get(choice-1));
         wps.remove(wps.get(choice-1));
         double newM = game.allMoney- wps.get(choice-1).getPriceOfItem();
         game.setAllMoney(newM);
         System.out.println(game.getAllMoney());
     }
     else {
         System.out.println("you do not have enough money");
         System.out.println("other choice ? ");
     }

    }

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
