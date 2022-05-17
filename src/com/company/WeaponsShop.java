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
        Objects objects = new Objects();
        ArrayList<Weapons> weaponsArrayList = new ArrayList<>();
        boolean c = true;
        while (c) {
            int choice2 = sc.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("printing swords");
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Sword")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }

                    }
                    System.out.println("other choice: ");
                    break;
                case 2:
                    System.out.println("printing claymores");
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Claymore")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }

                    }
                    System.out.println("other choice: ");
                    break;
                case 3:
                    System.out.println("printing polearm");
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Polearms")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }

                    }
                    System.out.println("other choice: ");
                    break;
                case 4:
                    System.out.println("printing wand");
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Wand")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }

                    }
                    System.out.println("other choice: ");
                    break;
                case 5:
                    System.out.println("printing catalyst");
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Catalyst")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }

                    }
                    System.out.println("other choice: ");
                    break;
                case 6:
                    System.out.println("printing scythe");
                    objects.allWeapons(weaponsArrayList);
                    for (int i = 0; i < weaponsArrayList.size(); i++) {
                        if (weaponsArrayList.get(i).getItemType().equals("Scythe")) {
                            objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                        }

                    }
                    break;
                case 7:
                   Game.mapList();
                    c = false;
                    break;

                default:
                    System.out.println("You entered numbers other than 1, 2, 3, 4,5,6 and 7. Please enter one of these numbers");
                    break;
            }
        }
        return true;
    }


}
