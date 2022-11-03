package mathematics3;
import java.io.*;
import java.util.*;
public class Bj1924 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int MM = Integer.parseInt(st.nextToken());
    int dd = Integer.parseInt(st.nextToken());
    String[] ss = {"SUN","MON","TUE","WED","THU","FRI","SAT"}; 
    
    int date = dd;
    int cnt = MM-1;
    while(cnt > 0) {
      if(cnt == 2) date += 28;
      else if(cnt == 4 || cnt == 6 || cnt == 9 || cnt == 11) date += 30;
      else date += 31;
      cnt--;
    }
    System.out.println(ss[date%ss.length]);
  }
}
