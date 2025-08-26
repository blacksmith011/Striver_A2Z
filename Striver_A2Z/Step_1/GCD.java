package Striver_A2Z.Step_1;

import java.util.Scanner;

public class GCD {
    public static int gcd(int n1,int n2){
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        if(n1 == 0 || n2 == 0) return 0;

        for(int i = Math.min(n1,n2) ; i>0 ;i--){
            if(n1%i == 0 && n2%i == 0) return i;
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(gcd(n1,n2));
    }
}
