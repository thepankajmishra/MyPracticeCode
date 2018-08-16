package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDMOD {
  
  private static final long mod = 1000000007;

  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int tc = Integer.parseInt(br.readLine());
    while(/*tc-- > 0*/ true) {
//      String[] line = br.readLine().split(" ");
      /*long a = Long.parseLong(line[0].trim());
      long b = Long.parseLong(line[1].trim());
      long n = Long.parseLong(line[2].trim());*/
      for(long n = 1000000000000l;n>=1000000000;n--) {
      for(long a = 1000000000000l;a>=1000000000;a--) {
        for(long b = 1 ;b<=a;b++) {
            System.out.println("a = "+a+" , b = "+b+" , n = "+n);
            long numB = getDifference(a, b);
            if(numB == 1) {
              System.out.println(1);
            } else {
              long numA = numB == 0 ? (getPower(a, n) + getPower(b, n)) : (getPower(a, n, numB) + getPower(b, n, numB));
              numB = getGCD(numA, numB);
              System.out.println(numB != 0 && numB >= mod ? numB % mod : numB);
            }
          }
          }
        }
      break;
      }
      /*long numB = getDifference(a, b);
      if(numB == 1) {
        System.out.println(1);
      } else {
        long numA = numB == 0 ? (getPower(a, n) + getPower(b, n)) : (getPower(a, n, numB) + getPower(b, n, numB));
        numB = getGCD(numA, numB);
        System.out.println(numB != 0 && numB >= mod ? numB % mod : numB);
      }
    }*/
  }
  
  private static long getPower(long num, long power, long mod) {
    long result=1;
    if(num % mod == 0) return 0;
    while(power>0)
    {
        if(power % 2 ==1)
            result= (result % mod * num % mod) % mod ;
        num = (num % mod * num % mod) % mod;
        power = power/2;
        if(result == 0) return 0;
    }
    return result;
  }
  
  private static long getPower(long num, long power) {
    long result=1;
    if(num % mod == 0) return 0;
    while(power>0)
    {
        if(power % 2 == 1)
            result= (result % mod * num % mod) % mod ;
        num = (num % mod *num % mod) % mod;
        power = power/2;
        if(result == 0) return 0;
    }
    return result;
  }
  
  private static long getDifference(long a, long b) {
    return (a % mod  - b % mod + mod) % mod;
  }
  
  private static long getGCD(long a, long b) {
    if(a == 0) return b;
    if(a > b) return getGCD(b, a);
    else {
      if(b % a == 0) return a;
      return getGCD(b % a, a);
    }
  }

}
