package mathematics2;
import java.io.*;
public class Bj2908 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    //숫자를 거꾸로 읽음, 그상태에 큰수를 출력
    int a = reverseNum(s[0]);
    int b = reverseNum(s[1]);
    
    System.out.println(a>=b?a:b);
  }
  
  private static int reverseNum(String s) {
    String str = "";
    for (int i = s.toCharArray().length-1; 0 <= i; i--){
      str += s.toCharArray()[i];
    }
    return Integer.parseInt(str);
  }
}
