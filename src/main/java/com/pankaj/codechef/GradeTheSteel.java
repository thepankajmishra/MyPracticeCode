package com.pankaj.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradeTheSteel {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      boolean hardness = Float.parseFloat(line[0]) > 50 ? Boolean.TRUE : Boolean.FALSE;
      boolean carbon = Float.parseFloat(line[1]) < 0.7 ? Boolean.TRUE : Boolean.FALSE;
      boolean tensile = Float.parseFloat(line[2]) > 5600 ? Boolean.TRUE : Boolean.FALSE;
      System.out.println(getGrade(hardness, carbon, tensile));
    }
  }
  
  private static int getGrade(boolean hardness, boolean carbon, boolean tensile) {
    if(hardness && carbon && tensile) return 10;
    if(hardness && carbon) return 9;
    if(carbon && tensile) return 8;
    if(hardness && tensile) return 7;
    if(!(hardness || carbon || tensile)) return 5;
    else return 6;
  }

}
