package Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        int n = arr.length;
        int k;
        for(int i=1;i<n;i++){
            k = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>k){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = k;
        }
        return arr;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        insertionSort(arr);
        print(arr);
    }
}
