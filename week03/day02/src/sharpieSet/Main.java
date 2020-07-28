package sharpieSet;

import java.util.ArrayList;
import java.util.List;


public class Main {
  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("green",3);
    Sharpie sharpie1 = new Sharpie("blue",4);
    List<Sharpie> listOfSharpies = new ArrayList<>();
    listOfSharpies.add(sharpie);
    listOfSharpies.add(sharpie1);

    System.out.println(sharpie.getInkAmount());


  }
}
