package functions;

public class Factorial {
    public static void main(String[] args) {

        //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
        int factorial = factorio(3);
        System.out.println(factorial);
    }
    public static int factorio(int fact) {
        int result = 1;

        for (int i = 1; i <= fact; i++) {
            result = result * i;

        }
        return result;

    }


}
