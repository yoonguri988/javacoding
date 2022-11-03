package mathematics4;
import java.io.*;
import java.util.*;
public class Bj3003 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성
    // 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수
    // 양수라면 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거
    
    int[] bc = {1,1,2,2,2,8};
    int[] wc = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(x->Integer.parseInt(x)).toArray();
    for (int i = 0; i < wc.length; i++) {
      bc[i] -= wc[i];
    }
    
    System.out.println(Arrays.toString(bc).replace(",", "").replace("[", "").replace("]", ""));
  }
}
