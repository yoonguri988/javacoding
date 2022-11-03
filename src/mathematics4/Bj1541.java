package mathematics4;
import java.io.*;
import java.util.*;
public class Bj1541 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] srr = br.readLine().split("-");
    
    for (int i = 0; i < srr.length; i++) {
        srr[i] = Arrays.asList(srr[i].split("\\+")).stream().mapToInt(x->Integer.parseInt(x)).sum()+"";
    }
    
    int answer = Integer.parseInt(srr[0]);
    for (int i = 1; i < srr.length; i++) {
      answer -= Integer.parseInt(srr[i]);
    }
    System.out.println(answer);
  }
}
