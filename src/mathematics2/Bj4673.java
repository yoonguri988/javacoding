package mathematics2;
import java.io.*;
import java.util.*;
/*
 * 다시 점검 필요
 * 
 */
public class Bj4673 {
  public static void main(String[] args) throws IOException {
    boolean[] barr = new boolean[10001];
    for (int i = 0; i < 10001; i++) {
      int n = selfNum(i);
      
      if (n < 10001) {
        barr[n] = true;
      }
    }
    for (int i = 0; i < barr.length; i++) {
      if(!barr[i]) System.out.println(i);
    }
  }

  private static int selfNum(int n) {
    int sum = n;
    while(n != 0) {
      sum += n%10;
      n /= 10; 
    }
    return sum;
  }
}
