package com.pankaj.uva;

import java.io.IOException;

public class ThreeNPlusOne {
  
  static String ReadLn (int maxLg) {
      byte lin[] = new byte [maxLg];
      int lg = 0, car = -1;
      String line = "";

      try
      {
          while (lg < maxLg)
          {
              car = System.in.read();
              if ((car < 0) || (car == '\n')) break;
              lin [lg++] += car;
          }
      }
      catch (IOException e)
      {
          return (null);
      }

      if ((car < 0) && (lg == 0)) return (null);  // eof
      return (new String (lin, 0, lg));
  }

  public static void main(String[] args) throws IOException {
    String input = "";
    while ((input = ThreeNPlusOne.ReadLn (255)) != null) {
      String[] line = input.split(" ");
      int start = Integer.parseInt(line[0].trim());
      int end = Integer.parseInt(line[1].trim());
      int cycleLength = getCycleLength(start, end);
      System.out.println(start +" "+ end+ " "+cycleLength);
    }
  }
  
  private static int getCycleLength(int start, int end) {
    int maxCount = 0;
    for(int i=start;i<=end;i++) {
      int count = 1;
      int num = i;
      while(num>1) {
        count++;
        if(num%2 == 0) {
          num /= 2;
        } else {
          num = 3*num + 1;
        }
      }
      if(count > maxCount) {
        maxCount = count;
      }
    }
    return maxCount;
  }

}
