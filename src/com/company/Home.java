package com.company;

public class Home extends SafePlace{

    public Home(Player player) {
        super(player, "Home");
    }

    @Override
    public boolean getLocation() {
        System.out.println("you are at home now....");
        player.setHealth(getPlayer().getrHealthy());
        System.out.println("your health is full now."); // or your health has increased;
        return true;
    }
}
