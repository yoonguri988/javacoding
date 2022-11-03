package mathematics3;
import java.io.*;
import java.util.*;
public class Bj2609 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    int max = 0;
    for (int i = 1 ; i <= n && i <= m ; i++) {
      if (n%i == 0 && m%i == 0) max = i;
    }
    int min = m*n/max;
    
    System.out.println(max);
    System.out.println(min);
  }
}
