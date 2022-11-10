package mathematics5;
import java.io.*;
import java.util.*;
public class Bj2108 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Map<Integer,Integer> tm = new TreeMap<Integer,Integer>();
    int[] arr = new int[n];
    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      int nums = Integer.parseInt(br.readLine());
      if (tm.get(nums) != null) tm.put(nums, tm.get(nums)+1);
      else tm.put(nums, 0);
      
      arr[i] = nums;
      sum += nums;
    }
    Arrays.sort(arr);
    
    Comparator<Map.Entry<Integer,Integer>> c = (o1, o2) -> o2.getValue().compareTo(o1.getValue());
    List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(tm.entrySet());
    list.sort(c);
    
    // 산술평균 : sum / n
    System.out.println(Math.round(sum/n));
    // 중앙값
    System.out.println(arr[(arr.length-1)/2]);
    // 최빈값
    if (list.size()>1 && list.get(0).getValue().equals(list.get(1).getValue())) {
      System.out.println(list.get(1).getKey());
    }else {
      System.out.println(list.get(0).getKey());
    }
    // 범위 
    System.out.println(arr[arr.length-1]-arr[0]);
  }
}
