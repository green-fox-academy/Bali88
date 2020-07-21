import java.util.ArrayList;

public class ListIntroduction2 {
  public static void main(String[] args) {
    ArrayList<String> listA = new ArrayList<>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add("Blueberries");
    listA.add("Durian");
    listA.add("Lychee");

    ArrayList<String> listB = new ArrayList<>(listA);
    System.out.println(listA.contains("Durian"));
    listB.remove("Durian");
    System.out.println(listB);
    listA.add(4, "KiwiFruit");
    System.out.println(listA);
    System.out.println(listA.size());
    System.out.println(listB.size());
    System.out.println(listA.indexOf("Avocado"));
    System.out.println(listB.indexOf("Durian"));
    listB.add("Pomelo, " + "Passion Fruit");
    System.out.println(listB);
    System.out.println(listA.get(2));



  }
}
