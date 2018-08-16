package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TRISQ {

  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      System.out.println(getSquareCount(Integer.parseInt(br.readLine())));
    }
  }
  
  private static int getSquareCount(int num) {
    int start = num % 2 == 0 ? 2 : 3;
    int sum = 0;
    int value = 1;
    while(start < num) {
      start += 2;
      sum += value++;
    }
    return sum;
  }

}
