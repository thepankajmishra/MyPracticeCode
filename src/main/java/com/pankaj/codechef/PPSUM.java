package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PPSUM {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int times = Integer.parseInt(line[0]);
      int sum = Integer.parseInt(line[1]);
      for(int i=0;i<times;i++) {
        sum = getSum(sum);
      }
      System.out.println(sum);
    }
  }
  
  private static int getSum(int num) {
    if(num == 1) return 1;
    return num + getSum(num - 1);
  }

}
