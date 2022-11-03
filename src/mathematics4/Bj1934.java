package mathematics4;
import java.io.*;
import java.util.*;
public class Bj1934 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      
      // a*b/최대공약수
      int mx = 0;
      for (int j = 1; j <= a && j <= b; j++) {
        if (a%j == 0 && b%j == 0) mx = j;
      }
      System.out.println(a*b/mx);
    }
  }
}

