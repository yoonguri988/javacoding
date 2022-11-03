package mathematics1;

import java.io.*;
import java.util.Arrays;

public class Jcbj2884 {

  public static void main(String[] args) throws IOException {
    //2588 곱셈
    //첫째 줄부터 넷째 줄까지 차례대로 값을 출력한다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t[] = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(x->Integer.parseInt(x)).toArray();
    
    t[1] -= 45;
    if (t[1] < 0) {
      t[0] -= 1;
      t[1] += 60;
    }
    if (t[0] < 0) {
      t[0] = 23;
    }
    System.out.printf("%s %s",t[0],t[1]);
    
  }

}
