package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.security.SecureRandom;

public class Home extends SafePlace{

    public Home(ArrayList<Player> players) {
        super(players);
    }
    SecureRandom random = new SecureRandom();
    @Override
    public boolean getLocation() {
        System.out.println("you are at home now....");
        for(int i = 0 ; i<players.size();i++) {
            players.get(i).setHealth(players.get(i).getrHealthy());
        }
        System.out.println("your health has increased.");

        System.out.println("Do you want to play with your pet ?");
        System.out.println("1-Yes");
        System.out.println("2-No");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if( choice==1){
            double nMoney = players.get(1).getAllMoney() + (random.nextInt(49) + 1) ;
            players.get(1).setAllMoney(nMoney);
            System.out.println("Your pet rewarded you for playing with it");
        }

        return true;

    }
}