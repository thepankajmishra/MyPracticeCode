package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CIELRCPT {
  
  static int[] arr = {1,2,4,8,16,32,64,128,256,512,1024,2048};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      System.out.println(getMinMenus(Integer.parseInt(br.readLine())));
    }
  }
  
  public static int getMinMenus(int item) {
    int count = 0;
    while(item > 0) {
      int x = 0;
      for(int i=0;i<arr.length && arr[i] <= item;i++) {
        x = arr[i];
      }
      count += (item/x);
      item %= x;
    }
    return count;
  }

}
