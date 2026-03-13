package Lab;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String , Integer > map = new HashMap<>();

        map.put("Banana", 10);
        map.put("Apple", 20);
        map.put("Mango", 30);

        int appleCount = map.get("Apple");

        boolean hasOrange = map.containsKey("Orange");

        System.out.println("Does orange exist in the map ? " + hasOrange);

        System.out.println("the apple count is " + appleCount);

        System.out.println(map);

        map.remove("Mango");

        map.put("Sugarcane", 50);
        map.put("Sugarcane", 150);
        map.put("Guava", 200);

        System.out.println(map);

        Set<String> keys = map.keySet();

        for(String key : keys){
            System.out.println(key + " : " + map.get(key));
        }

        for(Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println();
        System.out.println();
        System.out.println(map.entrySet());
    }
}