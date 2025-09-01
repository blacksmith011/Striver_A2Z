package Striver_A2Z.Step_7_Lec1;

import java.util.Scanner;

public class pow {
    public static double pow(double a , int n){
        if(n==0) return 1;
        if(n<0) return 1/pow(a,-n);
        return a * pow(a,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();

        System.out.println(String.format("%.4f\n",pow(a,n)));
    }
}
