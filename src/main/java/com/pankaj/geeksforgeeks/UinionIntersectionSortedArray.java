package com.pankaj.geeksforgeeks;

public class UinionIntersectionSortedArray {
  
  private static int[] arr1 = new int[] {1,2,3,6,8,10};
  private static int[] arr2 = new int[] {3,4,5,7,8,9,10,12,13};

  public static void main(String[] args) {
    printIntersection();
    printUnion();
  }
  
  private static void printIntersection() {
    int p = 0;
    int q = 0;
    while(p < arr1.length && q < arr2.length) {
      if(arr1[p] == arr2[q]) {
        System.out.print(arr1[p++]+" ");
        q++;
      } else if(arr1[p] < arr2[q]) {
        p++;
      }  else {
        q++;
      }
    }
    System.out.println();
  }
  
  private static void printUnion() {
    int p = 0;
    int q = 0;
    while(p < arr1.length || q < arr2.length) {
      if(p == arr1.length) {
        System.out.print(arr2[q++]+" ");
      } else if(q == arr2.length) {
        System.out.print(arr2[p++]+" ");
      } else if(arr1[p] == arr2[q]){
        System.out.print(arr1[p++]+" ");
        q++;
      } else if(arr1[p] < arr2[q]){
        System.out.print(arr1[p++]+" ");
      } else {
        System.out.print(arr2[q++]+" ");
      }
    }
    System.out.println();
  }
}
