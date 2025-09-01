package Striver_A2Z.Step_2_Sorting;

import java.util.Arrays;
import java.util.Scanner;

import static Sorting.BubbleSort.swap;

public class Selection_Sort {
    public static String selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min] > arr[j]) min = j;
            }
            swap(arr,i,min);
        }

        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(selectionSort(arr));
    }
}
