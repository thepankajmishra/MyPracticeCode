package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MAXDIFF {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int len = Integer.parseInt(line[0]);
      int num = Integer.parseInt(line[1]);
      int[] arr = new int[len];
      line = br.readLine().split(" ");
      for(int i=0;i<len;i++) {
        arr[i] = Integer.parseInt(line[i]);
      }
      System.out.println(getMaxDifference(arr, len - num > num ? num : len - num));
    }

  }
  
  private static int getMaxDifference(int[] arr, int min) {
    int minSum = 0;
    int maxSum = 0;
    for(int i=0;i<min;i++) {
      int minIndex = i;
      for(int j=i+1;j<arr.length;j++) {
        if(arr[minIndex] > arr[j]) {
          minIndex = j;
        }
      }
      if(minIndex != i) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
      }
      minSum += arr[i];
    }
    
    for(int i=min;i<arr.length;i++) {
      maxSum += arr[i];
    }
    return maxSum - minSum;
  }

}
