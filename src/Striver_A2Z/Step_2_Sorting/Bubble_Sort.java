package Striver_A2Z.Step_2_Sorting;

import java.util.Arrays;
import java.util.Scanner;

import static Sorting.BubbleSort.swap;

public class Bubble_Sort {
    public static String bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            int didSwap = 0;
            for(int j=1;j<=i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                    didSwap = 1;
                }
            }
            if(didSwap == 0) break;
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(bubbleSort(arr));
    }
}
