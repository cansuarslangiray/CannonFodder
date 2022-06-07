package com.company;

import java.util.ArrayList;

public abstract class Location implements Locateable{

   protected ArrayList<Player> players;
   protected String areaName;
   protected static int advRank = 0;

   public Location(ArrayList<Player> players) {
      this.players = players;

   }

   public int getAdvRank() {
      return advRank;
   }

   public void setAdvRank(int advRank) {
      this.advRank = advRank;
   }

   public ArrayList<Player> getPlayers() {
      return players;
   }

   public void setPlayers(ArrayList<Player> players) {
      this.players = players;
   }

   public String getAreaName() {
      return areaName;
   }

   public void setAreaName(String areaName) {
      this.areaName = areaName;
   }
}


