package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodShop extends SafePlace {
    public FoodShop(ArrayList<Player> players) {
        super(players);
    }

    @Override
    public boolean getLocation() {
        return true;
    }
    Scanner input=new Scanner(System.in);
   public void buyFood(){
        System.out.println("Which dish would you like to have?");
        System.out.println("Press 1 to buy Satisfying Salad");
        System.out.println("Press 2 to buy Mushroom Pizza");
        System.out.println("Press 3 to buy Fried Egg");
        System.out.println("Press 4 to buy Grilled Fish");
        System.out.println("Press 5 to exit");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Which rank are you on the list?");
                int rank=input.nextInt()-1;
                System.out.println("You bought a satisfying salad ");
                int healthyPoint = players.get(rank).getrHealthy();
                int money=players.get(1).getMoney();
                healthyPoint += 200;
                money-=300;
                players.get(rank).setHealth(healthyPoint);
                players.get(rank).setMoney(money);
                System.out.println("Your new healthy point is" + healthyPoint);
                System.out.println("The remaining money is"+money);
                break;
            case 2:
                System.out.println("Which rank are you on the list?");
                int rank2=input.nextInt()-1;
                System.out.println("You bought a mushroom pizza");
                int healthyPoint2 = players.get(rank2).getrHealthy();
                int money2=players.get(rank2).getMoney();
                healthyPoint2 += 300;
                money2-=400;
                players.get(rank2).setHealth(healthyPoint2);
                players.get(rank2).setMoney(money2);
                System.out.println("Your new healthy point is" + healthyPoint2);
                System.out.println("The remaining money is"+money2);
                break;
            case 3:
                System.out.println("Which rank are you on the list?");
                int rank3=input.nextInt()-1;
                System.out.println("You bought a fried egg ");
                int healthyPoint3 = players.get(rank3).getrHealthy();
                int money3=players.get(rank3).getMoney();
                healthyPoint3 += 200;
                money3-=200;
                players.get(rank3).setHealth(healthyPoint3);
                players.get(rank3).setMoney(money3);
                System.out.println("Your new healthy point is" + healthyPoint3);
                System.out.println("The remaining money is"+money3);
                break;
            case 4:System.out.println("Which rank are you on the list?");
                int rank4=input.nextInt()-1;
                System.out.println("You bought a grilled fish");
                int healthyPoint4 = players.get(rank4).getrHealthy();
                int money4=players.get(rank4).getMoney();
                healthyPoint4 += 100;
                money4-=100;
                players.get(rank4).setHealth(healthyPoint4);
                players.get(rank4).setMoney(money4);
                System.out.println("Your new healthy point is" + healthyPoint4);
                System.out.println("The remaining money is"+money4);
                break;
            case 5:
                System.out.println("Terminating the program");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice?");
                break;
        }
    }
    public void cookFood(){
        System.out.println("Which dish would you like to have?");
        System.out.println("Press 1 to cook Satisfying Salad");
        System.out.println("Press 2 to cook Mushroom Pizza");
        System.out.println("Press 3 to cook Fried Egg");
        System.out.println("Press 4 to cook Grilled Fish");
        System.out.println("Press 5 to exit");
        int choice=input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Which rank are you on the list?");
                int rank=input.nextInt()-1;
                System.out.println("You bought a satisfying salad ");
                int healthyPoint =players.get(rank).getrHealthy();
                healthyPoint+=300;
                players.get(rank).setHealth(healthyPoint);
                System.out.println("Your new healthy point is"+healthyPoint);
                break;
            case 2:
                System.out.println("Which rank are you on the list?");
                int rank2=input.nextInt()-1;
                System.out.println("You bought a mushroom pizza");
                int healthyPoint2 =players.get(rank2).getrHealthy();
                healthyPoint2+=400;
                players.get(rank2).setHealth(healthyPoint2);
                System.out.println("Your new healthy point is"+healthyPoint2);
                break;
            case 3:
                System.out.println("Which rank are you on the list?");
                int rank3=input.nextInt()-1;
                System.out.println("You bought a fried egg ");
                int healthyPoint3 =players.get(rank3).getrHealthy();
                healthyPoint3+=300;
                players.get(rank3).setHealth(healthyPoint3);
                System.out.println("Your new healthy point is"+healthyPoint3);
                break;
            case 4:
                System.out.println("Which rank are you on the list?");
                int rank4=input.nextInt()-1;
                System.out.println("You bought a grilled fish");
                int healthyPoint4 = players.get(rank4).getrHealthy();
                healthyPoint4+=300;
                players.get(rank4).setHealth(healthyPoint4);
                System.out.println("Your new healthy point is"+healthyPoint4);
            case 5:
                System.out.println("Terminating the program");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice?");
                break;
        }

    }
}
