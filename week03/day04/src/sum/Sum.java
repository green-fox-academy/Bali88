package sum;

import java.util.ArrayList;

public class Sum {


  public int sum(ArrayList<Integer> list) {
    int sum = 0;
    for (int i : list) {
      sum += i;
    }
    return sum;
  }

}
