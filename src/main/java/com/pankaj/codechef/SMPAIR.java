package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SMPAIR {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      int len = Integer.parseInt(br.readLine());
      int[] arr = new int[len];
      String[] line = br.readLine().split(" ");
      for(int i=0;i<line.length;i++) {
        arr[i] = Integer.parseInt(line[i]);
      }
      System.out.println(getMinimumSum(arr));
    }
  }
  
  private static int getMinimumSum(int[] arr) {
    int sum = 0;
    for(int i=0;i<2;i++) {
      int min = i;
      for(int j=i+1;j<arr.length;j++) {
        if(arr[j] < arr[min]) {
          min = j;
        }
      }
      sum += arr[min];
      if(min != i) {
        int temp = arr[i] ;
        arr[i] = arr[min];
        arr[min] = temp;
      }
    }
    return sum;
  }

}
