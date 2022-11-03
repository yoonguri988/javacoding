package mathematics1;

import java.io.*;

public class Jcbj10998 {
  public static void main(String[] args) throws IOException {
    //10998 AXB 
    //ip = 1 2 //op = 2
    //ip = 3 4 //op = 12
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    
    System.out.println(Integer.parseInt(str[0])*Integer.parseInt(str[1]));
  }
}