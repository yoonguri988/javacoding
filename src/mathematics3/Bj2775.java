package mathematics3;
import java.io.*;
public class Bj2775 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /*
     * a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다
     * 첫 번째 줄에 Test case의 수 T가 주어진다. 
     * 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다
     * k층에 n호에는 몇 명이 살고 있는지
     */
    int t = Integer.parseInt(br.readLine());
    for (int i = 0 ; i < t ; i++) {
      int k = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());  
      
      int answer = missboss(k, n);
      System.out.println(answer);
    }
  }

  private static int missboss(int k, int n) {
    int cnt = 0;
    if (k == 0) return n;
    for (int i = 1; i <= n; i++) {
      cnt += missboss(k-1, i);
    }
    return cnt;
  }
}
