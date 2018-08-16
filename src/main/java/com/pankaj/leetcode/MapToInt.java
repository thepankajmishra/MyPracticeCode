package com.pankaj.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToInt
{

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    System.out.println(System.currentTimeMillis());
    List<Integer> arr = getByParsing(line);
//    List<Integer> arr = getByStream(line);
    System.out.println(System.currentTimeMillis());
    /*for(int word : arr) 
      System.out.println(word);*/
    
    callAMethod(5);
  }
  
  private static void callAMethod(Integer a) {
    System.out.println("This is Integer "+ a);
  }
  
  private static void callAMethod(String a) {
    System.out.println("This is Integer "+ a);
  }

  public static List<Integer> getByStream(String[] line) {
    return Arrays.stream(line).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
  }
  
  public static List<Integer> getByParsing(String[] line) {
    List<Integer> arr = new ArrayList<>();
    for(int i=0;i<line.length;i++) {
      arr.add(Integer.parseInt(line[i]));
    }
    return arr;
  }

}
