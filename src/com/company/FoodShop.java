package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodShop extends SafePlace {
    public FoodShop(ArrayList<Player> players) {
        super(players);
    }

@Override
    public boolean getLocation() {
    System.out.println("Do you want to buy or make food? ");
    System.out.println("If you want to buy food please enter 1");
    System.out.println("If you want to make food please enter 2");
    int choice=input.nextInt();
    switch (choice){
        case 1:
            buyFood();
            break;
        case 2:
            cookFood();
            break;
    }
return true;
}
    Scanner input=new Scanner(System.in);
    public void buyFood(){
        Food food1= new Food("Satisfying Salad","Food",70,300);
        Food food2 = new Food("Mushroom Pizza","Food",80,400);
        Food food3 = new Food("Fried Egg","Food",4,200);
        Food food4 = new Food("Grilled Fish","Food",5,100);
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
                if(players.get(rank).getMoney()>=food1.getPriceOfItem()){
                System.out.println("You bought a satisfying salad ");
                int healthyPoint = players.get(rank).getrHealthy();
                int money=players.get(1).getMoney();
                healthyPoint += 200;
                money-=300;
                players.get(rank).setItem(food1);
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
                if(players.get(rank2).getMoney()>=food2.getPriceOfItem()){
                System.out.println("You bought a mushroom pizza");
                int healthyPoint2 = players.get(rank2).getrHealthy();
                int money2=players.get(rank2).getMoney();
                healthyPoint2 += 300;
                money2-=400;
                players.get(rank2).setItem(food2);
                players.get(rank2).setHealth(healthyPoint2);
                players.get(rank2).setMoney(money2);
                System.out.println("Your new healthy point is" + healthyPoint2);
                System.out.println("The remaining money is"+money2);}
                else{
                    System.out.println("Sorry, you don't have enough money");
                }
                break;
            case 3:
                System.out.println("Which rank are you on the list?");
                int rank3=input.nextInt()-1;
                if(players.get(rank3).getMoney()>=food3.getPriceOfItem()){
                System.out.println("You bought a fried egg ");
                int healthyPoint3 = players.get(rank3).getrHealthy();
                int money3=players.get(rank3).getMoney();
                healthyPoint3 += 200;
                money3-=200;
                players.get(rank3).setItem(food3);
                players.get(rank3).setHealth(healthyPoint3);
                players.get(rank3).setMoney(money3);
                System.out.println("Your new healthy point is" + healthyPoint3);
                System.out.println("The remaining money is"+money3);}
                else{
                    System.out.println("Sorry, you don't have enough money");
                }
                break;
            case 4:
                System.out.println("Which rank are you on the list?");
                int rank4=input.nextInt()-1;
                if(players.get(rank4).getMoney()>=food4.getPriceOfItem()){
                System.out.println("You bought a grilled fish");
                int healthyPoint4 = players.get(rank4).getrHealthy();
                int money4=players.get(rank4).getMoney();
                healthyPoint4 += 100;
                money4-=100;
                players.get(rank4).setItem(food4);
                players.get(rank4).setHealth(healthyPoint4);
                players.get(rank4).setMoney(money4);
                System.out.println("Your new healthy point is" + healthyPoint4);
                System.out.println("The remaining money is"+money4);}
                else{
                    System.out.println("Sorry, you don't have enough money");
                }
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
        Food food1= new Food("Satisfying Salad","Food",70,300);
        Food food2 = new Food("Mushroom Pizza","Food",80,400);
        Food food3 = new Food("Fried Egg","Food",4,200);
        Food food4 = new Food("Grilled Fish","Food",5,100);
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
                System.out.println("You cooked a satisfying salad ");
                int healthyPoint =players.get(rank).getrHealthy();
                healthyPoint+=300;
                players.get(rank).setItem(food1);
                players.get(rank).setHealth(healthyPoint);
                System.out.println("Your new healthy point is"+healthyPoint);
                break;
            case 2:
                System.out.println("Which rank are you on the list?");
                int rank2=input.nextInt()-1;
                System.out.println("You cooked a mushroom pizza");
                int healthyPoint2 =players.get(rank2).getrHealthy();
                healthyPoint2+=400;
                players.get(rank2).setItem(food2);
                players.get(rank2).setHealth(healthyPoint2);
                System.out.println("Your new healthy point is"+healthyPoint2);
                break;
            case 3:
                System.out.println("Which rank are you on the list?");
                int rank3=input.nextInt()-1;
                System.out.println("You cooked a fried egg ");
                int healthyPoint3 =players.get(rank3).getrHealthy();
                healthyPoint3+=300;
                players.get(rank3).setItem(food3);
                players.get(rank3).setHealth(healthyPoint3);
                System.out.println("Your new healthy point is"+healthyPoint3);
                break;
            case 4:
                System.out.println("Which rank are you on the list?");
                int rank4=input.nextInt()-1;
                System.out.println("You cooked a grilled fish");
                int healthyPoint4 = players.get(rank4).getrHealthy();
                healthyPoint4+=300;
                players.get(rank4).setItem(food4);
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
