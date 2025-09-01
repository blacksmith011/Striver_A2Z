package Striver_A2Z.Step_1;

import java.util.Scanner;

public class FibonacciNum {
    public static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}
