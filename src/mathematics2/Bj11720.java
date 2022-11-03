package mathematics2;

import java.io.*;
import java.util.*;

public class Bj11720 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] s = br.readLine().split("");
    
    int sum = Arrays.asList(s).stream().mapToInt(x->Integer.parseInt(x)).sum();
    System.out.println(sum);
  }
}
