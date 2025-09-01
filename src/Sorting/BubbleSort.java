package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] ans = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
