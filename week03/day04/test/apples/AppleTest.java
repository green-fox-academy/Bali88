package apples;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class AppleTest {
  Apples apples = new Apples();

  @Test
  void test1() {
  assertEquals("apple",apples.getApple("apple"));
  }
}
