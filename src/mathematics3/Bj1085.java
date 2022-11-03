package mathematics3;
import java.io.*;
import java.util.*;
public class Bj1085 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    /* 한수는 지금 (x, y)에 있다. 
     * 직사각형은 각 변이 좌표축에 평행하고, 
     *왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 
     * 직사각형의 경계선까지 가는 거리의 최솟값
     */
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    
    List<Integer> list = new ArrayList<Integer>();
    list.add(Math.abs(w-x));
    list.add(Math.abs(x));
    list.add(Math.abs(h-y));
    list.add(Math.abs(y));
    
    System.out.println(list.stream().sorted().min((a, b) -> a.compareTo(b)).get());
  }
}
