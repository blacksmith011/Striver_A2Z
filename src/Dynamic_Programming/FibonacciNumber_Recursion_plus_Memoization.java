package Dynamic_Programming;

import java.util.Scanner;

// Recursion + memoization = top-dowm DP or Recursive DP
public class FibonacciNumber_Recursion_plus_Memoization {

    static int[] dp;
    public static int printFibo(int num,int[] arr){
        if(num<=1) return num;
        if(dp[num]!=0) return dp[num];
        int ans = printFibo(num-1,arr)+printFibo(num-2,arr);
        dp[num] = ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        dp = new int[num+1];
        System.out.println(printFibo(num,dp));
    }
}
