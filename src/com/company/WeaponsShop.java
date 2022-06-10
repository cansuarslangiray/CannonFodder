package com.company;



import java.util.ArrayList;
import java.util.Scanner;

public class WeaponsShop extends SafePlace {
    int changeWeapon;
    Objects objects = new Objects();
    Scanner sc = new Scanner(System.in);
    Location location;


    public WeaponsShop(ArrayList<Player> players) {
        super(players);
    }
    @Override
    public boolean getLocation() {
        System.out.println("firstly, which characters buy a weapons");
        System.out.println("yours characters: ");
        for(int i = 0; i<players.size();i++){
            System.out.println((i+1) + "." + players.get(i).getCharacterName());
        }
        int charactersChoice = sc.nextInt();
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
                               if(!buyWeapon(players.get(charactersChoice-1),ch4, objects.getSwordArrayList())){
                                  players.get(0).getInv().add(objects.getSwordArrayList().get(ch4-1));
                               }
                               c= false;
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
                                buyWeapon(players.get(charactersChoice-1),ch4, objects.getClaymoreArrayList());
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
                                buyWeapon(players.get(charactersChoice-1),ch4, objects.getPolearmsArrayList());
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
                                buyWeapon(players.get(charactersChoice-1),ch4, objects.getWandArrayList());
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
                                buyWeapon(players.get(charactersChoice-1),ch4, objects.getCatalystArrayList());
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
                                if(!buyWeapon(players.get(charactersChoice-1),ch4, objects.getScytheArrayList())){
                                   // players.get(0).setItem(objects.getScytheArrayList().get(ch4-1));
                                }
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
                    for(int i = 0 ; i<players.get(0).getInv().size();i++) {
                        for(int k = 0; k<players.size();k++) {
                            if (players.get(k).getInv().get(i).getInvType().equals("Weapon")) {
                                System.out.println((k + 1) + ".weapons printInfo.....");
                                players.get(k).getInv().get(i).weaponsPrintInfo();
                            }
                        }
                    }
                    System.out.println("Which one do you want to use?");
                    break;
                case 8:
                    location = new Home(players);
                    location.getLocation();
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


    public boolean buyWeapon(Player players ,int choice,ArrayList<Weapons>wps) {
        if (players.getType().equals("Wizard")) {
            if (wps.get(choice - 1).getWeight() > 1.2) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");

            } else {
                if (players.getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    double newM = players.getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.setAllMoney(newM);
                    System.out.println(players.getAllMoney()+ "is your remaining money");
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
        if (players.getType().equals("Knight")) {
            if (wps.get(choice - 1).getWeight() > 1.5) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");
            } else {
                if (players.getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    //players.get(1).setItem(wps.get(choice - 1));
                    double newM = players.getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.setAllMoney(newM);
                    System.out.println(players.getAllMoney()+ "is your remaining money");
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
        if (players.getType().equals("Worrier")) {

            if (wps.get(choice - 1).getWeight() > 2.0) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");

            } else {
                if (players.getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    double newM = players.getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.setAllMoney(newM);
                    System.out.println(players.getAllMoney()+ "is your remaining money");
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
        if (players.getType().equals("Elf")) {
            if (wps.get(choice - 1).getWeight() > 2.5) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");
            } else {
                if (players.getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    double newM = players.getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.setAllMoney(newM);
                    System.out.println(players.getAllMoney()+ "is your remaining money");
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
        if (players.getType().equals("Lancer")) {
            if (wps.get(choice - 1).getWeight() > 3.1) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");
            } else {
                if (players.getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    double newM = players.getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.setAllMoney(newM);
                    System.out.println(players.getAllMoney()+ "is your remaining money");
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
        if (players.getType().equals("Healer")) {
            if (wps.get(choice - 1).getWeight() > 7.2) {
                System.out.println("Sorry, the weight of this weapon is not suitable for you.");
                System.out.println("do you want to buy another "+ wps.get(choice-1).getType()+"?");
                System.out.println("if your answer yes, press 1 ");
                System.out.println("else, press 2 to see other weapon types.");
            } else {
                if (players.getAllMoney() >= wps.get(choice - 1).getPriceOfItem()) {
                    double newM = players.getAllMoney() - wps.get(choice - 1).getPriceOfItem();
                    players.setAllMoney(newM);
                    System.out.println(players.getAllMoney()+ "is your remaining money");
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
            return false;
        }
        else{
            return false;
        }
    }
    public void changeWeapon() {
        System.out.println("your characters: ");
        for(int i = 0; i<players.size();i++){
            System.out.println((i+1) + ".character \t" + players.get(i).getCharacterName() + " \t character's weapons: \t" + players.get(i).getWeapons().getName());
        }
        System.out.println("which character's weapons do you want to change:");
        changeWeapon = sc.nextInt();

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
        System.out.println("press 8 to return home");
        System.out.println("your choice ? ");
    }


}