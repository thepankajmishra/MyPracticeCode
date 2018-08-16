package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

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
      
      System.out.println(isRainbowArray(arr));
    }
  }

  private static String isRainbowArray(int[] arr) {
    int num = 1;
    int start = 0;
    int end = arr.length - 1;
    
    while(start <= end) {
      num  = arr[start] == num ? num  : num + 1;
      if(arr[start] != num  || arr[end] != num) {
        return "no";
      } else {
        start++;
        end--;
      }
    }
    return (num == 7) ? "yes" : "no";
  }
}
