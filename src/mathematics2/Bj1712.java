package mathematics2;
import java.io.*;
public class Bj1712 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = br.readLine().split(" ");

    // a+n*b <= c*n
    // a<=(c-b)*n   // a/(c-b) <= n
    int a = Integer.parseInt(arr[0]);
    int b = Integer.parseInt(arr[1]);
    int c = Integer.parseInt(arr[2]);
    
    int answer = 0;
    if (c-b == 0) {
      answer = -1;
    }else {
      answer = a/(c-b)+1;
    }

    System.out.println(answer>0?answer:-1);
  }
}
