package mathematics3;
import java.io.*;
import java.util.*;
public class Bj1002 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    for(int i = 0; i < tc; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      double x1 = Double.parseDouble(st.nextToken());
      double y1 = Double.parseDouble(st.nextToken());
      double r1 = Double.parseDouble(st.nextToken());
      double x2 = Double.parseDouble(st.nextToken());
      double y2 = Double.parseDouble(st.nextToken());
      double r2 = Double.parseDouble(st.nextToken());
      
      //Math.pow 거듭제곱
      double d = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
      if(x1==x2 && y1==y2 && r1==r2) { // 무수히 많이 교차함 -> 같은 위치에 있음
        System.out.println(-1);
      }else if (r1+r2 > d && d > Math.abs(r2-r1)) { // 두점에서 교차하는 원
        System.out.println(2);
      }else if(r1+r2 == d || d == Math.abs(r2-r1)) { // 한점에서 교차하는 원
        System.out.println(1);
      }else {
        System.out.println(0);
      }
    }
  }
}
