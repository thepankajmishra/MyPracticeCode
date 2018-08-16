package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TTTABLE {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());
    for(int k=1;k<=testCases;k++) {
      int turnAround = Integer.parseInt(br.readLine());
      String[] line = br.readLine().split(" ");
      int NA = Integer.parseInt(line[0]);
      int NB = Integer.parseInt(line[1]);
      
      int[] arrival1 = new int[NA];
      int[] arrival2 = new int[NB];
      int[] departure1 = new int[NA];
      int[] departure2 = new int[NB];
      
      for(int i=0;i<NA;i++) {
        line = br.readLine().split(" ");
        departure1[i] = convertIntoMinutes(line[0], 0);
        arrival1[i] = convertIntoMinutes(line[1], turnAround);
      }
      
      for(int i=0;i<NB;i++) {
        line = br.readLine().split(" ");
        departure2[i] = convertIntoMinutes(line[0], 0);
        arrival2[i] = convertIntoMinutes(line[1], turnAround);
      }
      
//      sort(arrival1, 0, arrival1.length - 1);
//      sort(arrival2, 0, arrival2.length - 1);
//      sort(departure1, 0, departure1.length - 1);
//      sort(departure2, 0, departure2.length - 1);
      
      sort(arrival1);
      sort(arrival2);
      sort(departure1);
      sort(departure2);

      NA = countTrains(departure1, arrival2);
      NB = countTrains(departure2, arrival1);
      System.out.println("Case #"+k+": "+NA+" "+NB);
    }
    
  }
  
  private static int countTrains(int[] departure, int[] arrival) {
    int count = 0;
    if(departure.length == 0)
      return 0;
    else if(arrival.length == 0) 
      return departure.length;
    else {
      int j = 0;
      for(int i=0;i<departure.length;i++) {
        if(j >= arrival.length) {
          count += (departure.length - i);
          break;
        } else if(departure[i] < arrival[j]) {
          count++;
        } else {
          j++;
        }
      }
      return count;
    }
  }
  
  /*private static void sort(int[] arr, int start, int end) {
    if(start < end) {
      int mid = (start + end)/2;
      sort(arr, start, mid);
      sort(arr, mid+1, end);
      merge(arr, start, mid, end);
    }
  }*/
  
  public static void sort( int[] a)
  {
      int i, m = a[0], exp = 1, n = a.length;
      int[] b = new int[a.length];
      for (i = 1; i < n; i++)
          if (a[i] > m)
              m = a[i];
      while (m / exp > 0)
      {
          int[] bucket = new int[10];

          for (i = 0; i < n; i++)
              bucket[(a[i] / exp) % 10]++;
          for (i = 1; i < 10; i++)
              bucket[i] += bucket[i - 1];
          for (i = n - 1; i >= 0; i--)
              b[--bucket[(a[i] / exp) % 10]] = a[i];
          for (i = 0; i < n; i++)
              a[i] = b[i];
          exp *= 10;        
      }
  }
  

  private static void merge(int[] arr, int start, int mid, int end) {
    int len = (end - start + 1);
    int p = start;
    int q = mid + 1;
    int[] array = new int[len];
    for(int i=0;i<len;i++) {
      if(p > mid) {
        array[i] = arr[q++];
      } else if(q > end){
        array[i] = arr[p++];
      } else if(arr[p] > arr[q]) {
        array[i] = arr[q++];
      } else {
        array[i] = arr[p++];
      }
    }
    
    for(int i=0;i<array.length;i++) {
      arr[start++] = array[i];
    }
  }

  public static int convertIntoMinutes(String time, int turnAroundTime) {
    String[] timeArray = time.split(":");
    return (Integer.parseInt(timeArray[0]) * 60 + Integer.parseInt(timeArray[1]) + turnAroundTime);
  }

}
