package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheffAndMortalKombat {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    String[] line = br.readLine().split(" ");
    int players = Integer.parseInt(line[0]);
    int matches = Integer.parseInt(line[1]);
    int[] otherTeam = getTeam(br.readLine().split(" "), players);
    int[] chefTeam = getTeam(br.readLine().split(" "), players);
    sort(chefTeam, 0, players - 1);
    sort(otherTeam, 0, players - 1); 
    System.out.println(getWinner(getNumberOfWinner(chefTeam, otherTeam), matches));
  }
  
  private static String getWinner(int winner, int k) {
    return winner >= k ? "YES" : "NO"; 
  }
  
  private static int getNumberOfWinner(int[] chefTeam, int[] otherTeam) {
    int count = 0;
    int indexChef = 0;
    int indexOther = 0;
    while(indexChef < chefTeam.length && indexOther < otherTeam.length) {
      if(chefTeam[indexChef] > otherTeam[indexOther]) {
        count++;
        indexChef++;
        indexOther++;
      } else {
        indexChef++;
      }
    }
    return count;
  }
  
  private static void sort(int[] team, int start, int end) {
    if(start < end) {
      int mid = (start + end)/2;
      sort(team, start, mid);
      sort(team, mid+1, end);
      merge(team, start, mid, end);
    }
  }
  
  private static void merge(int[] team, int start, int mid, int end) {
    int p = start;
    int q = mid+1;
    int len = end - start + 1;
    int[] arr = new int[len];
    
    for(int i=0;i<len;i++) {
      if(p > mid) {
        arr[i] = team[q++];
      } else if(q > end){
        arr[i] = team[p++];
      } else if(team[p] < team[q]) {
        arr[i] = team[p++];
      } else {
        arr[i] = team[q++];
      }
    }
    
    for(int i=0;i<len;i++) {
      team[start++] = arr[i];
    }
    
  }
  
  private static int[] getTeam(String[] line, int players) {
    int[] team = new int[players];
    for(int i=0;i<players;i++) {
      team[i] = Integer.parseInt(line[i]);
    }
    return team;
  }

}
