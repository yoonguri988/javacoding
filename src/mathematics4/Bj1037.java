package mathematics4;
import java.io.*;
import java.util.*;
public class Bj1037 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int cnt = Integer.parseInt(br.readLine());
    int[] irr = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(x->Integer.parseInt(x)).sorted().toArray();

    System.out.println(irr[0]*irr[irr.length-1]);
  }
}
