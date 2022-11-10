package mathematics5;
import java.io.*;
import java.util.*;
public class Bj3053 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int r = Integer.parseInt(br.readLine());
    
    System.out.printf("%.6f\n",Math.PI*r*r);
    System.out.printf("%.6f\n",(double)2*r*r);
  }
}
