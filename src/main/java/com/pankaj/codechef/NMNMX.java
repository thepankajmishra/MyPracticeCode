package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NMNMX {

  public static void main(String[] args) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int tc = Integer.parseInt(br.readLine());
   while(tc-- > 0) {
     String[] line = br.readLine().split(" ");
     int len = Integer.parseInt(line[0]);
     int k = Integer.parseInt(line[1]);
     int[] arr = new int[len];
     line = br.readLine().split(" ");
     for(int i=0;i<line.length;i++) {
       arr[i] = Integer.parseInt(line[i]);
     }
     sort(arr, 0, arr.length - 1);
     
   }
    
  }
  
  private static long getProduct(int[] arr, int k) {
    long product = 1l;
    
    return product;
  }
  
  private static void sort(int[] arr, int start, int end) {
    if(start < end) {
      int mid = (start + end)/2;
      sort(arr, start, mid);
      sort(arr, mid+ 1, end);
      merge(arr, start, mid, end);
    }
  }
  
  private static void merge(int[] arr, int start, int mid, int end) {
    int p = start;
    int q = mid + 1;
    int len = end - start + 1;
    int[] array = new int[len];
    
    for(int i=0;i<len;i++) {
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
    
    for(int i=0;i<len;i++) {
      arr[start++] = array[i];
    }
  }
}
