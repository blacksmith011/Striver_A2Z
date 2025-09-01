package Striver_A2Z.Step_1;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNum(int n){
        int ans = 0;
        boolean flag = n < 0;
        n = Math.abs(n);
        while (n>0){
            int tem = n % 10;
            ans = ans*10 + tem;
            n /= 10;
        }
        return flag ? -ans : ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(reverseNum(n));
    }
}
