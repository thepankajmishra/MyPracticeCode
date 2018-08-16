package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SBANK {
  
  public static void main(String[] arg) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      int len = Integer.parseInt(br.readLine());
      String[] arr = new String[len];
      for(int i=0;i<len;i++) {
        arr[i] = br.readLine();
      }
      mergeSort(arr, 0, arr.length - 1);
      
      for(int i=0;i<arr.length;i++) {
        int count = 1;
        int j = i;
        while(j<arr.length - 1 && arr[i].equals(arr[j+1])) {
          count ++;
          j++;
        }
        System.out.println(arr[i]+" "+count);
        i = j;
      }
      System.out.println();
      if(tc != 0)
        br.readLine();
    }
  }
  
  public static void mergeSort(String[] arr, int start, int end) {
    if(start < end) {
      int mid = (start +  end) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);
      merge(arr, start ,mid , end);
    }
  }

  private static void merge(String[] arr, int start, int mid, int end) {
    int len = (end - start + 1);
    String array[] = new String[len];
    int p = start;
    int q = mid + 1;
    
    for(int i=0;i<len;i++) {
      if(p > mid) {
        array[i] = arr[q++];
      } else if(q > end) {
        array[i] = arr[p++];
      } else if(arr[p].compareTo(arr[q]) <= 0) {
        array[i] = arr[p++];
      } else {
        array[i] = arr[q++];
      }
    }

    int k=0; 
    for(int i=start;i<=end;i++) {
      arr[i] = array[k++];
    }
  }

}
