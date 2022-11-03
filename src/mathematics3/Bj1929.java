package mathematics3;
import java.io.*;
import java.util.*;
public class Bj1929 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    //M이상 N이하의 소수를 모두 출력
    int[] nums = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(x->Integer.parseInt(x)).toArray();
    
    boolean sosu[] = new boolean[nums[1]+1];
    for (int i = 2; i <= nums[1]; i++) {
      if (sosu[i]) continue;
      if (i >= nums[0]) sb.append(i).append("\n");
      
      for(int j = i+i; j <= nums[1]; j+=i) {
        sosu[j] = true;
      }
    }
    System.out.println(sb);
  }
}
