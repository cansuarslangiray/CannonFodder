package com.company;

public class WeaponsShop extends SafePlace{
    public WeaponsShop(Player player) {
        super(player, "Weapons Shop");
    }

    @Override
    public boolean getLocation() {
        return true;
    }
}
