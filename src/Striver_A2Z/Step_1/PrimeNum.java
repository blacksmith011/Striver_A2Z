package Striver_A2Z.Step_1;

import java.util.Scanner;

public class PrimeNum {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2 || n == 3) return true;
        for(int i=2;i<n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }
}
