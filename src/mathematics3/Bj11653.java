package mathematics3;
import java.io.*;
import java.util.*;
public class Bj11653 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int m = Integer.parseInt(br.readLine());    
    
    boolean[] sosu = new boolean[m+1];
    List<Integer> list = new ArrayList<Integer>();
    
    for (int i = 2; i <= m; i++) {
      if (sosu[i]) continue;
      list.add(i);
      
      for(int j = i+i; j <= m; j+=i) {
        sosu[j] = true;
      }
    }
    
    List<Integer> answer = new ArrayList<Integer>();
    int i = 0;
    while(m != 1) {
      if(m%list.get(i) == 0) {
        System.out.printf("%d\n",list.get(i));
        m /= list.get(i);
      }else {
        i++;
      }
    }
  }
}
