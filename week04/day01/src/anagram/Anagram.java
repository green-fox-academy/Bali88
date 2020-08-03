package anagram;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("majom", "aojmm"));
  }

  public static boolean isAnagram(String word1, String word2) {
    StringBuilder tempWord = new StringBuilder();
    if (word1.length() == word2.length()) {
      for (int i = 0; i < word1.length(); i++) {
        for (int j = 0; j < word2.length(); j++) {
          if (word1.charAt(i) == word2.charAt(j)) {
            tempWord.append(word1.charAt(i));
            break;
          }
        }
      }
    }
    return tempWord.length() == word1.length();
  }
}
