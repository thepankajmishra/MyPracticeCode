package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW017 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int a = Integer.parseInt(line[0]);
      int b = Integer.parseInt(line[1]);
      int c = Integer.parseInt(line[2]);
      System.out.println(getSeacondLargest(a, b, c));
    }
  }

  private static int getSeacondLargest(int a, int b, int c) {
    if(a > b && a < c || a > c && a < b) return a;
    if(a < b && b < c || a > b && c < b) return b;
    return c;
  }

}
