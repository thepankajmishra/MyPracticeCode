package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MrgSrt
{

  public static void main(
    String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while (tc-- > 0)
    {
      String[] line = br.readLine().split(" ");
      int start = Integer.parseInt(line[0]);
      int end = Integer.parseInt(line[1]);
      int k = Integer.parseInt(line[2]);
      System.out.println(mergeSort(start, end, k, 0));
    }

  }
  
  public static int mergeSort(int start, int end, int k, int count) {
     if(k < start || k > end) {
       return -1;
     } else {
       System.out.println(start+" "+end);
       if(start == k && end == k) {
         return ++count;
       }
       if(start < end) {
         int mid = (start + end)/2;
         if(mid < k) {
           return mergeSort(mid + 1, end, k, ++count);
         } else {
           return mergeSort(start, mid, k, ++count);
         }
       }
       return count;
     }
  }

}
