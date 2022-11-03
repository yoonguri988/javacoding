package mathematics3;
import java.io.*;
import java.util.*;
public class Bj10039 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    List<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < 5; i++) {
      list.add(Integer.parseInt(br.readLine()));
    }
    
    for(int i = 0; i < list.size(); i++) {
      if (list.get(i) <= 40) list.set(i, 40);
    }
    System.out.println(list.stream().mapToInt(x->x).sum()/list.size());
  }
}
