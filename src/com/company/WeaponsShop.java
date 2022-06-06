package com.company;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Scanner;

public class WeaponsShop extends SafePlace {
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
                    while (d) {
                        int ch3 = sc.nextInt();
                        switch (ch3) {
                            case 1:
                                System.out.println("you have " + players.get(1).getAllMoney() + " money");
                                System.out.println("Which sword do you want ?");
                                int ch4 = sc.nextInt();
                                buyWeapon(ch4, objects.getSwordArrayList());
                                break;
                            case 2:
                                options();
                                d = false;
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
                    while (f) {
                        int ch3 = sc.nextInt();
                        switch (ch3) {
                            case 1:
                                System.out.println("you have " + players.get(1).getAllMoney() + " money");
                                System.out.println("Which claymores do you want ?");
                                int ch4 = sc.nextInt();
                                buyWeapon(ch4, objects.getClaymoreArrayList());
                                break;
                            case 2:
                                options();
                                f = false;
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
                    while (s) {
                        int ch3 = sc.nextInt();
                        switch (ch3) {
                            case 1:
                                System.out.println("you have " + players.get(1).getAllMoney() + " money");
                                System.out.println("Which polearm do you want ?");
                                int ch4 = sc.nextInt();
                                buyWeapon(ch4, objects.getPolearmsArrayList());
                                break;
                            case 2:
                                options();
                                s = false;
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
                    boolean j = true;
                    while (j) {
                        int ch3 = sc.nextInt();
                        switch (ch3) {
                            case 1:
                                System.out.println("you have " + players.get(1).getAllMoney() + " money");
                                System.out.println("Which wand do you want ?");
                                int ch4 = sc.nextInt();
                                buyWeapon(ch4, objects.getWandArrayList());
                                break;
                            case 2:
                                options();
                                j = false;
                                break;

                        }
                    }
                    break;
                case 5:
                    System.out.println("printing catalyst");

                    for (int i = 0; i < 3; i++) {
                        objects.getCatalystArrayList().get(i).weaponsPrintInfo();

                    }
                    System.out.println("do you want to buy ?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                    boolean w = true;
                    while (w) {
                        int ch3 = sc.nextInt();
                        switch (ch3) {
                            case 1:
                                System.out.println("you have " + players.get(1).getAllMoney() + " money");
                                System.out.println("Which catalyst do you want ?");
                                int ch4 = sc.nextInt();
                                buyWeapon(ch4, objects.getCatalystArrayList());
                                break;
                            case 2:
                                options();
                                w = false;
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
                    while (h) {
                        int ch3 = sc.nextInt();
                        switch (ch3) {
                            case 1:
                                System.out.println("you have " + players.get(1).getAllMoney() + " money");
                                System.out.println("Which scythe do you want ?");
                                int ch4 = sc.nextInt();
                                buyWeapon(ch4, objects.getScytheArrayList());
                                break;
                            case 2:
                                options();
                                h = false;
                                break;

                        }
                    }
                    break;
                case 7:
                    changeWeapon();
                    break;
                case 8:
                    System.out.println("exiting this page.....");
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


    public void buyWeapon(int choice,ArrayList<Weapons>wps) {
        if (players.get(1).getType().equals("Wizard")) {
            if (wps.get(choice - 1).getWeight() > 1.2) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");
            } else {
                if (players.get(1).getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    players.get(1).setItem(wps.get(choice - 1));
                    double newM = players.get(1).getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.get(1).setAllMoney(newM);
                    System.out.println(players.get(1).getAllMoney()+ "is your remaining money");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                } else {
                    System.out.println("you do not have enough money");
                    System.out.println("other choice ? ");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                }

            }
        }
        if (players.get(1).getType().equals("Knight")) {
            if (wps.get(choice - 1).getWeight() > 1.5) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");
            } else {
                if (players.get(1).getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    players.get(1).setItem(wps.get(choice - 1));
                    double newM = players.get(1).getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.get(1).setAllMoney(newM);
                    System.out.println(players.get(1).getAllMoney()+ "is your remaining money");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                } else {
                    System.out.println("you do not have enough money");
                    System.out.println("other choice ? ");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                }

            }
        }
        if (players.get(1).getType().equals("Worrier")) {

            if (wps.get(choice - 1).getWeight() > 2.0) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");

            } else {
                if (players.get(1).getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    players.get(1).setItem(wps.get(choice - 1));
                    double newM = players.get(1).getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.get(1).setAllMoney(newM);
                    System.out.println(players.get(1).getAllMoney()+ "is your remaining money");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                } else {
                    System.out.println("you do not have enough money");
                    System.out.println("other choice ? ");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                }

            }
        }
        if (players.get(1).getType().equals("Elf")) {
            if (wps.get(choice - 1).getWeight() > 2.5) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");
            } else {
                if (players.get(1).getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    players.get(1).setItem(wps.get(choice - 1));
                    double newM = players.get(1).getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.get(1).setAllMoney(newM);
                    System.out.println(players.get(1).getAllMoney()+ "is your remaining money");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                } else {
                    System.out.println("you do not have enough money");
                    System.out.println("other choice ? ");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                }

            }
        }
        if (players.get(1).getType().equals("Lancer")) {
            if (wps.get(choice - 1).getWeight() > 3.1) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");
            } else {
                if (players.get(1).getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    players.get(1).setItem(wps.get(choice - 1));
                    double newM = players.get(1).getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.get(1).setAllMoney(newM);
                    System.out.println(players.get(1).getAllMoney()+ "is your remaining money");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                } else {
                    System.out.println("you do not have enough money");
                    System.out.println("other choice ? ");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                }

            }
        }
        if (players.get(1).getType().equals("Healer")) {
            if (wps.get(choice - 1).getWeight() > 7.2) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");
            } else {
                if (players.get(1).getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    players.get(1).setItem(wps.get(choice - 1));
                    double newM = players.get(1).getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.get(1).setAllMoney(newM);
                    System.out.println(players.get(1).getAllMoney()+ "is your remaining money");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                } else {
                    System.out.println("you do not have enough money");
                    System.out.println("other choice ? ");
                    System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                    System.out.println("if your answer yes, press 1 ");
                    System.out.println("else, press 2 to see other weapon types.");
                }

            }
        }}
    public void changeWeapon() {
        ArrayList<Weapons> wps = new ArrayList<>();
        System.out.println("The weapons you have:");
        for (int i = 0; i < players.size(); i++) {
            players.get(i).getWeapons().weaponsPrintInfo();
            wps.add(players.get(i).getWeapons());
        }
        System.out.println("Which one do you want to remove?");
        int choice = sc.nextInt();
        wps.remove(choice - 1);
        System.out.println("Your weapon has been successfully deleted");
        System.out.println("welcome to the weapon shop");
        System.out.println("--------------------------------");
        System.out.println("press 1 to see swords");
        System.out.println("press 2 to see claymores");
        System.out.println("press 3 to see polearms");
        System.out.println("press 4 to see wand");
        System.out.println("press 5 to see catalyst");
        System.out.println("press 6 to see scythe");
        System.out.println("press 7 to change your weapon");
        System.out.println("press 8 to exit this page");
        System.out.println("your choice ? ");
        sc.nextLine();

    }






    public void options () {
        System.out.println();
        System.out.println("welcome to the weapon shop");
        System.out.println("--------------------------------");
        System.out.println("press 1 to see swords");
        System.out.println("press 2 to see claymores");
        System.out.println("press 3 to see polearms");
        System.out.println("press 4 to see wand");
        System.out.println("press 5 to see catalyst");
        System.out.println("press 6 to see scythe");
        System.out.println("press 7 to change your weapon");
        System.out.println("press 8 to exit this page");
        System.out.println("your choice ? ");
    }


}
