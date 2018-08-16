package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HPYNOS {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int count = 0;
    while(num != 1) {
      num = getSumOfSquareOfDigits(num);
      count++;
      if(count > 20) {
        break;
      }
    }
    if(num == 1) {
      System.out.println(count);
    } else {
      System.out.println(-1);
    }
  }
  
  private static int getSumOfSquareOfDigits(int num) {
    int sum = 0;
    while(num > 0) {
      sum += (num % 10) * (num % 10);
      num /= 10;
    }
    return sum;
  }

}
