package com.company;

public class Sword extends Weapons{
    private boolean shortSword;
    private boolean longSword;



    public Sword(String name, int weight, int rarity, double priceOfItem, boolean shortSword,boolean longSword,int attack) {
        super(name, weight, "Weapons", rarity, priceOfItem, 0,attack);
        this.shortSword = shortSword;
        this.longSword = longSword;



    }

    public boolean isShortSword() {
        return shortSword;
    }

    public void setShortSword(boolean shortSword) {
        this.shortSword = shortSword;
    }

    public boolean isLongSword() {
        return longSword;
    }

    public void setOngSword(boolean longSword) {
        this.longSword = longSword;
    }

    Sword summitShaper = new Sword("summit sharper", 2,5,70000,false,true,46);
    Sword mistspiltterReforged = new Sword("mistspiltter reforged",2,5,65000,true,false,48);
    Sword skywordBlade = new Sword("skyword blade",3,5,68000,false,true,46);



    public int calculateDamage(Sword sword) {
       return 10;
    }


}
