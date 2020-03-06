import java.util.Scanner;

public class OneTwoAlot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("addnumbers");
        int addnumbers = scanner.nextInt();

        if (addnumbers <= 0 ) {
            System.out.println("not enought");

        }else if(addnumbers == 1){
            System.out.println("one");
        }else if (addnumbers == 2 ){
            System.out.println("two");

        }else {
            System.out.println("a lot");
        }
    }

}
