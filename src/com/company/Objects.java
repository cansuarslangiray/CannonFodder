package com.company;


import java.util.ArrayList;

public class Objects {

    ArrayList<Weapons> WandArrayList = new ArrayList<>();
    ArrayList<Weapons> CatalystArrayList = new ArrayList<>();
    ArrayList<Weapons> ClaymoreArrayList = new ArrayList<>();
    ArrayList<Weapons> SwordArrayList = new ArrayList<>();
    ArrayList<Weapons> PolearmsArrayList = new ArrayList<>();
    ArrayList<Weapons> ScytheArrayList = new ArrayList<>();
    ArrayList<Weapons> ShieldArrayList = new ArrayList<>();
    private ArrayList<Armors> HelmetArrayList = new ArrayList<>();
    private ArrayList<Armors> ChestplateArrayList = new ArrayList<>();
    private ArrayList<Armors> BootsArrayList = new ArrayList<>();
    ArrayList<Food> saladArraylist= new ArrayList<>();
    ArrayList<Food> pizzaArrayList= new ArrayList<>();
    ArrayList<Food> eggArrayList= new ArrayList<>();
    ArrayList<Rewards> Rewards = new ArrayList<>();




    public Objects(){
        Armors helmet1 = new Armors("Dragon Helmet","Helmet",5,15,20,1,100,2);
        Armors helmet2 = new Armors("Night Mask","Helmet",4,20000,12,1,100,1.5);
        Armors helmet3 = new Armors("Water Helmet","Helmet",3,10000,6,1,100,1);

        Armors Chesplate1 = new Armors("Dragon Heart","Chestplate",5,80000,40,1,100,5);
        Armors Chesplate2 = new Armors("Night Skin","Chestplate",4,30000,24,1,100,4);
        Armors Chesplate3 = new Armors("Waterfall","Chestplate",3,20000,12,1,100,3);

        Armors Boots1 = new Armors("Dragon Claw","Boots",5,20000,10,1,100,1);
        Armors Boots2 = new Armors("Night Fall","Boots",4,10000,6,1,100,0.5);
        Armors Boots3 = new Armors("Splash","Boots",3,5000,3,1,100,0.25);

        Weapons wand = new Wand("Exiled Heart","Wand",4,50000,4,1,100,0.5);
        Weapons wand1 = new Wand(" Touch of Woe","Wand",3,40000,6,1,100,0.9);
        Weapons wand2 = new Wand(" Bag of the Night","Wand",5,60000,8,1,100,0.4);

        Weapons catalyst = new Catalyst(" Pact of the Night","Catalyst",5,68200,7,1,100,0.7);
        Weapons catalyst1 = new Catalyst("Nightfall","Catalyst",4,45000,6,1,100,0.9);
        Weapons catalyst2 = new Catalyst("Starlight","Catalyst",3,33000,4,1,100,1);

        Weapons sword = new Sword("summit sharper", "Sword",4,10,4,1,100,1.5);
        Weapons sword1 = new Sword("mistspiltter reforged","Sword",5,68000,6,1,100,1.6);
        Weapons sword2 = new Sword("skyword blade","Sword",3,65000,3,1,100,1.9);

        Weapons polearms = new Polearms(" Incarnation of Immortality","Polearms",3,55000,3,1,100,1.2);
        Weapons polearms1 = new Polearms(" Breaker of Horrid Dreams","Polearms",4,60000,4,1,100,1.1);
        Weapons polearms2 = new Polearms("Misery's End","Polearms",5,65000,7,1,100,0.75);

        Weapons scythe = new Scythe("Anguish","Scythe",4,80500,5,1,100,2.2);
        Weapons scythe1 = new Scythe("Stormfury Blade","Scythe",5,80000,7,1,100,2.1);
        Weapons scythe2 = new Scythe("Death's Claw","Scythe",3,75000,3,1,100,2.4);

        Weapons claymore = new Claymore("Amnesia","Claymore",4,48000,5,1,100,3.5);
        Weapons claymore1 = new Claymore("Hope's End","Claymore",5,50000,7,1,100,3.3);
        Weapons claymore2 = new Claymore(" Emissary of the Whispers","Claymore",3,54000,4,1,100,3.4);

        Weapons shield = new Shield("Thorn","Shield",5,5200,7,1,100,5);
        Weapons shield1 = new Shield("Round Shield","Shield",4,4200,5,1,100,5);
        Weapons shield2 = new Shield("Dragon Crest Shield","Shield",3,2200,4,1,100,7);



        Food food1= new Food("Satisfying Vegetable Salad","Food",70,300);
        Food food2= new Food("Satisfying Fruit Salad","Food",60,280);

        Food food3= new Food("Chicago Pizza","Food",80,400);
        Food food4 = new Food("California Pizza","Food",85,420);
        Food food5= new Food("Margarita Pizza", "Food",90,440);

        Food food6 = new Food("Cheesy Egg","Food",40,200);
        Food food7= new Food("Scrambled Egg", "Food",50,270);


        Rewards foodreward1 = new Rewards("Magic Mushroom(Food)","Food",75,40);
        Rewards foodreward2 = new Rewards("Tree Sap(Food)","Food",12,30);
        Rewards foodreward3 = new Rewards("Uncanny Leaf(Food)","Food",96,80);
        Rewards wepreward1 = new Rewards("Heart of Nature(Weapon)","Weapon",4,85,7,1,100,0.5);
        Rewards wepreward2 = new Rewards("Elder Wand(Weapon)","Weapons",5,5,8,1,100,0.4);
        Rewards wepreward3 = new Rewards("Silence of River(Weapon)","Weapons",3,10,6,1,100,0.3);
        Rewards primogen  =  new Rewards("Primogen","Primogen",800);

        Rewards.add(wepreward1);
        Rewards.add(wepreward2);
        Rewards.add(wepreward3);
        Rewards.add(foodreward1);
        Rewards.add(foodreward2);
        Rewards.add(foodreward3);
        Rewards.add(primogen);


        getSaladArraylist().add(food1);
        getSaladArraylist().add(food2);
        getPizzaArrayList().add(food3);
        getPizzaArrayList().add(food4);
        getPizzaArrayList().add(food5);
        getEggArrayList().add(food6);
        getEggArrayList().add(food7);


        getHelmetArrayList().add(helmet1);
        getHelmetArrayList().add(helmet2);
        getHelmetArrayList().add(helmet3);
        getChestplateArrayList().add(Chesplate1);
        getChestplateArrayList().add(Chesplate2);
        getChestplateArrayList().add(Chesplate3);
        getBootsArrayList().add(Boots1);
        getBootsArrayList().add(Boots3);
        getBootsArrayList().add(Boots2);

        WandArrayList.add(wand);
        WandArrayList.add(wand1);
        WandArrayList.add(wand2);

        CatalystArrayList.add(catalyst);
        CatalystArrayList.add(catalyst1);
        CatalystArrayList.add(catalyst2);

        ClaymoreArrayList.add(claymore);
        ClaymoreArrayList.add(claymore1);
        ClaymoreArrayList.add(claymore2);

        SwordArrayList.add(sword);
        SwordArrayList.add(sword1);
        SwordArrayList.add(sword2);

        PolearmsArrayList.add(polearms);
        PolearmsArrayList.add(polearms1);
        PolearmsArrayList.add(polearms2);

        ScytheArrayList.add(scythe);
        ScytheArrayList.add(scythe1);
        ScytheArrayList.add(scythe2);

        ShieldArrayList.add(shield);
        ShieldArrayList.add(shield1);
        ShieldArrayList.add(shield2);


    }


