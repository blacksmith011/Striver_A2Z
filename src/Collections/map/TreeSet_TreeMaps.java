package Collections.map;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSet_TreeMaps {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(100);
        set.add(00);
        set.add(-18);
        set.add(50);

//        for (int ele : set){
//            System.out.print(ele+" ");
//        }

        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Raghav",76);
        map.put("Himanshu",83);
        map.put("Aman",13);
        map.put("Sunil",2);
        map.put("Ayushi",82);
        map.put("Prachi",88);

        for(String k : map.keySet()){
            System.out.println(k+" "+map.get(k));
        }
    }
}
