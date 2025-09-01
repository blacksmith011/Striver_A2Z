package Collections.map;

import java.util.HashMap;

public class MapBasics {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Aryan",14);
        map.put("Himanshu",83);
        map.put("Aman",13);
        map.put("Ayushi",82);
        map.put("Prachi",88);

//        System.out.println(map);
//        System.out.println(map.containsKey("Aryan"));
//        System.out.println(map.containsValue(83));

//  ITERATE OVER A HASHMAP
        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        System.out.println();

        for(Object pair: map.entrySet()){
            System.out.println(pair);
        }

    }
}
