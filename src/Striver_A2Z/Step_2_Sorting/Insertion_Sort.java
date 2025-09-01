package Striver_A2Z.Step_2_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort {
    public static String insertionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(insertionSort(arr));
    }
}
