package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ARMY {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      br.readLine();
      String[] line = br.readLine().split(" ");
      int len1 = Integer.parseInt(line[0]);
      int len2 = Integer.parseInt(line[1]);
      int[] godzilla = new int[len1];
      int[] mechaGodzilla = new int[len2];
      line = br.readLine().split(" ");
      for(int i=0;i<len1;i++) {
        godzilla[i] = Integer.parseInt(line[i]);
      }
      
      line = br.readLine().split(" ");
      for(int i=0;i<len2;i++) {
        mechaGodzilla[i] = Integer.parseInt(line[i]);
      }
      
      sort(godzilla, 0, godzilla.length - 1);
      sort(mechaGodzilla, 0, mechaGodzilla.length - 1);
      printWinner(godzilla, mechaGodzilla);
    }
  }
  
  private static void printWinner(int[] godzilla, int[] mechaGodzilla) {
    
    int p = 0;
    int q = 0;
    while(p <= godzilla.length || q <= mechaGodzilla.length) {
      if(p == godzilla.length) {
        System.out.println("MechaGodzilla");
        break;
      } else if(q == mechaGodzilla.length) {
        System.out.println("Godzilla");
        break;
      } else if(mechaGodzilla[q] <= godzilla[p]) {
        q++;
      } else {
        p++;
      }
    }
  }

  private static void sort(int[] arr, int start, int end) {
    if(start < end) {
      int mid = (start + end)/2;
      sort(arr, start, mid);
      sort(arr, mid+1, end);
      merge(arr, start, mid, end);
    }
  }
  
  private static void merge(int[] arr, int start, int mid, int end) {
    int p = start;
    int q = mid + 1;
    int len = (end - start) + 1;
    int[] array = new int[len];
    
    for(int i=0;i<len;i++) {
      if(p > mid) {
        array[i] = arr[q++];
      } else if(q > end) {
        array[i] = arr[p++];
      } else if(arr[p] <= arr[q]){
        array[i] = arr[p++];
      } else {
        array[i] = arr[q++];
      }
    }
    
    for(int i=0;i<len;i++) {
      arr[start++] = array[i];
    }
  }

}
