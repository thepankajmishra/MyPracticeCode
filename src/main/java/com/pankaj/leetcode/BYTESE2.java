package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BYTESE2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());
    while(testCases-- > 0) {
      int len = Integer.parseInt(br.readLine());
      
      int[] start = new int[len];
      int[] end = new int[len];
      
      for(int i=0;i<len;i++) {
        String[] line = br.readLine().split(" ");
        start[i] = Integer.parseInt(line[0]);
        end[i] = Integer.parseInt(line[1]);
      }
      
      sort(start, 0, len-1);
      sort(end, 0, len -1);
      
      System.out.println(getMaxDancer(start, end));
   }
  }

  private static int getMaxDancer(int[] start, int[] end) {
    int max = 0;
    int count = 0;
    int j = 0;
    
    for(int i=0;i<start.length;i++) {
      if(start[i] < end[j]) {
        count++;
      } else {
        count--;
        j++;
        i--;
      }
      if(max < count) {
        max = count;
      }
    }
    
    return max;
  }

  private static void sort(int[] arr, int start, int end) {
    if(start < end) {
      int mid = (start + end)/2;
      sort(arr, start, mid);
      sort(arr, mid+1, end);
      merge(arr, start, mid, end);
    }
  }

  private static void merge(int[] arr, int start, int mid, int end) {
    int p = start;
    int q = mid + 1;
    int[] array = new int[end - start + 1];
    
    for(int i=0;i<array.length;i++) {
      if(p > mid) {
        array[i] = arr[q++];
      } else if(q > end) {
        array[i] = arr[p++];
      } else if(arr[p] > arr[q]) {
        array[i] = arr[q++];
      } else {
        array[i] = arr[p++];
      }
    }
    
    for(int i=0;i<array.length;i++) {
      arr[start++] = array[i];
    }
  }

}
