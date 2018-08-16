package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Josephus {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /*int testCases = Integer.parseInt(br.readLine());
    while(testCases-- > 0) {
      int num = Integer.parseInt(br.readLine());
      System.out.println(josephus(num, 2));
    }*/
    for(int i=1;i<=32;i++) {
      System.out.println(josephus(i, 2));
    }
  }
  
  private static int josephus(int num, int k) {
    if(num == 1) return 1;
    else {
      return (josephus(num - 1, k + 1) + k - 1) % num + 1;
    }
  }

}
