package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ALTARAY {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      int len = Integer.parseInt(br.readLine());
      int[] arr = new int[len];
      String[] line = br.readLine().split(" ");
      for(int i=0;i<len;i++) {
        arr[i] = Integer.parseInt(line[i]);
      }
      
      arr = getAlternateArray(arr);
      
      for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i] +" ");
      }
      System.out.println();
    }
  }

  private static int[] getAlternateArray(int[] arr) {
    int[] result = new int[arr.length];
    boolean positive = false;
    boolean lastNumberPositive = false;
    int count = 1;
    for(int i=arr.length - 1;i>=0;i--) {
      positive = arr[i] > 0 ? true : false;
      if(i == arr.length - 1) {
        result[i] = 1;
      } else {
        if((positive && !lastNumberPositive) || (!positive && lastNumberPositive)) {
          count++;
        } else {
          count = 1;
        }
        result[i] = count;
       }
      lastNumberPositive = positive;
    }
    return result;
  }

}
