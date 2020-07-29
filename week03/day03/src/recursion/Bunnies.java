package recursion;

public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunnies(10));
  }

  public static int bunnies(int numberOfBunny) {
    int numberOfBunnyEars = 2;
    if (numberOfBunny == 0) {
      return 0;
    } else {
      return numberOfBunnyEars + bunnies(numberOfBunny - 1);
    }
  }
}
