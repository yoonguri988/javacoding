package mathematics3;
import java.io.*;
import java.util.*;
public class Bj2869 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // A:낮에올라가는높이  B:밤에미끄러지는높이  V:높이
    // 며칠이 걸리는가?
    int[] har = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(x->Integer.parseInt(x)).toArray();
    int cnt = (har[2]-har[1]) / (har[0]-har[1]);
    if ((har[2]-har[1]) % (har[0]-har[1]) != 0) cnt++;
    System.out.println(cnt);
  }
}
