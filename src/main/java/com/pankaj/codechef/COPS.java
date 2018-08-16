package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COPS {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int len = Integer.parseInt(line[0]);
      int speed = Integer.parseInt(line[1]);
      int time = Integer.parseInt(line[2]);
      int[] cops= new int[len];
      line = br.readLine().split(" ");
      for(int i=0;i<len;i++) {
        cops[i] = Integer.parseInt(line[i]);
      }
      System.out.println(getSafeHouse(cops, speed, time));
    }
  }
  
  private static int getSafeHouse(int[] cops, int speed, int time) {
    int[] homes = new int[100];
    int count = 0;
    for(int i=0;i<cops.length;i++) {
      int start = cops[i] - (speed * time) > 0 ? cops[i] - (speed * time) : 1;
      int end = cops[i] + (speed * time) <= 100 ? cops[i] + (speed * time) : 100;
      for(int j=start;j<=end;j++) {
        homes[j-1]--;
      }
    }
    
    for(int i=0;i<100;i++) {
      if(homes[i] >= 0) {
        count++;
      }
    }
    return count;
  }
}
