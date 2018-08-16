package com.pankaj.geeksforgeeks;

public class ReverseStringOrArray {

  public static void main(String[] args) {
    char[] arr = new char[] {'N','A','G','M','A'};
    reverseArr(arr, 0, arr.length -1);
    
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+" ");
    }
  }
  
  private static void reverseArr(char[] arr, int i, int j) {
    if(i < j) {
      swap(arr, i, j);
      reverseArr(arr, ++i, --j);
    }
  }
  
  private static void swap(char[] arr, int i, int j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
