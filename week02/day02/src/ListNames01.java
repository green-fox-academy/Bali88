import java.util.ArrayList;

public class ListNames01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names);
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (String name01 : names) {
            System.out.println(name01);
        }
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println("\nRound "+ i);
//            System.out.println((i + 1) + ". " + names.get(i));
//        }


//
//        for (int i = 1; i <= names.size(); i++) {
//            System.out.println("\nRound "+ i);
//            System.out.println((i) + ". " + names.get(i-1));
//        }

//        names.remove(1);


            







    }
}
