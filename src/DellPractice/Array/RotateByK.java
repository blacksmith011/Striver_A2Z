package DellPractice.Array;

import java.util.Arrays;
import java.util.Scanner;

import static Sorting.BubbleSort.swap;


public class RotateByK {
    public static void rotate(int[] arr , int i,int j){
        while (i<j){
            swap(arr,i,j);
            i++;j--;
        }
    }
    public static String rotateArr(int[] arr,int k){
        int pos = arr.length - k-1;

        rotate(arr,0,pos);
        rotate(arr,pos+1,arr.length-1);
        rotate(arr,0,arr.length-1);

        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();

        System.out.println(rotateArr(arr,k));
    }
}
