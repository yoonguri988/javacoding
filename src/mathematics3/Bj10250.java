package mathematics3;
import java.io.*;
import java.util.*;
public class Bj10250 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for(int i = 0 ; i < t ; i++ ) {
      double[] lst = Arrays.asList(br.readLine().split(" ")).stream().mapToDouble(x->Double.parseDouble(x)).toArray();
      //호텔층수 각층방수 몇번째손님
      int h = (int) Math.ceil(lst[2]/lst[0]);
      int f = (int) (lst[2]-(lst[0]*(h-1)));
      System.out.printf("%d%02d\n",f,h);
    }
  }
}
