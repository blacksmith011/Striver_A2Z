package DellPractice.Array;

import java.util.Arrays;
import java.util.Scanner;

import static Sorting.BubbleSort.swap;

public class DuplicateNumber {
    public static int findDuplicate(int[] arr){
        int n = arr.length;
        while (true){
            int ele = arr[0];
            if(arr[ele] == ele) return ele;
            swap(arr,0,ele);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(findDuplicate(arr));
    }
}
