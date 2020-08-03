package anagram;

import static anagram.Anagram.isAnagram;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class AnagramTest {
  @Test
  public void isReallyAnagram() {
    assertEquals(true, isAnagram("majom", "mmaoj"));
  }

  @Test
  public void isNotAnagram() {
    assertEquals(false, isAnagram("bela", "sanyi"));
  }
}

