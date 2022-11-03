package mathematics4;
import java.io.*;
import java.util.*;
public class Bj11050 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //이항계수 알고리즘
    //파스칼의 삼각형
    StringTokenizer st = new StringTokenizer(br.readLine());
    int d = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());
    int[][] dp = new int[d+1][p+1];
    
    for (int i = 0; i <= d; i++) {
      for (int j = 0; j <= Math.min(i, p) ; j++) {
        if (i == j || j == 0) {
          dp[i][j] = 1;
        }else {
          dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
        }
      }
    }
    System.out.println(dp[d][p]);
  }
}
