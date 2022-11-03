package mathematics3;
import java.io.*;
public class Bj9461 {
  public static Long[] answer = new Long[101];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    answer[0] = 0L;
    answer[1] = 1L;
    answer[2] = 1L;
    answer[3] = 1L;
    
    for (int i = 0; i < n; i++) {
      System.out.println(pado(Integer.parseInt(br.readLine())));
    }
  }

  private static Long pado(int n) {
    if (answer[n] == null) {
      answer[n] = pado(n-2) +pado(n-3);
    }
    return answer[n];
  }
}
