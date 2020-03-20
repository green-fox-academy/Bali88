package dataStructures;

import java.util.HashMap;

public class Map2 {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();

        map.put("978-1-60309-452-8","A Letter to Jo");
        map.put("978-1-60309-459-7","Lupus");
        map.put("978-1-60309-444-3","Red Panda and Moon Bear");
        map.put("978-1-60309-461-0","The Lab");


        map.entrySet().forEach(entry->{
            System.out.println(entry.getValue() + " : " + entry.getKey());
        });

        map.remove( "978-1-60309-444-3");



    }
}

