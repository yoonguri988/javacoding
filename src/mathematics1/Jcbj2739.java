package mathematics1;
import java.io.*;
public class Jcbj2739 {
  public static void main(String[] args) throws IOException {
    //2739 구구단 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for(int i = 1; i < 10 ; i++) {
      System.out.printf("%s * %s = %s\n",n,i,i*n);
    }
  }
}
