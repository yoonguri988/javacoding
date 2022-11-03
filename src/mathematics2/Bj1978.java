package mathematics2;
import java.io.*;
import java.util.*;
public class Bj1978 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] str = br.readLine().split(" ");
    
    int answer = 0;
    for (String s : str) {
      answer += sosu(s);
    }
    System.out.println(answer);
  }
  
  private static int sosu(String s) {
    int n = Integer.parseInt(s);
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n%i==0) {
        list.add(i);
        if(i != n/i) list.add(n/i);
      }
    }
    return list.size()==2?1:0;
  }
}