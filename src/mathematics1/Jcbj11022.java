package mathematics1;
import java.io.*;
public class Jcbj11022 {
  public static void main(String[] args) throws IOException {
    // 11022 A+B - 8
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for (int i = 1; i <= n; i++) {
      String[] s = br.readLine().split(" ");
      System.out.printf("Case #%s: %s + %s = %s\n",i,s[0],s[1],(Integer.parseInt(s[0])+Integer.parseInt(s[1])));
    }
  }
}
