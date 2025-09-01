package Striver_A2Z.Step_3.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] arr,int tar){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == tar) return new int[]{i,j};
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int tar = sc.nextInt();
        int[] res = twoSum(arr,tar);
        for(int ele : res){
            System.out.print(ele+" ");
        }

    }
}
