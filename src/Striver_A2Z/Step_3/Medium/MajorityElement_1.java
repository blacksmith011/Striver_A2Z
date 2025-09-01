package Striver_A2Z.Step_3.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement_1 {
    public static int majority(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            } else {
                map.put(ele,1);
            }
        }
        int ans = Integer.MIN_VALUE;
//        for(int ){
//            ans = Math.max(ans,);
//        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(majority(arr));
    }
}


