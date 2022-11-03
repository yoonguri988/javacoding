package mathematics3;
import java.io.*;
import java.util.*;
public class Bj4153 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
      int[] nums = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(x->Integer.parseInt(x)).sorted().toArray();
      if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0) break;
      if (nums[2] == Math.sqrt(Math.pow(nums[0], 2)+Math.pow(nums[1], 2))) System.out.println("right");
      else System.out.println("wrong");
    }
  }
}
