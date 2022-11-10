package mathematics5;
import java.io.*;
import java.util.*;
public class Bj1759 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 암호는 서로 다른 L개의 알파벳 소문자들로 구성되며 
    // 최소 한 개의 모음(a, e, i, o, u)과 최소 두 개의 자음으로 구성
    // (즉, abc는 가능성이 있는 암호이지만 bac는 그렇지 않다.)
    // 암호로 사용했을 법한 문자의 종류는 C가지
    // C개의 문자들이 모두 주어졌을 때, 가능성 있는 암호들을 모두 구하는 프로그램
    // ip
    // 4 6
    // a t c i s w
    // op
    // 14가지의 종류
    String[] lc = br.readLine().split(" ");
    int l = Integer.parseInt(lc[0]);
    int c = Integer.parseInt(lc[1]);
    
    String[] wrr = br.readLine().split(" ");
    Arrays.sort(wrr);
    boolean visited[] = new boolean[wrr.length];
    combination(wrr,visited,0,c,l);
  }

  private static void combination(String[] wrr, boolean[] visited, int start, int k, int n) {
    if (n == 0) {
      int moem = 0;
      int jaem = 0;
      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < wrr.length; i++) {
        if (visited[i]) {
          sb.append(wrr[i]);
          if (wrr[i].equals("a")||wrr[i].equals("e")||wrr[i].equals("i")||wrr[i].equals("o")||wrr[i].equals("u")) {
            moem++;
          }else {
            jaem++;
          }
        }
      }
      if (moem > 0 && jaem > 1) {
        System.out.println(sb);
      }
    }
    for (int i = start; i < k; i++) {
      visited[i] = true;
      combination(wrr,visited,i+1,k,n-1);
      visited[i] = false;
    }
  }
}
