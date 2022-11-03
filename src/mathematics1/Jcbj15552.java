package mathematics1;
import java.io.*;
public class Jcbj15552 {
  public static void main(String[] args) throws IOException {
    // 2577 숫자의 개수 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      String[] sa = br.readLine().split(" ");
      bw.write(String.valueOf(Integer.parseInt(sa[0])+Integer.parseInt(sa[1]))+"\n");
    }
    bw.flush();
  }
}
