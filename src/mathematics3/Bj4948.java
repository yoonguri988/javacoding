package mathematics3;
import java.io.*;
import java.util.*;
public class Bj4948 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수
    while(true) {
      int num = Integer.parseInt(br.readLine());
      if (num == 0) break;
      boolean sosu[] = new boolean[num*2+1];
      
      List<Integer> list = new ArrayList<Integer>();
      for (int i = 2; i <= num*2; i++) {
        if (sosu[i]) continue;
        if (num < i) list.add(i);
        
        for(int j = i+i; j <= num*2; j+=i) {
          sosu[j] = true;
        }
      }
      System.out.println(list.stream().count());
    }
  }
}
