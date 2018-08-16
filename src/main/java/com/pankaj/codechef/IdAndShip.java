package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class IdAndShip {
  
  private static Map<String, String> map = new HashMap<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    populate();
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      System.out.println(map.get(br.readLine().toLowerCase()));
    }
  }
  
  private static void populate() {
    map.put("b", "BattleShip");
    map.put("c", "Cruiser");
    map.put("d", "Destroyer");
    map.put("f", "Frigate");
  }

}
