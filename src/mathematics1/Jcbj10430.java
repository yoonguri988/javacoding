package mathematics1;

import java.io.*;
import java.util.*;

public class Jcbj10430 {
  public static void main(String[] args) throws IOException {
    //10430 나머지
    //첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int[] lst = Arrays.asList(str).stream().mapToInt(x->Integer.parseInt(x)).toArray(); 
    
    int a = lst[0];
    int b = lst[1];
    int c = lst[2];
    
    System.out.println((a+b)%c);
    System.out.println((a%c+b%c)%c);
    System.out.println((a*b)%c);
    System.out.println((a%c*b%c)%c);
    
  }
}
