package arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapElement {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`

        ArrayList<String> orders = new ArrayList<String>(Arrays.asList("first", "second", "third"));

        System.out.println(orders);
        Collections.swap(orders, 0, 2);
        System.out.println(orders);

    }

}
