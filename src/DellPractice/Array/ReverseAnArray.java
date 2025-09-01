package DellPractice.Array;

import java.util.Arrays;
import java.util.Scanner;

import static Sorting.BubbleSort.swap;

public class ReverseAnArray {
    public static String reverse(int[] arr){
        int lo = 0,hi = arr.length-1;
        while (lo<hi){
            swap(arr,lo,hi);
            lo++;hi--;
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(reverse(arr));
    }
}
