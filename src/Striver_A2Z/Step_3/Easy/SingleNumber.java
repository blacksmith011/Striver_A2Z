package Striver_A2Z.Step_3.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SingleNumber {
    public static int single(int[] arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey())
//        }

        int result = 0;
        for(int ele : arr){
            result ^= ele;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(single(arr));
    }
}
