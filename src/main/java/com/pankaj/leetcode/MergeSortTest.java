package com.pankaj.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class MergeSortTest
{
  
  private MergeSort mergeSort;
  
  @Before
  public void populate() {
    mergeSort = new MergeSort();
  }

  @Test
  public void testSort()
  {
    int[] arr = new int[] {3,4,5,2,1};
    int[] expected = new int[] {1,2,3,4,5};
    
    assertArrayEquals(expected, mergeSort.sort(arr));
  }

}
