import java.util.Arrays;
import java.util.Collections;

public class SwapElements {
  public static void main(String[] args) {
    // - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`
    String[] orders = {"first", "second", "third"};
    for (String a : orders) {
      System.out.println(a);
    }
    System.out.println("\n");
    String first = orders[0];
    orders[0] = orders[2];
    orders[2] = first;
    for (String a : orders) {
      System.out.println(a);
    }
  }
}
