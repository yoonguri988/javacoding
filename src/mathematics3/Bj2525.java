package mathematics3;
import java.io.*;
import java.util.*;
public class Bj2525 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //첫줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력
    //둘째줄에는 요리하는데 필요한 시각(분단위)
    //23:59 -> 0:0
    int[] time = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(x->Integer.parseInt(x)).toArray();
    int cook = Integer.parseInt(br.readLine());
    
    time[1] += cook;
    while (time[1] >= 60) {
      time[1] -= 60;
      time[0] += 1;
      if(time[0] >= 24) time[0] = 0;
    }
    System.out.printf("%d %d",time[0],time[1]);
    
    
    
  }
}
