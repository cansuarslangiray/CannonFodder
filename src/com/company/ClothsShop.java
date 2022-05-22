package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothsShop extends SafePlace {
    public ClothsShop(ArrayList<Player> players) {
        super(players);
    }

    @Override
    public boolean getLocation() {
        buyCloth();
        return true;
    }
    Scanner input=new Scanner(System.in);
    public void buyCloth(){
        Cloths cloth1 = new Cloths ("Shield","Cloth",200);
        Cloths cloth2  = new Cloths("Armor","Cloth",300);
        System.out.println("Which cloth would you like to buy?");
        System.out.println("Press 1 to buy a shield ");
        System.out.println("Press 2 to buy an armor");
        System.out.println("Press 3 to exit");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Which rank are you on the list?");
                int rank=input.nextInt()-1;
                if(players.get(rank).getMoney()>=cloth1.getPriceOfItem()){
                    System.out.println("You bought a shield ");
                    int healthyPoint = players.get(rank).getrHealthy();
                    int money=players.get(1).getMoney();
                    healthyPoint += 200;
                    money-=200;
                    players.get(rank).setItem(cloth1);
                    players.get(rank).setHealth(healthyPoint);
                    players.get(rank).setMoney(money);
                    System.out.println("Your new healthy point is" + healthyPoint);
                    System.out.println("The remaining money is"+money);}
                else{
                    System.out.println("Sorry, you don't have enough money");
                }
                break;
            case 2:
                System.out.println("Which rank are you on the list?");
                int rank2=input.nextInt()-1;
                if(players.get(rank2).getMoney()>=cloth2.getPriceOfItem()){
                    System.out.println("You bought an armor");
                    int healthyPoint2 = players.get(rank2).getrHealthy();
                    int money2=players.get(rank2).getMoney();
                    healthyPoint2 += 300;
                    money2-=300;
                    players.get(rank2).setItem(cloth2);
                    players.get(rank2).setHealth(healthyPoint2);
                    players.get(rank2).setMoney(money2);
                    System.out.println("Your new healthy point is" + healthyPoint2);
                    System.out.println("The remaining money is"+money2);}
                else{
                    System.out.println("Sorry, you don't have enough money");
                }
                break;
            case 3:
                System.out.println("Terminating the program");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice?");
                break;
        }
    }
}
