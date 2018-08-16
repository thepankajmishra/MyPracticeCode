package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class PINS {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    for(int i=0;i<tc;i++) {
        int num = Integer.parseInt(br.readLine());
        if(num == 1) {
          System.out.println(1+" "+1);
        } else {
          System.out.println(1+" "+1+getResult(num/2));
        }
    }
  }
  
  private static String getResult(int num) {
    StringBuilder result = new StringBuilder("");
    StringBuilder temp = new StringBuilder("0");
    for(int i=1;i<=num;) {
      if(i == 1) {
        temp = new StringBuilder("0");
      } else {
        temp.append(temp);
      }
      if(i == num) {
        result.append(temp);
        break;
      } else if(i*2 > num) {
        num -= i;
        i = 1;
        result.append(temp);
      } else {
        i = i * 2;
      }
    }
    return result.toString();
    
  }
  
}
