package mathematics1;
import java.io.*;
public class Jcbj10952 {
  public static void main(String[] args) throws IOException {
    //10952 A+B - 5
    //입력의 마지막에는 0 두 개가 들어온다.
    //각 테스트 케이스마다 A+B를 출력한다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] a = br.readLine().split(" ");
    while(!a[0].equals("0") | !a[1].equals("0")) {
      System.out.println(Integer.parseInt(a[0])+Integer.parseInt(a[1]));
      a = br.readLine().split(" ");
    }
  }
}
