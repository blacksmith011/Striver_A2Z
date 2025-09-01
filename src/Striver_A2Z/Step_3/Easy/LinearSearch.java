package Striver_A2Z.Step_3.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr,int tar){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == tar) return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int tar = sc.nextInt();

        System.out.println(linearSearch(arr,tar));
    }
}
