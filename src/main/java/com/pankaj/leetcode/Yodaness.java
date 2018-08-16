package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Yodaness
{
    static long count = 0;
    
    public static void main(String[] arg) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int tc = Integer.parseInt(br.readLine());
      while(tc-- > 0) {
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];
        String[] line = br.readLine().split(" ");
        String[] original = br.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<original.length;i++) {
          map.put(original[i], i+1);
        }
        for(int i=0;i<arr.length;i++) {
          arr[i] = map.get(line[i]);
        }
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(count);
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
