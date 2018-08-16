package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDAndLCM {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      long a = Long.parseLong(line[0]);
      long b = Long.parseLong(line[1]);
      long gcd = getGCD(a, b);
      System.out.println(gcd +" "+ (a * b)/gcd);
    }

  }
  
  private static long getGCD(long a, long b) {
    if(a <= b) {
      if(b % a == 0) {
        return a;
      } else {
        return getGCD(b%a, a);
      }
    } else {
      return getGCD(b, a);
    }
  }

}
