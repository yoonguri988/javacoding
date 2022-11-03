package mathematics3;
import java.io.*;
import java.math.*;
import java.util.*;
public class Bj10757 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer nums = new StringTokenizer(br.readLine());
    BigInteger A = new BigInteger(nums.nextToken());
    BigInteger B = new BigInteger(nums.nextToken());
    
    A = A.add(B);
    System.out.println(A);
  }
}
