package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Objects;

public class Characters {
    SecureRandom secureRandom = new SecureRandom();

    private ArrayList<ArrayList<Player>> Characters = new ArrayList<>();


    public ArrayList<ArrayList<Player>> getCharacters() {
        return Characters;
    }

    public void setCharacters(ArrayList<ArrayList<Player>> characters) {
        Characters = characters;
    }

    public  Characters(){


         Wizard wizardPlayer = new Wizard("Wizard","Nao Tomori",5);
         Wizard wizardPlayer1 = new Wizard("Wizard","Yu Otosaka",25);
         Wizard wizardPlayer2 = new Wizard("Wizard","Ayumi Otosaka",56);
         Wizard wizardPlayer3 = new Wizard("Wizard","Misa Kurobane",56);
         Wizard wizardPlayer4 = new Wizard( "Wizard","Roswaal l Mathers",56);

         Elf elfPlayer = new Elf("Elf", "Usagi Tsukino",60);
         Elf elfPlayer1 = new Elf("Elf","Rei Hino",65);
         Elf elfPlayer2 = new Elf("Elf", "Hotaru Tomoe",68);
         Elf elfPlayer3 = new Elf("Elf","Rem",75);
         Elf elfPlayer4 = new Elf("Elf","Emilia",75);

         Knight knightPlayer = new Knight("Knight","Reinhard Van Astrea",81);
         Knight knightPlayer1 = new Knight("Knight","Kyoko Kirigiri",89);
         Knight knightPlayer2 = new Knight("Knight","Toko Fukawa",99);
         Knight knightPlayer3 = new Knight("Knight", "Byakuya Togami",69);
         Knight knightPlayer4 = new Knight("Knight","Makoto Naegi",85);

         Warrior worrierPlayer = new Warrior("Worrier", "Nagito Komaeda",86);
         Warrior worrierPlayer1 = new Warrior("Worrier", "Touka Kirişima",87);
         Warrior worrierPlayer2 = new Warrior("Worrier", "Kaneki Ken",97);
         Warrior worrierPlayer3 = new Warrior("Worrier", "Rize Kamishiro",97);
         Warrior worrierPlayer4 = new Warrior("Worrier","Juuzou Suzuya",85);

         Lancer lancerPlayer = new Lancer("Lancer", "Toga himiko",75);
         Lancer lancerPlayer1 = new Lancer("Lancer", "Shoto Todoroki",86);
         Lancer lancerPlayer2 = new Lancer("Lancer", "Katsuki Bakugo",96);
         Lancer lancerPlayer3 = new Lancer("Lancer", "Shota Aizawa",960);
         Lancer lancerPlayer4 = new Lancer("Lancer", "Tomura Shigaraki",63);

         Healer healerPlayer = new Healer("Healer","Shinoa Hiragi",85);
         Healer healerPlayer1 = new Healer("Healer", "Yuichiro Hyakuya",89);
         Healer healerPlayer2 = new Healer("Healer" ,"Guren Ichinose", 90);
         Healer healerPlayer3  =new Healer("Healer", "Yuri Pilsetsky",100);
         Healer healerPlayer4 = new Healer("Healer" ,"Victor Nikiforov", 520);

        ArrayList<Player> wizardArrayList = new ArrayList<>();
        ArrayList<Player> worrierArrayList = new ArrayList<>();
        ArrayList<Player> lancerArrayList = new ArrayList<>();
        ArrayList<Player> elfArrayList = new ArrayList<>();
        ArrayList<Player> knightArrayList = new ArrayList<>();
        ArrayList<Player> healerArrayList = new ArrayList<>();



         healerArrayList.add(healerPlayer);
        healerArrayList.add(healerPlayer1);
        healerArrayList.add(healerPlayer2);
        healerArrayList.add(healerPlayer3);
        healerArrayList.add(healerPlayer4);


         wizardArrayList.add(wizardPlayer);
         wizardArrayList.add(wizardPlayer1);
         wizardArrayList.add(wizardPlayer2);
         wizardArrayList.add(wizardPlayer3);
         wizardArrayList.add(wizardPlayer4);


         elfArrayList.add(elfPlayer);
         elfArrayList.add(elfPlayer1);
         elfArrayList.add(elfPlayer2);
         elfArrayList.add(elfPlayer3);
         elfArrayList.add(elfPlayer4);

        worrierArrayList.add(worrierPlayer);
        worrierArrayList.add(worrierPlayer1);
        worrierArrayList.add(worrierPlayer2);
        worrierArrayList.add(worrierPlayer3);
        worrierArrayList.add(worrierPlayer4);

        knightArrayList.add(knightPlayer);
        knightArrayList.add(knightPlayer1);
        knightArrayList.add(knightPlayer2);
        knightArrayList.add(knightPlayer3);
        knightArrayList.add(knightPlayer4);

        lancerArrayList.add(lancerPlayer);
        lancerArrayList.add(lancerPlayer1);
        lancerArrayList.add(lancerPlayer2);
        lancerArrayList.add(lancerPlayer3);
        lancerArrayList.add(lancerPlayer4);

        Characters.add(wizardArrayList);
        Characters.add(worrierArrayList);
        Characters.add(knightArrayList);
        Characters.add(elfArrayList);
        Characters.add(lancerArrayList);
        Characters.add(healerArrayList);
    }




    public ArrayList<Player> yourCharacters(){
        SecureRandom random = new SecureRandom();
        ArrayList<Player> ingame = new ArrayList<>();
       // arr.get(0).get(0).getWeapons().

        System.out.println("hello");
        System.out.println((getCharacters().get(0).get(0)));
        boolean a =true;
        while (a){
            double allMoney =0;
            int c = random.nextInt(getCharacters().size());
            if(ingame.size()==0){
            ingame.add(getCharacters().get(c).get(random.nextInt(4)));
            }
            Player player = getCharacters().get(c).get(random.nextInt(4));
            if(ingame.size()==1){
              if(!Objects.equals(player.getType(), ingame.get(0).getType())){
                ingame.add(player);

            }
            }
            if(ingame.size()==2){
                if(!Objects.equals(player.getType(), ingame.get(0).getType()) && !Objects.equals(player.getType(), ingame.get(1).getType())){
                    ingame.add(player);
                    a=false;
                }
            }
            System.out.println("cs: " + getCharacters().size());
            allMoney +=player.getMoney();
            player.selectC();
            player.setAllMoney(allMoney);
        }


        return ingame;
    }

    public void wishCharacter(){

    }




    }


