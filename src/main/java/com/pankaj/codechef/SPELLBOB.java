package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SPELLBOB {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String a = br.readLine();
      String b = br.readLine();
      if(isBob(a.toCharArray(), b.toCharArray())) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
  
  private static boolean isBob(char[] front, char[] back) {
    boolean result = false;
    if((front[0] == 'o' || back[0] == 'o') && ((front[1] == 'b' || back[1] == 'b') && (front[2] == 'b' || back[2] == 'b'))) { 
        result = true;
    } else if((front[1] == 'o' || back[1] == 'o') && ((front[0] == 'b' || back[0] == 'b') && (front[2] == 'b' || back[2] == 'b'))) {
        result = true;
    } else if((front[2] == 'o' || back[2] == 'o') && ((front[0] == 'b' || back[0] == 'b') && (front[1] == 'b' || back[1] == 'b'))) {
        result = true;
    }
    return result;
  }

}