    public ArrayList<Weapons> getWandArrayList() {
        return WandArrayList;
    }



    public ArrayList<Weapons> getCatalystArrayList() {
        return CatalystArrayList;
    }



    public ArrayList<Weapons> getClaymoreArrayList() {
        return ClaymoreArrayList;
    }



    public ArrayList<Weapons> getSwordArrayList() {
        return SwordArrayList;
    }

    public ArrayList<Weapons> getShieldArrayList() {
        return ShieldArrayList;
    }

    public ArrayList<Weapons> getPolearmsArrayList() {
        return PolearmsArrayList;
    }


    public ArrayList<Weapons> getScytheArrayList() {
        return ScytheArrayList;
    }


    public ArrayList<Armors> getHelmetArrayList() {
        return HelmetArrayList;
    }

    public ArrayList<Armors> getChestplateArrayList() {
        return ChestplateArrayList;
    }

    public ArrayList<Armors> getBootsArrayList() {
        return BootsArrayList;
    }

    public ArrayList<Food> getEggArrayList() {
        return eggArrayList;
    }

    public ArrayList<Food> getPizzaArrayList() {
        return pizzaArrayList;
    }

    public ArrayList<Food> getSaladArraylist() {
        return saladArraylist;
    }

    public ArrayList<Rewards> getRewards() {
        return Rewards;
    }
}
