package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidTriangles {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int a = Integer.parseInt(line[0]);
      int b = Integer.parseInt(line[1]);
      int c = Integer.parseInt(line[2]);
      if(a+b+c == 180) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

}
