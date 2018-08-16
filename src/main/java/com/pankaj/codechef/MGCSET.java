package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class MGCSET {
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int len = Integer.parseInt(line[0]);
      int m = Integer.parseInt(line[1]);
      int[] arr = new int[len];
      line = br.readLine().split(" ");
      for(int i=0;i<len;i++) {
        arr[i] = Integer.parseInt(line[i]);
      }
      System.out.println(getCount(arr, m));
    }
  }
  
  private static long getCount(int[] arr, int divisor) {
    Set<Integer> set = new HashSet<Integer>();
    for(int i=0;i<arr.length;i++) {
      if(arr[i] % divisor == 0) {
        set.add(arr[i]);
      }
    }
    return getSequenceCount(set.size()) - 1;
  }
  
  private static long getSequenceCount(int num) {
    long result = 1;
    if(num == 0) {
      return result;
    } if(num == 1) {
      return 2;
    }else {
      long number = getSequenceCount(num/2);
      if(num % 2 != 0) {
        result = 2 * number * number;
      } else {
        result = number * number;
      }
    }
    return result;
  }

}
