package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LUCKFOUR {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());
    while(testCases-- > 0) {
      System.out.println(countOf4(Integer.parseInt(br.readLine())));
    }
  }
  
  private static int countOf4(int num) {
    int count = 0;
    while(num > 0) {
      if(num % 10 == 4) count++;
      num /= 10;
    }
    return count;
  }

}
