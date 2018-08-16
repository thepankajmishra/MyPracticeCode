package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBlockGame {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String line = br.readLine();
      System.out.println(isPallindrome(line));
    }
  }
  
  private static String isPallindrome(String str) {
    int i = 0;
    int j = str.length() - 1;
    while(i < j) {
      if(str.charAt(i++) != str.charAt(j--)) return "losses";
    }
    return "wins";
  }

}
