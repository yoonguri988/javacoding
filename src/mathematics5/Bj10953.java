package mathematics5;
import java.io.*;
import java.util.*;
public class Bj10953 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for(int i = 0; i < t; i++) {
      int sum = Arrays.asList(br.readLine().split(",")).stream().mapToInt(x->Integer.parseInt(x)).sum();
      System.out.println(sum);
    }
  }
}
