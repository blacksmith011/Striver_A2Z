package Sorting;

import java.util.Arrays;
import java.util.Scanner;

import static Sorting.BubbleSort.swap;

public class QuickSort {
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];

        int i = low-1;

        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static String quicksort(int[] arr, int p, int q){
        if(p<q){
            int pi = partition(arr,p,q);
            quicksort(arr,p,pi-1);
            quicksort(arr,pi+1,q);
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(quicksort(arr,0,arr.length-1));

    }
}
