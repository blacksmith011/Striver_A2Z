package Striver_A2Z.Step_1;

import java.util.*;

public class CountFrequenciesOFArray {
    public static List<List<Integer>> count(int[] arr){
        List<List<Integer>> lst = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        /*for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]+1));
            }else {
                map.put(arr[i],1);
            }
        }*/

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int key : map.keySet()){
            List<Integer> temp = new ArrayList<>();
            temp.add(key);
            temp.add(map.get(key));
            lst.add(temp);
        }
        return lst;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


    }
}
