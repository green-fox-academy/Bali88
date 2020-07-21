import java.util.ArrayList;

public class ListIntroduction1 {
  public static void main(String[] args) {


    ArrayList<String> names = new ArrayList<>();
    System.out.println(names.size());
    names.add("William");
    System.out.println(names.isEmpty());
    names.add("John");
    names.add("Amanda");
    System.out.println(names.size());
    System.out.println(names.get(2));
    System.out.println(names);
    for (String c : names) {
      System.out.println(c);
    }

      names.remove(1);
    System.out.println(names);
    for (int i = names.size()-1; i >=0 ; i--) {
      System.out.println(names.get(i));
    }
    names.clear();
    System.out.println(names.size());
  }
}
