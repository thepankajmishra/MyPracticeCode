package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chopsticks {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int len = Integer.parseInt(line[0]);
    int d = Integer.parseInt(line[1]);
    int[] arr = new int[len];
    
    for(int i=0;i<len;i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    sort(arr, 0, arr.length - 1);
    System.out.println(getMaxPair(arr, d));
  }
  
  public static void sort(int[] arr, int start, int end) {
    if(start < end) {
      int mid = (start + end)/2;
      sort(arr, start, mid);
      sort(arr, mid+1, end);
      merge(arr, start, mid, end);
    }
  }
  
  public static void merge(int[] arr, int start, int mid, int end) {
    int len = (end - start + 1);
    int p = start;
    int q = mid + 1;
    int a[] = new int[len];
    
    for(int i=0;i<len;i++) {
      if(p > mid) {
        a[i] = arr[q++];
      } else if(q > end) {
        a[i] = arr[p++];
      } else if(arr[p] < arr[q]) {
        a[i] = arr[p++];
      } else {
        a[i] = arr[q++];
      }
    }
    
    for(int i=0;i<len;i++) {
      arr[start++] = a[i];
    }
    
  }
  
  public static int getMaxPair(int[] arr, int d) {
    int count = 0;
    for(int i=1;i<arr.length;i=i+2) {
      if(arr[i] - arr[i-1] > d) {
        i--;
      } else {
        count++;
      }
    }
    return count;
  }

}
