package mathematics2;
import java.io.*;
import java.util.*;
public class Bj1546 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] s = br.readLine().split(" ");
    // 입력된 점수 중에 최댓값
    // 모든 점수를 원래점수/최대값*100 = 새로운점수
    // 이에 대한 평균 값은?
    int[] iarr = Arrays.asList(s).stream().mapToInt(x->Integer.parseInt(x)).sorted().toArray();
    double max = iarr[iarr.length-1];
    
    double answer = 0;
    for (int i : iarr) {
      answer += (i/max)*100;
    }
    System.out.println(answer/n);
  }
}
