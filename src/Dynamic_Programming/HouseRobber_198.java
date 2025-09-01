package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber_198 {
    public static int rob(int[] nums,int i){
        if(nums.length<=i) return 0;
        int take = nums[i] + rob(nums,i+2);
        int skip = rob(nums,i+1);
        return Math.max(take,skip);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(rob(arr,0));
    }
}
