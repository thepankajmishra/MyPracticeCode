package com.pankaj.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leaders {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int[] arr = new int[line.length];
      for(int i=0;i<line.length;i++) {
        arr[i] = Integer.parseInt(line[i]);
      }
      
      int max = arr[arr.length - 1];
      String result = max+"";
      for(int i=arr.length-2;i>=0;i--) {
        if(arr[i] > max) {
          max = arr[i];
          result = max + " " + result;
        }
      }
      System.out.println(result);
    }
  }

}
