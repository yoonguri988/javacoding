package mathematics4;
import java.io.*;
import java.util.*;
public class Bj9020 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 2보다 큰 짝수는 두 소수의 합으로 이루어져있다.
    // 소수 구하깅
    int t = Integer.parseInt(br.readLine());
    for (int k = 0; k < t; k++) {
      int n = Integer.parseInt(br.readLine());
      
      boolean[] sosu = new boolean[10001];
      List<Integer> list = new ArrayList<Integer>();
      for (int i = 2; i <= n; i++) {
        if (sosu[i]) continue;
        list.add(i);
        
        for (int j = i+i; j < sosu.length; j+=i) {
          sosu[j] = true;
        }
      }
      
      Map<Integer, String> hm = new TreeMap<>();
      for (Integer i : list) {
        if(list.indexOf(n-i) != -1 && hm.get(Math.abs(i*2-n)) == null) {
          hm.put(Math.abs(i*2-n), i+" "+(n-i));
        }
      }
      System.out.println(hm.values().toArray()[0]);
    }

  }
}
