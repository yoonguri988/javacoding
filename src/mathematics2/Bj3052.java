package mathematics2;
import java.io.*;
import java.util.*;
public class Bj3052 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int b = 42;
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) { //10개의 입력값
      int a = Integer.parseInt(br.readLine());
      list.add(a%b);
    }
    System.out.println(list.stream().distinct().count());
  }
}
