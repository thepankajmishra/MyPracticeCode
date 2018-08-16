package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DQUERY {

  static int start = 0;
  static int end = 0;
  static int[] frequency = new int[1000001];
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int len = Integer.parseInt(br.readLine());
    int[] arr = new int[len];
    int count = 0;
    StringTokenizer st = new StringTokenizer(br.readLine());
    int i = 0;
    while (st.hasMoreTokens()) {
      arr[i++] = Integer.parseInt(st.nextToken());
    }
    
    int q = Integer.parseInt(br.readLine());
    boolean firstTime = true;
    while(q-- > 0) {
      String[] line = br.readLine().split(" ");
      int left = Integer.parseInt(line[0]) - 1;
      int right = Integer.parseInt(line[1]) - 1;
      if(firstTime) {
        start = left;
        end = left;
        frequency[arr[start]]++;
        count++;
        firstTime = !firstTime;
      }
      count = getDistinctCount(arr, frequency, left, right, count);
      System.out.println(count);
    }
    
    
  }

  private static int getDistinctCount(int[] arr, int[] frequency, int left,int right, int count) {
//    System.out.println(left +" "+ right);
//    System.out.println(start+" "+end);
//    System.out.println();
    if(start < left) {
      while(start < left) {
        frequency[arr[start]]--;
        if(frequency[arr[start++]] == 0) count--;
      }
//      System.out.println(count);
    } else if(start > left){
      start--;
      while(start >= left) {
        frequency[arr[start]]++;
        if(frequency[arr[start--]] == 1) count++;
      }
//      System.out.println(count);
    } 
//    print();
    start = left;
    if(end < right) {
      end++;
      while(end <= right) {
        frequency[arr[end]]++;
        if(frequency[arr[end++]] == 1) count++;
      }
//      System.out.println(count);
    } else if(end > right){
      while(end > right) {
        frequency[arr[end]]--;
        if(frequency[arr[end--]] == 0) count--;
      }
//      System.out.println(count);
    }
//    print();
    end = right;
    return count;
  }
  
  private static void print() {
    for(int i=1;i<=5;i++) {
      System.out.print(frequency[i]+" ");
    }
    System.out.println();
  }
  
}
