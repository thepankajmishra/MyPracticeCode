package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUM239 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());
    while(testCases-- > 0) {
      String[] line = br.readLine().split(" ");
      int left = Integer.parseInt(line[0]);
      int right = Integer.parseInt(line[1]);
      System.out.println(countOfOccurrenceOf239(left, right));
    }
    
  }
  
  private static int countOfOccurrenceOf239(int left, int right) {
    int count = 0;
    if(is239(left)) count++;
    while(left <= right) {
      if(left + 10 > right) break;
      left += 10;
      count += 3;
    }
    
    if(left < right) {
      for(int i=left+1;i<=right;i++) {
        if(is239(i)) count++;
      }
    }
    return count;
  }
  
  private static boolean is239(int num) {
    return num % 10 == 2 || num % 10 == 3 || num % 10 == 9; 
  }

}
