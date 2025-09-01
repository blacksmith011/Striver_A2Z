package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Sum_01 {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int tar = sc.nextInt();

        System.out.println(twoSum(arr,tar));
    }
}
