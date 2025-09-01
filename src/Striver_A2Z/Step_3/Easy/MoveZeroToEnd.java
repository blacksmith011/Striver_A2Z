package Striver_A2Z.Step_3.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroToEnd {
    public static String zeroToEnd(int[] arr){
        int zero = 0;
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0) zero++;
            else {
                arr[j++] = arr[i];
            }
        }
        for(int i=j;i<arr.length;i++){
            arr[i] = 0;
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(zeroToEnd(arr));

    }
}
