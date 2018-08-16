package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalExpenses {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      double a = Double.parseDouble(line[0]);
      double b = Double.parseDouble(line[1]);
      double result = a >= 1000 ? 0.9 * a * b : 1.0 * (a * b);
      System.out.format("%6f\n",result);
    }
  }
}
