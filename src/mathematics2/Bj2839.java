package mathematics2;
import java.io.*;
public class Bj2839 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //설탕배달 (3키로, 5키로)
    //최대한 적은 봉지, 단, 정확하게 N킬로그램으로 만들 수 없는 경우 -1
    int n = Integer.parseInt(br.readLine());
    System.out.println(sugar(n)>0?sugar(n):-1);
  }

  private static int sugar(int n) {
    if (n%5==0) return n/5; 
    return 1+sugar(n-3);
  }
}
