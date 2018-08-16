package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TWTCLOSE {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int len = Integer.parseInt(line[0]);
    int clicks = Integer.parseInt(line[1]);
    int[] tweets = new int[len];
    int count = 0;
    String input = "";
    for(int i=0;i<clicks;i++) {
      input = br.readLine();
      if("CLOSEALL".equals(input)) {
        tweets =  new int[len];
        count = 0;
      } else {
        int tweetIndex = Integer.parseInt(input.split(" ")[1]);
        if(tweets[tweetIndex-1] == 0) {
          count++;
          tweets[tweetIndex-1] = 1;
        } else {
          count--;
          tweets[tweetIndex-1] = 0;
        }
      }
      System.out.println(count);
    }
  }

}
