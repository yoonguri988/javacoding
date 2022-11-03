package mathematics2;
import java.io.*;
public class Bj10872 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    int answer = fibo(n);
    System.out.println(answer);
  }
  
  private static int fibo(int n) {
    if(n==0) return 1;
    if(n==1) return 1;
    return n*fibo(n-1);
  }
}
