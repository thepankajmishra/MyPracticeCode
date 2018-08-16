package com.pankaj.leetcode;

public class MergeSort
{
  
  public static void main(String[] arg) {
    int[] arr = new int[] {5,4,3,2,1};
    MergeSort mergeSort = new MergeSort();
    mergeSort.sort(arr);
    for(int i=0;i<arr.length;i++) {
      System.out.println(arr[i]);
    }
  }
  
  public int[] sort(int[] arr) {
    mergeSort(arr, 0, arr.length - 1);
    return arr;
  }
  
  public void mergeSort(int[] arr, int start, int end) {
    if(start < end) {
      int mid = (start +  end) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);
      merge(arr, start ,mid , end);
    }
  }

  private void merge(
    int[] arr,
    int start,
    int mid,
    int end)
  {
    int len = (end - start + 1);
    int array[] = new int[len];
    int p = start;
    int q = mid + 1;
    
    for(int i=0;i<len;i++) {
      if(p > mid) {
        array[i] = arr[q++];
      } else if(q > end) {
        array[i] = arr[p++];
      } else if(arr[p] <= arr[q]) {
        array[i] = arr[p++];
      } else {
        array[i] = arr[q++];
      }
    }

    int k=0; 
    for(int i=start;i<=end;i++) {
      arr[i] = array[k++];
    }
  }

}
