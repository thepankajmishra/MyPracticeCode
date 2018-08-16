package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACODE {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    while(!"0".equals(line)) {
      System.out.println(getCount(line, 0));
      line = br.readLine();
    }
  }
  
  private static long getCount(String word, long count) {
    if("".equals(word)) return count + 1;
    if(word.charAt(0) == '0') return count;
    count = getCount(word.substring(1), count);
    if(word.length() >= 2) {
      int num = Integer.parseInt(word.substring(0, 2));
      if(num > 0 && num < 27) {
        count = getCount(word.substring(2), count);
      }
    }
    return count;
  }

}
