package mathematics1;

import java.io.*;

public class Jcbj2753 {
  public static void main(String[] args) throws IOException {
    //2753 윤년
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    if ((n%4 == 0 && n%100 != 0)||(n%400 == 0)) { //4의 배수이면서 100의 배수가 아닐때 // 400의 배수일 때
      System.out.println(1);
    }else {
      System.out.println(0);
    }
  }
}
