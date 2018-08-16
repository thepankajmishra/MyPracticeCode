package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CONFLIP {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      int games = Integer.parseInt(br.readLine());
      while(games-- > 0) {
        String[] line = br.readLine().split(" ");
        int start = Integer.parseInt(line[0]);
        int numberOfFlips =  Integer.parseInt(line[1]);
        int query = Integer.parseInt(line[2]);
        System.out.println(getQueryResult(start, numberOfFlips, query));
      }
    }
  }
  
  private static int getQueryResult(int start, int numberOfFlips, int query) {
    return start == query ? numberOfFlips/2 : (numberOfFlips + 1)/2;
  }
}
