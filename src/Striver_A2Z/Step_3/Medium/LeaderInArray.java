package Striver_A2Z.Step_3.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LeaderInArray {
    public static ArrayList<Integer> leader(int[] arr){
        ArrayList<Integer> lst = new ArrayList<>();
        int max = arr[arr.length-1];
        lst.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max) {
                lst.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(lst);
        return lst;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(leader(arr));
    }
}
