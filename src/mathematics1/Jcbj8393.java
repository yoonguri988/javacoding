package mathematics1;

import java.io.*;

public class Jcbj8393 {
  public static void main(String[] args) throws IOException {
    //10430 합
    // 1부터 n까지 합
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    int answer = 0;
    for (int i = 1; i <= n; i++) {
      answer += i;
    }
    System.out.println(answer);
    
  }
}
