package mathematics1;
import java.io.*;
public class Jcbj2577 {
  public static void main(String[] args) throws IOException {
    // 2577 숫자의 개수 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    
    int num = a * b * c;
    String ns[] = String.valueOf(num).split(""); 
    int[] ncnt = new int[10];
    for (int i = 0; i < ns.length; i++) {
      ncnt[Integer.parseInt(ns[i])] += 1; 
    }
    
    for (int i : ncnt) {
      System.out.println(i);
    }
  }
}
