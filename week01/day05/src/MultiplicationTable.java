import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number!");
        int userInput2 = scanner.nextInt();
        int enteredNumber = userInput2;
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + enteredNumber + " = " + (enteredNumber * i));

        }




    }
}
