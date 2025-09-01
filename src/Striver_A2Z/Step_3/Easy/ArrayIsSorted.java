package Striver_A2Z.Step_3.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSorted {
    public static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(isSorted(arr));
    }
}
