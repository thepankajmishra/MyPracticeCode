package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mahasena {

  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int countOfOdd = 0;
    int countOfEven = 0;
    br.readLine();
    String[] line = br.readLine().split(" ");
    for(int i=0;i<line.length;i++) {
      if(Integer.parseInt(line[i]) % 2 == 0) {
        countOfEven++;
        } else {
          countOfOdd++;
        }
      }
    System.out.println(countOfEven > countOfOdd ? "READY FOR BATTLE" : "NOT READY");
    }
}

