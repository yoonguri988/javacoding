package mathematics4;
import java.io.*;
public class Bj2747 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] irr = new int[n+1];
    
    irr[0]=0;
    irr[1]=1;
    for (int i = 2; i <= n; i++) {
      irr[i] = irr[i-1]+irr[i-2];
    }
    System.out.println(irr[n]);
  }
}
