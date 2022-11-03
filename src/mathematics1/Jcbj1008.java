package mathematics1;

import java.io.*;

public class Jcbj1008 {
  public static void main(String[] args) throws IOException {
    //10998 A/B 
    //ip = 1 3 //op = 0.33333333333333333333333333333333
    //ip = 4 5 //op = 0.8
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");

    int A = Integer.parseInt(str[0]);
    int B = Integer.parseInt(str[1]);
    
    System.out.println((double)A/B);
  }
}
