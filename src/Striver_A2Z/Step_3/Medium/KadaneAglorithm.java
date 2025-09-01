package Striver_A2Z.Step_3.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class KadaneAglorithm {
    public static int maxSubArray(int[] arr){
        int n = arr.length , maxSum = arr[0],sum = arr[0];
        for(int i=1;i<n;i++){
            sum = Math.max(arr[i],sum+arr[i]);
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(maxSubArray(arr));
    }
}
