package mathematics4;
import java.io.*;
import java.util.*;
public class Bj5543 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격
    // 햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력
    List<Integer> burgers = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      burgers.add(Integer.parseInt(br.readLine()));
    }
    List<Integer> drinks = new ArrayList<>();
    for (int i = 0; i < 2; i++) {
      drinks.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(burgers);
    Collections.sort(drinks);
    
    System.out.println(burgers.get(0)+drinks.get(0)-50);
  }
}
