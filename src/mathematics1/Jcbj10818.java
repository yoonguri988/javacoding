package mathematics1;
import java.io.*;
import java.util.*;
public class Jcbj10818 {
  public static void main(String[] args) throws IOException {
    //1110 더하기 사이클
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] s = br.readLine().split(" ");
    
    int max = Arrays.asList(s).stream().mapToInt(x->Integer.parseInt(x)).max().getAsInt();
    int min = Arrays.asList(s).stream().mapToInt(x->Integer.parseInt(x)).min().getAsInt();
    
    System.out.printf("%s %s",min, max);
    
  }

}
