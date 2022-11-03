package mathematics1;

import java.io.*;
import java.util.*;

public class Jcbj2588 {
  public static void main(String[] args) throws IOException {
    //2588 곱셈
    //첫째 줄부터 넷째 줄까지 차례대로 값을 출력한다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String str2 = br.readLine();
    
    int a = Integer.parseInt(str1);
    int b = Integer.parseInt(str2);
    int[] blist = Arrays.asList(str2.split("")).stream().mapToInt(x->Integer.parseInt(x)).toArray();
    int blen = blist.length;
 
    for (int i = 1; i <= blist.length; i++) {
      System.out.println(a*blist[blen-i]);
    }
    System.out.println(a*b);
  }
}
