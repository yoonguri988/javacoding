package mathematics1;

import java.io.*;
import java.util.*;


public class Jcbj1001 {
  public static void main(String[] args) throws IOException {
    //1001 A-B 
    //ip = 3 2 //op = 1
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    
    System.out.println(Integer.parseInt(str[0])-Integer.parseInt(str[1]));
  }
}
