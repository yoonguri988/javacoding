package mathematics1;

import java.io.*;

public class Jcbj10869 {
  public static void main(String[] args) throws IOException {
    //10869
    //ip : 7 3
    //op : 10 
    //     4
    //     21
    //     2
    //     1
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    
    int A = Integer.parseInt(str[0]);
    int B = Integer.parseInt(str[1]);
    
    System.out.println(A+B);
    System.out.println(A-B);
    System.out.println(A*B);
    System.out.println((int)A/B);
    System.out.println(A%B);
    
  }
}
