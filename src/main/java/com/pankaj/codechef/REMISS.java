package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class REMISS {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int entry1 = Integer.parseInt(line[0]);
      int entry2 = Integer.parseInt(line[1]);
      System.out.println((entry1 >  entry2 ? entry1 : entry2) +" "+(entry1 + entry2));
    }
  }
}
