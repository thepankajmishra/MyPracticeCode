package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestNumberOfNotes {
  
  private static int[] notes = {100,50,10,5,2,1};

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      int amount = Integer.parseInt(br.readLine());
      System.out.println(getMinimumNumberOfNotes(amount));
    }
  }
  
  private static int getMinimumNumberOfNotes(int amount) {
    int numOfNotes = 0;
    int temp = 0;
    for(int i=0;i<notes.length && amount > 0;i++) {
      if(amount >= notes[i]) {
        temp = (amount/notes[i]);
        amount -= (temp * notes[i]);
        numOfNotes += temp;
      }
    }
    return numOfNotes;
  }

}
