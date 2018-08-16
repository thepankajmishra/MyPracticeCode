package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SPLST {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int a = Integer.parseInt(line[0]);
      int b = Integer.parseInt(line[1]);
      int c = Integer.parseInt(line[2]);
      int x = Integer.parseInt(line[3]);
      int y = Integer.parseInt(line[4]);
      
      if(a+b+c == x+y) {
        if(a+b >= x && a+b>= y || a+c >= x && a+c >= y || b+c >= x && b+c >= y) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
      } else {
        System.out.println("NO");
      }
    }
  }

}
