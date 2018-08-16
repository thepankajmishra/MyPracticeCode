package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GEEKOUNT {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      String[] line = br.readLine().split(" ");
      int left = Integer.parseInt(line[0]);
      int right = Integer.parseInt(line[1]);
      int count = 0;
      for(int i=left;i<=right;i++) {
        if(isEven(i)) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
  
  private static boolean isEven(int num) {
    if(num > 0) {
      return num % 2 == 0 ? true : isEven(num / 10);
    } 
    return false;
  }

}
