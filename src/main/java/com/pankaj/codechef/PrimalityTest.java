package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimalityTest {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      int num = Integer.parseInt(br.readLine());
      System.out.println(isPrime(num));
    }
  }
  
  private static String isPrime(int num) {
    if(num == 1) return "no";
    for(int i=2;i*i<=num;i++) {
      if(num % i == 0) {
        return "no";
      }
    }
    return "yes";
  }

}
