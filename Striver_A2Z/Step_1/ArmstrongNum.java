package Striver_A2Z.Step_1;

import java.util.Scanner;

public class ArmstrongNum {
    public static int noDigits(int num){
        if (num == 0) return 1;
        if(num<10) return 1;
        return 1 + noDigits(num/10);
    }
    public static boolean isArmstrong(int n){
        int isnum = Math.abs(n) , realnum = 0 , digit = noDigits(isnum);

        while (isnum>0){
            int temp = isnum%10;
            int pow = 1;
            for (int i = 0; i < digit; i++) {
                pow *= temp;
            }
            realnum += pow;
            isnum /= 10;
        }
        return realnum == n ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isArmstrong(n));
    }
}
