package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class WeaponsShop extends SafePlace{
    public WeaponsShop(Player player) {
        super(player, "Weapons Shop");
    }
     Scanner sc = new Scanner(System.in);

    @Override
    public boolean getLocation() {
        System.out.println("****************");
        return super.getLocation();
    }


}
