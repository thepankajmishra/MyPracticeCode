package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MMass {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] formula = ("("+br.readLine()+")").toCharArray();
    Stack<Character> stack = new Stack<>();
    int x = 0;
    for(int i=0;i<formula.length;i++) {
      if(formula[i] == ')') {
        int multiple = 1;
        if(i+1 <= formula.length -1 && Character.isDigit(formula[i+1])) {
          multiple = Character.digit(formula[i+1],10);
          i++;
        }
        int temp = 0;
        char c = ',';
        boolean isDigit = false;
        int digit = 1;
        while((c = stack.pop()) != '(') {
          if(c == 'X') {
            temp += x;
          } else if(Character.isDigit(c)) {
            isDigit = true;
            digit = Character.digit(c, 10);
          }
          else {
            temp = temp + (isDigit ? digit * getNum(c) : getNum(c));
            isDigit = false;
          }
        }
        x = (temp * multiple) > 0 ? (temp * multiple) : x;
        stack.push((char)x);
      } else {
        stack.push(formula[i]);
      }
    }
    System.out.println(x);
  }
  
  private static int getNum(char c) {
    return c == 'C' ? 12 : c == 'H' ? 1 : c == 'O' ? 16 : (int)c; 
  }
  
}
