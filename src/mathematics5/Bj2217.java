package mathematics5;
import java.io.*;
import java.util.*;
public class Bj2217 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // N(1 ≤ N ≤ 100,000)개의 로프
    // 여러 개의 로프를 병렬로 연결하면 각각의 로프에 걸리는 중량을 나눌 수 있다
    // k개의 로프를 사용하여 중량이 w인 물체를 들어올릴 때, 
    // 각각의 로프에는 모두 고르게 w/k 만큼의 중량
    // 물체의 최대 중량
    // ip 2
    //    10
    //    15
    // op 20
    //그리드 알고리즘
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    for (int i = 0; i < n; i++) {
      arr[i] = (Integer)Integer.parseInt(br.readLine());
    }
    Arrays.sort(arr,Collections.reverseOrder());
    
    int max = 0;
    for (int i = 0; i < n; i++) {
        if(arr[i]*(i+1) > max) max = arr[i]*(i+1);
    }
    System.out.println(max);
  }
}
