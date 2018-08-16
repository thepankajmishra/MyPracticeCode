package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FSQRT {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      int num = Integer.parseInt(br.readLine());
      System.out.println(getSquareRoot(num));
    }
  }
  
  private static int getSquareRoot(int num) {
    int root = 1;
    for(;root*root<=num;root++) {
      if((root+1) * (root+1) > num) break; 
    }
    return root;
  }

}
