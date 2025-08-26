package Striver_A2Z.Step_1;

import java.util.Scanner;

public class PalindromeNum {
    /*public static boolean isPalindrome(int n){
        int num = n , a = 0;
        while (num>0){
            int temp = num%10;
            a = a*10 +temp;
            num /= 10;
        }
        if(a == n) return true;
        return false;
    }*/

    public static boolean isPalindrome(int n){
        return n == reverse(n,0);
    }
    public static int reverse(int n,int rev){
        if(n == 0) return rev;
        return reverse(n/10, rev*10+n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }
}
