package mathematics1;
import java.io.*;
public class Jcbj11021 {
  public static void main(String[] args) throws IOException {
    // 11021 A+B - 7
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for (int i = 1; i <= n; i++) {
      String[] s = br.readLine().split(" ");
      System.out.println("Case #"+i+": "+(Integer.parseInt(s[0])+Integer.parseInt(s[1])));
    }
  }
}
