import java.util.Scanner;

public class partyindicator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("how many girls in the party?");
        int girls = scanner.nextInt();
        System.out.println("how many boys in the party?");
        int boys = scanner.nextInt();

        if (girls == 0) {
            System.out.println("Sausage party!");
        } else if (girls + boys < 20) {
            System.out.println("Average party.");
        } else if (girls + boys >= 20 && girls == boys) {
            System.out.println("Excellent party!");
        } else if (girls != boys && boys + girls >= 20) {
            System.out.println("Quite ok, could be better");
        }


    }
}
