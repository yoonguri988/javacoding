package mathematics2;
import java.io.*;
import java.util.*;
public class Bj4344 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < n; i++) {
      Double answer = 0.0;
      String[] str = br.readLine().split(" ");
      double avg = Arrays.asList(str).subList(1, str.length).stream().mapToDouble(x->Double.parseDouble(x)).average().getAsDouble();
      
      for (double d : Arrays.asList(str).subList(1, str.length).stream().mapToDouble(x->Double.parseDouble(x)).toArray()) {
        if(avg < d) answer++;
      }
      System.out.printf("%.3f",answer/Integer.parseInt(str[0])*100);
      System.out.print("%\n");
    }
  }
}
