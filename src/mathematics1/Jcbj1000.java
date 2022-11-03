package mathematics1;

import java.io.*;
import java.util.Arrays;

public class Jcbj1000 {
  public static void main(String[] args) throws IOException {
	//1000 A+B 
	//ip = 1 2 //op = 3
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    
    Integer sum = Arrays.asList(str).stream().mapToInt(x->Integer.parseInt(x)).sum();
    System.out.println(sum.toString());
  }
}
