package Dynamic_Programming;

import java.util.Scanner;

// Tabulation = Bottom-up or iterative DP
public class FibonacciNumber_Tabulation {
    public static int fib(int n,int[] dp){
        if(n<=1) return n;
        dp[0] = 0; dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] dp = new int[num+1];
        System.out.println(fib(num,dp));
    }
}
