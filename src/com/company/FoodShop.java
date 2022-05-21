package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class FoodShop extends SafePlace {
    public FoodShop(Player player) {
        super(player,"Food Shop");
    }
    Scanner input= new Scanner(System.in);
    @Override
    public boolean getLocation() {
      return true;
    }

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
                    System.out.println("You bought a satisfying salad ");
                    int healthyPoint = player.getrHealthy();
                    int money=player.getMoney();
                    healthyPoint += 200;
                    money-=300;
                    player.setHealth(healthyPoint);
                    player.setMoney(money);
                    System.out.println("Your new healthy point is" + healthyPoint);
                    System.out.println("The remaining money is"+money);
                    break;
                case 2:
                    System.out.println("You bought a mushroom pizza");
                    int healthyPoint2 = player.getrHealthy();
                    int money2=player.getMoney();
                    healthyPoint2 += 300;
                    money2-=400;
                    player.setHealth(healthyPoint2);
                    player.setMoney(money2);
                    System.out.println("Your new healthy point is" + healthyPoint2);
                    System.out.println("The remaining money is"+money2);
                    break;
                case 3:
                    System.out.println("You bought a fried egg ");
                    int healthyPoint3 = player.getrHealthy();
                    int money3=player.getMoney();
                    healthyPoint3 += 200;
                    money3-=200;
                    player.setHealth(healthyPoint3);
                    player.setMoney(money3);
                    System.out.println("Your new healthy point is" + healthyPoint3);
                    System.out.println("The remaining money is"+money3);
                    break;
                case 4:
                    System.out.println("You bought a grilled fish");
                    int healthyPoint4 = player.getrHealthy();
                    int money4=player.getMoney();
                    healthyPoint4 += 100;
                    money4-=100;
                    player.setHealth(healthyPoint4);
                    player.setMoney(money4);
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
                    System.out.println("You bought a satisfying salad ");
                    int healthyPoint =player.getrHealthy();
                    healthyPoint+=300;
                    player.setHealth(healthyPoint);
                    System.out.println("Your new healthy point is"+healthyPoint);
                    break;
                case 2:
                    System.out.println("You bought a mushroom pizza");
                    int healthyPoint2 =player.getrHealthy();
                    healthyPoint2+=400;
                    player.setHealth(healthyPoint2);
                    System.out.println("Your new healthy point is"+healthyPoint2);
                    break;
                case 3:
                    System.out.println("You bought a fried egg ");
                    int healthyPoint3 =player.getrHealthy();
                    healthyPoint3+=300;
                    player.setHealth(healthyPoint3);
                    System.out.println("Your new healthy point is"+healthyPoint3);
                    break;
                case 4:
                    System.out.println("You bought a grilled fish");
                    int healthyPoint4 =player.getrHealthy();
                    healthyPoint4+=300;
                    player.setHealth(healthyPoint4);
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



