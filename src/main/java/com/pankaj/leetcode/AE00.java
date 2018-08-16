package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AE00 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int count = num;
    for(int i=2;i*i <= num;i++) {
      count += ((num/i) - i + 1);
    }
    System.out.println(count);
  }
}
