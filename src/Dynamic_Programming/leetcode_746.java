package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

// Min Cost Climbing Stairs

//Recursion + Memonization
public class leetcode_746 {
    //Recursion + Memonization
    /*public static int minCost(int[] arr,int i){
        if(i==0) return arr[0];
        if(i==1) return arr[1];
        int[] dp = new int[i+1];
        if(dp[i]!=0) return dp[i];
        int ans = arr[i] + Math.min(minCost(arr,i-1),minCost(arr,i-2));
        dp[i] = ans;
        return ans;

    }*/

//    Tabulation
    static int[] dp;
    public static int minCost(int[] arr){
        int n = arr.length;
        dp = new int[n];
        dp[0] = arr[0]; dp[1] = arr[1];
        for(int i=2;i<n;i++){
            dp[i] = arr[i] + Math.min(dp[n-2],dp[n-1]);
        }
        return Math.min(dp[n-2],dp[n-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        System.out.println(Math.min(minCost(arr,arr.length-1),minCost(arr,arr.length-2)));
        System.out.println(Math.min(minCost(arr),minCost(arr)));
    }
}
