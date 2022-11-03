package mathematics3;
import java.io.*;
public class Bj1193 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
   
    int croscnt = 1;
    int precntsum = 0;
    
    /*
     * T 가 짝수, 또는 대각선 칸의 개수가 홀수 일 때는 왼쪽 아래에서 오른쪽 위 방향 ( ↗︎ ) 으로 진행되고,
     * T 가 홀수, 또는 대각선 칸의 개수가 짝수 일 때는 오른쪽 위에서 왼쪽 아래 방향 ( ↙︎ ) 으로 진행된다.
     * 즉, T % 2 가 0 일 때는 대각선 위 방향, 1 일 때는 아래 방향으로 진행된다는 것.
     * 
     * 입력받는 num
     * 해당 범위의 대각선 칸 갯수
     * 해당 대각선 직전까지의 칸의 누적 합
     */

    while(num > croscnt + precntsum) {
      precntsum += croscnt;
      croscnt++;
    }
    if (croscnt % 2 == 0) {
      System.out.println(num-precntsum+"/"+(croscnt-(num-precntsum-1)));
    }else {
      System.out.println(croscnt-(num-precntsum-1)+"/"+(num-precntsum));
    }
  }
}
