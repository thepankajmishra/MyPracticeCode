package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLEANUP {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int totalTask = Integer.parseInt(line[0]);
      int completedTask = Integer.parseInt(line[1]);
      int[] pendingTaskArr = new int[totalTask];
      if(completedTask > 0) {
        int[] completedTaskArr = new int[completedTask];
        line = br.readLine().split(" ");
        for(int i=0;i<line.length;i++) {
          completedTaskArr[i] = Integer.parseInt(line[i]);
        }
        for(int i=0;i<completedTask;i++) {
          pendingTaskArr[completedTaskArr[i] - 1] = -1;
        }
      } else {
        br.readLine();
      }
      printTask(pendingTaskArr);
    }
  }

  private static void printTask(int[] pendingTaskArr) {
    StringBuilder chefTask = new StringBuilder("");
    StringBuilder otherTask = new StringBuilder("");
    boolean isChefTurn = true;
    for(int i=0;i<pendingTaskArr.length;i++) {
      if(pendingTaskArr[i] == 0) {
        if(isChefTurn) {
          chefTask.append(i+1+" ");
        } else {
          otherTask.append(i+1+" ");
        }
        isChefTurn = !isChefTurn;
      }
    }
    System.out.println(chefTask.toString().trim());
    System.out.println(otherTask.toString().trim());
  }

}
