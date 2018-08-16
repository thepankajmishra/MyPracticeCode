package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUMPOWER {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());
    while(testCases-- > 0) {
      String[] line = br.readLine().split(" ");
      int window = Integer.parseInt(line[1]);
      char[] carr = br.readLine().toCharArray();
      System.out.println(countPower(carr, window));
    }
  }
  
  private static int countPower(char[] carr, int window) {
    int count = 0;
    for(int i=0;i<carr.length - window;i++) {
      for(int j=i;j<i+window;j++) {
        if(carr[j] != carr[j+1]) count++;
      }
    }
    return count;
  }

}
