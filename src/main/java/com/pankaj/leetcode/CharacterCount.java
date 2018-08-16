package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;

public class CharacterCount {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    sortArr(line);
    System.out.println(constructSentence(line));
  }
  
  private static String constructSentence(String[] arr) {
    StringBuilder builder = new StringBuilder("");
    for(int i=0;i<arr.length;i++) {
      builder.append(arr[i]+" ");
    }
    return builder.toString().trim();
  }
  
  private static void sortArr(String[] arr) {
    
    for(int i=0;i<arr.length-1;i++) {
      int min = i;
      for(int j=i+1;j<arr.length;j++) {
        if(arr[j].length() < arr[min].length()) {
          min = j;
        }
      }
      if(min != i) {
        String temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
      }
    }
  }

}
