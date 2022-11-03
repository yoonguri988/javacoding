package mathematics4;
import java.io.*;
import java.util.*;
public class Bj1026 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String[] as = br.readLine().split(" ");
    int[] arr = Arrays.asList(as).stream().mapToInt(x->Integer.parseInt(x)).sorted().toArray();
    
    String[] bs = br.readLine().split(" ");
    int[] brr = Arrays.asList(bs).stream().mapToInt(x->Integer.parseInt(x)).sorted().toArray();

    int answer = 0;
    for (int i = 0; i < n; i++) {
      answer += arr[i]*brr[n-1-i];
    }
    System.out.println(answer);
  }
}
