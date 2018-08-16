package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUMTRIAN {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0) {
      int l = Integer.parseInt(br.readLine());
      int[][] s = new int[l][l];
      for(int i=0;i<l;i++) {
        String[] m = br.readLine().split(" ");
        for(int j=0;j<=i;j++) {
          s[i][j] = Integer.parseInt(m[j]);
        }
      }
      System.out.println(getMaxCount(s, l-2));
    }
  }
  
  private static int getMaxCount(int[][] s, int n) {
    for(int i=n;i>=0;i--) {
      for(int j=0;j<=i;j++) {
        s[i][j] = s[i][j] + s[i+1][j] > 
        s[i][j] + s[i+1][j+1] ? 
            s[i][j] + s[i+1][j] : 
              s[i][j] + s[i+1][j+1];
      }
    }
    return s[0][0];
  }

}
