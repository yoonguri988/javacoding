package mathematics2;
import java.io.*;
public class Bj2292 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int answer = beeHouse(n-1);
    System.out.println(answer);
  }
  
  private static int beeHouse(int n) {
    if (n == 0) return 1;
    int cnt = 1;
    while(n > 0) {
      n -= 6*cnt;
      cnt++;
    }
    return cnt;
  }
}
