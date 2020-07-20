package function;

public class Doubling {

    // - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
//
    int baseNum = 123;
    public static int doubling ( int baseNum) {
     int a = (baseNum * 2);
      return a;
    }

  public static void main(String[] args) {

    System.out.println(doubling(123));
  }
}
