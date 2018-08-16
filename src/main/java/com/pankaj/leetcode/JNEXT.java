package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;

public class JNEXT {

  ReentrantLock lock = new ReentrantLock();
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());
    while(testCases-- > 0) {
      int len = Integer.parseInt(br.readLine());
      Stack<Integer> stack = new Stack<>();
      String[] line = br.readLine().split(" ");
      for(int i=0;i<len;i++) {
        stack.push(Integer.parseInt(line[i]));
      }
      System.out.println(getNextNumber(stack));
    }
  }
  
  public static String getNextNumber(Stack<Integer> stack) {
    ArrayList<Integer> list = new ArrayList<>();
    int num = stack.pop();
    list.add(num);
    while(!stack.isEmpty() && num <= stack.peek()) {
      num = stack.pop();
      list.add(num);
    }
    if(stack.isEmpty()) {
      return "-1";
    } else {
      num = stack.pop();
      list.add(num);
      String number = getNumber(list, num);
      StringBuilder builder = getStackNumber(stack);
      builder.append(number);
      return builder.toString();
    }
  }

  private static String getNumber(ArrayList<Integer> list, int num) {
    int min = 9;
    int index = -1;
    for(int i=0;i<list.size();i++) {
      if(list.get(i) > num && list.get(i) <= min) {
        min = list.get(i);
        index = i;
      }
    }
    list.remove(index);
    Collections.sort(list);
    StringBuilder builder = new StringBuilder(min+"");
    for(Integer x : list) {
      builder.append(x);
    }
    return builder.toString();
  }

  private static StringBuilder getStackNumber(Stack<Integer> stack) {
    StringBuilder builder = new StringBuilder();
    while(!stack.isEmpty()) {
      builder.append(stack.pop());
    }
    return builder.reverse();
  }

}
