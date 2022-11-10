package mathematics5;
import java.io.*;
import java.util.*;
public class Bj1476 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 준규가 사는 나라에서는 수 3개를 이용해서 연도를 나타낸다. 
    // 각각의 수는 지구E, 태양S, 그리고 달M을 나타낸다.
    // 우리가 알고있는 1년은 준규가 살고있는 나라에서는 1 1 1로 나타낼 수 있다.
    // 1년이 지날 때마다, 세 수는 모두 1씩 증가
    // 어떤 수가 범위를 넘어가는 경우에는 1이 된다.
    // (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
    int n = 1;
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int e = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    while(true) {
      int chk = 15*(n/15)+e;
      if (chk == 28*(n/28)+s && chk == 19*(n/19)+m) {
        System.out.println(chk);
        break;
      }
      n++;
    }
  }
}
