package dataStructures;

import java.util.ArrayList;

public class List2 {
    public static void main(String[] args) {

        ArrayList<String> ListA = new ArrayList<>();

        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");
        System.out.println(ListA);
        ArrayList<String> ListB = new ArrayList<>();
        ListB.addAll(ListA);
        System.out.println(ListB);


        System.out.println(ListA.contains("Durian"));
        ListB.remove(3);
        System.out.println(ListB);
        ListA.add(4,"Kiwifruit");
        System.out.println(ListA);
        System.out.println(ListA.size());
        System.out.println(ListB.size());

        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(ListB.indexOf("Durian"));

        System.out.println(ListA.get(2));
    }
}
