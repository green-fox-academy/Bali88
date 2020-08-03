package getIndex;

import static getIndex.GetIndex.getIndex;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class GetIndexTest {
  List<Integer> list = Arrays.asList(1,2,3,4,5);

  @Test
  public void valueNotInTheList(){
    assertEquals(-1,getIndex(list,8));

  }
  @Test
  public void valueInTheList(){
    assertEquals(4,getIndex(list,5));
  }
}

