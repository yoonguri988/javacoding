package mathematics1;

import java.io.*;

public class Jcbj1110 {
  public static void main(String[] args) throws IOException {
    //1110 더하기 사이클
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int cnt = 0;
    
    int cn = n;
    do {
      int a = n%10;
      n = a*10 +(n/10+n%10)%10;
      cnt++;
    } while(n != cn);
    
    System.out.println(cnt);
  }
}
