package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROBLEMS {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int problems = Integer.parseInt(line[0]);
    int subTasks = Integer.parseInt(line[1]);
    int[][] difficultyArr = new int[problems][2];
    for(int i=0;i<problems;i++) {
      line = br.readLine().split(" ");
      String[] line1 = br.readLine().split(" ");
      int[][] subTaskArr = new int[2][subTasks];
      for(int k=0;k<subTasks;k++) {
        subTaskArr[0][k] = Integer.parseInt(line[k]);
        subTaskArr[1][k] = Integer.parseInt(line1[k]);
      }
      difficultyArr[i][0] = i+1;
      difficultyArr[i][1] = computeDifficulty(subTaskArr);
    }
    print(difficultyArr);
  }
  
  private static void print(int[][] difficulty) {
    mergeSort(difficulty, 0, difficulty.length-1);
    for(int i=0;i<difficulty.length;i++) {
      System.out.println(difficulty[i][0]);
    }
  }
  
  private static void mergeSort(int[][] arr, int start, int end) {
    if(start <  end) {
      int mid = (end + start)/2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid+1, end);
      merge(arr, start, mid, end);
    }
  }
  
  private static void merge(int[][] arr, int start, int mid, int end) {
    int p = start;
    int q = mid + 1;
    int len = (end-start+1);
    int[][] array = new int[len][2];
    
    for(int i=0;i<len;i++) {
      if(p > mid) {
        assign(array, arr, i, q);
        q++;
      } else if (q > end) {
        assign(array, arr, i, p);
        p++;
      } else if(arr[p][1] <= arr[q][1]){
        assign(array, arr, i, p);
        p++;
      } else {
        assign(array, arr, i, q);
        q++;
      }
    }
    
    for(int i=0;i<len;i++) {
      assign(arr, array, start, i);
      start++;
    }
  }
  
  private static void assign(int[][] array, int[][] arr, int i, int index) {
    array[i][0] = arr[index][0];
    array[i][1] =arr[index][1];
  }
  
  
  private static int computeDifficulty(int[][] subTasks) {
    sort(subTasks);
    int difficulty = 0;
    for(int i=0;i<subTasks[1].length-1;i++) {
      if(subTasks[1][i] > subTasks[1][i+1]) {
        difficulty++;
      }
    }
    return difficulty;
  }
  
  private static void sort(int[][] subTasks) {
    
    for(int i=0;i<subTasks[0].length - 1;i++) {
      int min = i;
      for(int j=i+1;j<subTasks[0].length;j++) {
        if(subTasks[0][j] < subTasks[0][min]) {
          min = j;
        }
      }
      if(min != i) {
        int temp = subTasks[0][i];
        subTasks[0][i] = subTasks[0][min];
        subTasks[0][min] = temp;
        temp = subTasks[1][i];
        subTasks[1][i] = subTasks[1][min];
        subTasks[1][min] = temp;
      }
    }
  }
  
}