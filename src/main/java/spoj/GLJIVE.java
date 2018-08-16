package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GLJIVE {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    for(int i=0;i<10;i++) {
      int num = Integer.parseInt(br.readLine().trim());
      if(sum + num > 100) {
        if(100 - sum >= (sum + num) - 100) {
          sum = sum + num;
        }
        break;
      }
      if(sum + num <= 100) {
        sum += num;
      }
    }
    System.out.println(sum);
  }

}
