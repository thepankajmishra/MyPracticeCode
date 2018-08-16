package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recipe {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int len = Integer.parseInt(line[0]);
      int[] arr = new int[len];
      for(int i=0;i<len;i++) {
        arr[i] = Integer.parseInt(line[i+1]);
      }
      showRecipe(arr);
    }

  }
  
  private static void showRecipe(int[] arr) {
    int gcd = arr[0];
    for(int i=1;i<arr.length;i++) {
      gcd = getGCD(gcd, arr[i]);
      if(gcd == 1) break;
    }
    
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i]/gcd +" ");
    }
    System.out.println();
  }
  
  private static int getGCD(int a, int b) {
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
