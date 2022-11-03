package mathematics1;
import java.io.*;
public class Jcbj10951 {
  public static void main(String[] args) throws IOException {
    // 10951 A+B - 4
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String ip = br.readLine();
    String s = ip==null?"":ip;
    while(ip != null) {
      String[] sa = s.split(" "); 
      System.out.printf("%s\n",(Integer.parseInt(sa[0])+Integer.parseInt(sa[1])));
      ip = br.readLine();
      s = ip==null?"":ip;
    }
  }
}
