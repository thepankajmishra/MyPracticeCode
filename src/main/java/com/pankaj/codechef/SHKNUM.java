package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SHKNUM {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      long num = Long.parseLong(br.readLine());
      if(num == 1) {
        System.out.println(2);
        continue;
      }
      long minNumber = getMinimum2Power(num) ;
      if(minNumber == num) {
        System.out.println(1);
        continue;
      }
      long remainingNum = num - minNumber;
      if(isPower2(remainingNum)) {
        System.out.println(0);
      } else {
        long minNumber2 = getMinimum2Power(remainingNum);
        if(minNumber == 2*minNumber2) {
          if(remainingNum - minNumber2 < 2*minNumber2 + 1 - remainingNum) {
            System.out.println(remainingNum - minNumber2);
          } else {
            System.out.println(2*minNumber2 - remainingNum + 1);
          }
        } else {
          if(remainingNum - minNumber2 < 2*minNumber2 - remainingNum) {
            System.out.println(remainingNum - minNumber2);
          } else {
            System.out.println(2*minNumber2 - remainingNum);
          }
        }
      }
      
    }
  }
  
  private static long getMinimum2Power(long num) {
    long result = 1;
    for(;result < num;) {
      result *= 2;
    }
    return result == num ?  result : result/2;
  }
  
  private static boolean isPower2(long num) {
    while(num >= 1 && num % 2 == 0) {
      num /= 2;
    }
    return num == 1 ? true : false;
  }

}
