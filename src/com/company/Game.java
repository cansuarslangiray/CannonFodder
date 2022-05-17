package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    static Player player; // static ??
    static Location location; // static ???
    static Scanner sc = new Scanner(System.in);

    public void logIn(){
        System.out.println("Welcome the game!!!");
        System.out.println("Before to start game, you have to know something....");
        System.out.println("Firstly, When you start the game, you will have characters with 3 different abilities , and have one wish. With this wish, you will get the character or items that will help you during the game, such as weapons..");
        System.out.println("Good luck!!!");
        System.out.println("You can further develop the character you get by wishing, or you can create new characters by wishing again with the Primogen you earn each time you fight.");
        System.out.println("the adventure rang and your character will start from the lowest level and each time you fight and get stronger the level of the adventure rang will change.");
        System.out.println("As the level of the adventure rang changes, the difficulty level of the enemies you encounter will increase.");
        System.out.println("Secondly, If you are not healthy enough, you can buy food with the coins you earned during the fight, or you can make your own with the materials you earned during the fight. You can also go home and increase your health");
        System.out.println("You can also buy items that will increase your character's powers.");
        System.out.println("if you press the m key on the keyboard, you will see the game map");
        System.out.println("You can collect objects on the ground when you press the f key.");
        System.out.println("Finally, You may encounter different numbers and different enemies in every battlefield you go to.");
        System.out.println("Before fighting, you can get information about the enemies there, such as their damage value and health, and you can decide accordingly. Fight or run");
        System.out.println("DO NOT FORGET, if you lose your one character against the enemy you will lose 10 Primogen, if you you lose your two characters against the enemy you will lose 10 Primogen");
        System.out.println("VERY IMPORTANCE!!!, if you lose three character against the enemy you will die");
        System.out.println("and the game is over :(");
        System.out.println("You can start now , have fun :)");
        System.out.println();





        /*for(int i = 0 ; i< 1; i++){
            Characters characters = new Characters();
            characters.wizardPrintInfo();
            player = characters.wizardsGet().get(i);
            System.out.println(player.getCharacterName());
        }*/

    }
    public void firstPagePrintInfo(){
        System.out.println("Characters Information");
        System.out.println("--------------------------");
        System.out.println("press 1 for information about Wizards");
        System.out.println("press 2 for information about Worriers");
        System.out.println("press 3 for information about Elves");
        System.out.println("press 4 for information about Knight");
        System.out.println("press 5 for information about Lancer");
        System.out.println("press 6 to go to first page");
        System.out.println("press 7 to exit this page");
        System.out.println("Your choice ?");
    }

    public  void charactersInfo(){
        firstPagePrintInfo();
        Characters characters = new Characters();
        boolean b = true;
        while (b){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Information of the wizards in the game");
                    Characters.characterPrintInfo(characters.wizardsGet());
                    firstPagePrintInfo();
                    break;
                case 2:
                    System.out.println("Information of the worrier in the game");
                    Characters.characterPrintInfo(characters.worriersGet());
                    firstPagePrintInfo();
                    break;
                case 3:
                    System.out.println("Information of the elves in the game");
                    Characters.characterPrintInfo(characters.elfGet());
                    firstPagePrintInfo();
                    break;
                case 4:
                    System.out.println("Information of the knights in the game");
                    Characters.characterPrintInfo(characters.knightsGet());
                    firstPagePrintInfo();

                    break;
                case 5:
                    System.out.println("Information of the lancers in the game");
                    Characters.characterPrintInfo(characters.lancerGet());
                    firstPagePrintInfo();
                    break;
                case 6:
                    firstPagePrintInfo();
                    break;
                case 7:
                    location = new Home(player);
                    location.getLocation();
                    b = false;
                    break;

                default:
                    System.out.println("You entered a number different from the numbers 1 to 7. Please enter one of the numbers from 1 to 7.");
                    System.out.println("Your choice ?");
                    break;

            }

        }

    }
    public static void mapList(){
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("currently displaying the map.....");
        System.out.println("press 1 to view safe areas");
        System.out.println("press 2 to view battlefields");
        System.out.println("press 3 to leave this page");
        System.out.println("Where do you want to go ?");
    }
    public void map(){
        mapList();
        boolean a = true;
         while (a) {
             int choice = sc.nextInt();
             switch (choice) {
                 case 1:
                     System.out.println("press 1 to return home");
                     System.out.println("press 2 to go to the food shop");
                     System.out.println("press 3 to go to the weapons shop");
                     System.out.println("press 4 to go to the cloths shop");
                     System.out.println("press 5 to go to first page");
                     System.out.println("Where do you want to go ?");
                     int number =sc.nextInt();
                     switch (number){
                         case 1:
                           location = new Home(player);
                           location.getLocation();

                           break;
                         case 2:
                             location = new FoodShop(player);
                             location.getLocation();

                             break;
                         case 3:
                             Objects objects = new Objects();
                             ArrayList<Weapons> weaponsArrayList = new ArrayList<>();
                             System.out.println();
                             System.out.println("welcome to the weapon shop");
                             System.out.println("--------------------------------");
                             System.out.println("press 1 to see swords");
                             System.out.println("press 2 to see claymores");
                             System.out.println("press 3 to see polearms");
                             System.out.println("press 4 to see wand");
                             System.out.println("press 5 to see catalyst");
                             System.out.println("press 6 to see scythe");
                             System.out.println("your choice ? ");
                             int choice2 = sc.nextInt();
                             switch (choice2){
                                 case 1:
                                     System.out.println("printing swords");
                                     objects.allWeapons(weaponsArrayList);
                                     for (int i = 0; i < weaponsArrayList.size() ; i++) {
                                         if(weaponsArrayList.get(i).getItemType().equals("Sword")){
                                             objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                                         }

                                     }
                                     break;
                                 case 2:
                                     System.out.println("printing claymores");
                                     objects.allWeapons(weaponsArrayList);
                                     for (int i = 0; i < weaponsArrayList.size() ; i++) {
                                         if(weaponsArrayList.get(i).getItemType().equals("Claymore")){
                                             objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                                         }

                                     }
                                     break;
                                 case 3:
                                     System.out.println("printing polearm");
                                     objects.allWeapons(weaponsArrayList);
                                     for (int i = 0; i < weaponsArrayList.size() ; i++) {
                                         if(weaponsArrayList.get(i).getItemType().equals("Polearms")){
                                             objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                                         }

                                     }
                                     break;
                                 case 4:
                                     System.out.println("printing wand");
                                     objects.allWeapons(weaponsArrayList);
                                     for (int i = 0; i < weaponsArrayList.size() ; i++) {
                                         if(weaponsArrayList.get(i).getItemType().equals("Wand")){
                                             objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                                         }

                                     }
                                     break;
                                 case 5:
                                     System.out.println("printing catalyst");
                                     objects.allWeapons(weaponsArrayList);
                                     for (int i = 0; i < weaponsArrayList.size() ; i++) {
                                         if(weaponsArrayList.get(i).getItemType().equals("Catalyst")){
                                             objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                                         }

                                     }
                                     break;
                                 case 6:
                                     System.out.println("printing scythe");
                                     objects.allWeapons(weaponsArrayList);
                                     for (int i = 0; i < weaponsArrayList.size() ; i++) {
                                         if(weaponsArrayList.get(i).getItemType().equals("Scythe")){
                                             objects.weaponsShopPrintInfo(weaponsArrayList.get(i));
                                         }

                                     }
                                     break;


                             }
                             location = new WeaponsShop(player);
                             location.getLocation();

                             break;
                         case 4:
                             location = new ClothsShop(player);
                             location.getLocation();

                             break;
                         case 5:
                             mapList();
                             choice = sc.nextInt();
                             break;
                         default:
                             System.out.println("You entered numbers other than 1, 2, 3, 4. Please enter one of these numbers");
                             break;
                     }
                     break;

                 case 2:
                     System.out.println("press 1 to Moonhallow. In this area, you may encounter siren or demon hunter. ");
                     System.out.println("press 2 to Wildfront. In this area, you may encounter goblin, rouge or monk ");
                     System.out.println("press 3 to Oceangulf. In this, you may encounter death knight, demon hunter or siren ");
                     System.out.println("press 4 to go to first page");
                     System.out.println("Where do you want to go ?");
                     int number2 = sc.nextInt();
                    /* switch (number2){
                         case 1:
                             location = new Moonhallow(player,)
                     }
                     break;*/

                 case 3:
                     System.out.println("currently leaving this page....");
                     a=false;
                     break;

                 default:
                     System.out.println("You entered a character other than 1 , 2 or 3 !!!");
                     System.out.println("Please enter the numbers 1 , 2 or 3");
                     System.out.println("Your choice ?");

                     break;
             }
         }

    }

}
