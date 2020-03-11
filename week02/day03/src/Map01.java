import javax.xml.stream.events.Characters;
import java.util.HashMap;

public class Map01 {
    public static void main(String[] args) {

        HashMap<Integer, Character> myMap = new HashMap<>();
        System.out.println(myMap);

        if (myMap.isEmpty())
        System.out.println("the map is empty");
        else System.out.println("the map is not empty");

        myMap.put(97,'a');
        myMap.put(98,'b');
        myMap.put(99,'c');
        myMap.put(65,'A');
        myMap.put(66,'B');
        myMap.put(67,'C');

        System.out.println(myMap);

        myMap.put(68,'D');

        for (Integer key: myMap.keySet()) {
            System.out.println( key + " ");
        }





    }
}
