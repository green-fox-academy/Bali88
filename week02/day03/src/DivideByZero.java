import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your dividor ");
        int dividor = scanner.nextInt();

        try {
            int result = 10 / dividor;
            System.out.println(result);
        }catch(ArithmeticException exc) {
            System.out.println("fail");
            exc.printStackTrace();
        }
    }
}
