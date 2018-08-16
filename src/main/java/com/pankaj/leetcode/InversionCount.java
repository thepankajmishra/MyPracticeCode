package com.pankaj.leetcode;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InversionCount {
  
  static long count = 0;
  
  public static void main(String[] arg) throws IOException{
    Scanner scanner = new Scanner(new InputStreamReader(System.in));
    int tc = scanner.nextInt();
    scanner.nextLine();
    while(tc-- > 0) {
      int len = scanner.nextInt();
      int[] arr = new int[len];
      for(int i=0;i<len;i++) {
        arr[i] = scanner.nextInt();
      }
      mergeSort(arr, 0, arr.length - 1);
      System.out.println(count);
      scanner.nextLine();
      count = 0;
    }
  }
  
  public static void mergeSort(int[] arr, int start, int end) {
    if(start < end) {
      int mid = (start +  end) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);
      merge(arr, start ,mid , end);
    }
  }

  private static void merge(int[] arr, int start, int mid, int end) {
    int len = (end - start + 1);
    int array[] = new int[len];
    int p = start;
    int q = mid + 1;
    
    for(int i=0;i<len;i++) {
      if(p > mid) {
        array[i] = arr[q++];
      } else if(q > end) {
        array[i] = arr[p++];
      } else if(arr[p] <= arr[q]) {
        array[i] = arr[p++];
      } else {
        array[i] = arr[q++];
        count = count + (mid - p + 1);
      }
    }

    int k=0; 
    for(int i=start;i<=end;i++) {
      arr[i] = array[k++];
    }
  }

}

