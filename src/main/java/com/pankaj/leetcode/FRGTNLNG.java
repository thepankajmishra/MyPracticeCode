package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FRGTNLNG {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    
    while(tc -- > 0) {
      String[] line = br.readLine().split(" ");
      int len = Integer.parseInt(line[1]);
      String[] forgottenWords = br.readLine().split(" ");
      String[][] phrases = new String[len][];
      for(int i=0;i<len;i++) {
        phrases[i] = br.readLine().split(" ");
      }
      
      for(int i=0;i<forgottenWords.length;i++) {
        System.out.print(isForgottenWordPresent(forgottenWords[i], phrases)+" ");
      }
      System.out.println();
    }
  }

  private static String isForgottenWordPresent(String word , String[][] phrases) {
    for(int i=0;i<phrases.length;i++) {
      for(int j=1;j<phrases[i].length;j++) {
        if(word.equals(phrases[i][j])) {
          return "YES";
        }
      }
    }
    return "NO";
  }

}
