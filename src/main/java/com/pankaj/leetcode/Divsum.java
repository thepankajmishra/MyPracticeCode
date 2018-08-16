package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divsum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());
    while(testCases-- > 0) {
      int num = Integer.parseInt(br.readLine());
      int count = 1;
      if(num == 1) 
        count = 0;
      else {
        for(int i=2;i*i<=num;i++) {
          if(num % i == 0) {
            count += (i * i == num) ? i : (i + (num/i));
          }
        }
      }
      System.out.println(count);
    }
  }

}
