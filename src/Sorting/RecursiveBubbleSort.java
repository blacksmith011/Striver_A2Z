package Sorting;

import java.util.Arrays;
import java.util.Scanner;

import static Sorting.BubbleSort.swap;

public class RecursiveBubbleSort {
    public static void bubbleSort(int[] arr,int n){
        if(n ==1 ) return;
        for(int j=0;j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
            }
        }
        bubbleSort(arr,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        bubbleSort(arr,arr.length);

        for(int ele : arr){
            System.out.print(ele+"->");
        }
    }
}
