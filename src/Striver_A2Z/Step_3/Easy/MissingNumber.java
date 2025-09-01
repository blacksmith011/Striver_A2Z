package Striver_A2Z.Step_3.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static int missingNUm(int[] arr){
        int oriSum = 0 , sum = 0;
        for(int i=1;i<=arr.length;i++){
            oriSum += i;
        }
        for(int i : arr){
            sum += i;
        }
        return Math.abs(oriSum-sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(missingNUm(arr));
    }
}
