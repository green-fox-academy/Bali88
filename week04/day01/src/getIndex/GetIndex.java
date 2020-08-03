package getIndex;

import java.util.Arrays;
import java.util.List;

public class GetIndex {
  public static void main(String[] args) {
    int value = 3;
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

    System.out.println(getIndex(list, value));
  }

  public static int getIndex(List<Integer> list, int value) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == value) {
        return i;
      }
    }
    return -1;
  }
}
