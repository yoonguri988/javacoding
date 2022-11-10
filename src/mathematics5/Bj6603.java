package mathematics5;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Bj6603 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //독일 로또는 {1, 2, ..., 49}에서 수 6개
    //k=7, S={1 2 3 4 5 6 7} 인경우 7개
    //k=8, S={1,2,3,5,8,13,21,34}인 경우 이 집합 S에서 수를 고를 수 있는 경우의 수는 총 28
    
    //백트레킹
    //조합(combination)
    while(true) {
      int[] arr = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(x->Integer.parseInt(x)).toArray();
      if (arr[0] == 0) break;
      int k = arr[0];
      List<Integer> s = Arrays.stream(arr).boxed().collect(Collectors.toList()).subList(1, arr.length);
      boolean[] visited = new boolean[k];
      int n = 6;
      combination(s, visited, 0, k, n);
      System.out.println();
    }
  }

  private static void combination(List<Integer> s, boolean[] visited, int start, int k, int n) {
    if (n == 0) {
      int chk = 0;
      for (int i = 0; i < s.size(); i++) {
        if (visited[i]) {
          System.out.print(s.get(i));
          chk++;
          if(chk<6) System.out.print(" ");
        }
        
      }
      System.out.println();
    }
    for (int i = start; i < k; i++) {
      visited[i] = true;
      combination(s, visited, i+1, k, n-1);
      visited[i] = false;
    }
    
  }
}
