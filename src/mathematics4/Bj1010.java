package mathematics4;
import java.io.*;
import java.util.*;
public class Bj1010 {
  public static int[][] dp = new int[30][30];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      // 다리놓기, 조합사용
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      
      System.out.println(combo(m, n));
    }
  }

  private static int combo(int m, int n) {
    if(dp[m][n] > 0) return dp[m][n];
    if(n == m || n == 0) return 1;
    
    dp[m][n] = combo(m-1,n-1) + combo(m-1,n);
    return dp[m][n];
  }
}
