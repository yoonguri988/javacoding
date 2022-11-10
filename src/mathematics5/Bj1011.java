package mathematics5;
import java.io.*;
import java.util.*;
public class Bj1011 {
  public static int cnt;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    
    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      //최소한의 공간이동장치 횟수
      //y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년으로 하려 한다.
      int max = (int)Math.sqrt(y-x);
      
      if (max == Math.sqrt(y-x)) { //
        System.out.println(max*2-1);
      }else if(y-x <= max*max+max) {
        System.out.println(max*2);
      }else {
        System.out.println(max*2+1);
      }
    }
  }
}
