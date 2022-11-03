package mathematics3;
import java.io.*;
import java.util.*;
public class Bj2581 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    
    boolean[] sosu = new boolean[m+1];
    List<Integer> list = new ArrayList<Integer>();
    
    for (int i = 2; i <= m; i++) {
      if (sosu[i]) continue;
      if (i >= n) list.add(i);
      
      for(int j = i+i; j <= m; j+=i) {
        sosu[j] = true;
      }
    }
    if (list.size() == 0) {
      System.out.println("-1");
    }else {
      System.out.println(list.stream().mapToInt(x->x).sum());
      System.out.println(list.stream().min((x, y)-> x.compareTo(y)).get());
    }
  }
}
