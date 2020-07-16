import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the distance is miles");
        double userInput2 = scanner.nextInt();

        userInput2 = userInput2 * 1.609344;
        System.out.println("The distance is km is: " + userInput2);

    }
}
