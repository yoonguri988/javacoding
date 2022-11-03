package mathematics1;

import java.io.*;
import java.util.*;

public class Jcbj10950 {
  public static void main(String[] args) throws IOException {
    //10950 A+B - 3
    //각 테스트 케이스마다 A+B를 출력한다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    for (int i = 0; i < n; i++) {
      System.out.println(Arrays.asList(br.readLine().split(" ")).stream().mapToInt(x->Integer.parseInt(x)).sum());
    }
  }
}
