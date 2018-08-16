package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Probability {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int n = Integer.parseInt(line[0]);
      int a = Integer.parseInt(line[1]);
      int b = Integer.parseInt(line[2]);
      
      double countA = 0;
      double countB = 0;
      
      line = br.readLine().split(" ");
      for(int i=0;i<n;i++) {
        int num = Integer.parseInt(line[i]);
        if(num == a) {
          countA++;
        }
        if(num == b) {
          countB++;
        }
      }
      
      System.out.format("%.10f\n",(countA/n) * (countB/n));
    }
    
  }
}
