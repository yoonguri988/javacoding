package mathematics3;
import java.io.*;
import java.util.*;
public class Bj2480 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String dice[] = br.readLine().split(" ");
    int answer = 0;
    
    Map<Integer,Integer> hm = new TreeMap<>();
    for (String a : dice) {
      int k = Integer.parseInt(a);
      hm.put(k, hm.get(k)==null?1:hm.get(k)+1);
    }
    List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hm.entrySet());
    list.sort ((hmx, hmy) -> hmy.getKey().compareTo(hmx.getKey()));
    list.sort((hmx, hmy) -> hmy.getValue().compareTo(hmx.getValue()));
    
    Map.Entry<Integer, Integer> entry = list.get(0);
    if (entry.getValue() == 3) {
      answer = 10000+entry.getKey()*1000;
    }else if (entry.getValue() == 2) {
      answer = 1000+entry.getKey()*100;
    }else {
      answer = entry.getKey()*100;
    }
    System.out.println(answer);
  }
}
