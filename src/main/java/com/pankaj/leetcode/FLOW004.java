package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW004 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());
    while(testCases-- > 0) {
      System.out.println(sumOfFirstAndLastDigit(Integer.parseInt(br.readLine())));
    }
  }
  
  private static int sumOfFirstAndLastDigit(int num) {
    int sum = 0;
    sum += (num % 10);
    num /= 10;
    while(num >= 10) {
      num /= 10;
    }
    sum += num;
    return sum;
  }

}
