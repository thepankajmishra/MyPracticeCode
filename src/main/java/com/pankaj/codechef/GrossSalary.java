package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrossSalary {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      int basic = Integer.parseInt(br.readLine());
      double gross = basic < 1500 ? 2.0 * basic : basic + 500 + basic * 0.98;
      System.out.format("%.2f\n", gross);
    }
  }

}
