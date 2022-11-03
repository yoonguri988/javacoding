package mathematics3;
import java.io.*;
public class Bj2748 {
  public static Long[] arr = new Long[91];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    arr[0] = 0L;
    arr[1] = 1L;
    System.out.println(fibo(Integer.parseInt(br.readLine())));
  }

  private static long fibo(int n) {
    if (arr[n] == null) {
       arr[n] = fibo(n-1)+fibo(n-2);
    }
    return arr[n];
  }
}
