package mathematics3;
import java.io.*;
import java.util.*;
public class Bj2475 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //각 숫자를 제곱한 수들의 합 을 10으로 나눈 나머지
    int answer = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(x->(int)Math.pow(Integer.parseInt(x),2)).sum()%10;
    System.out.println(answer);
  }
}
