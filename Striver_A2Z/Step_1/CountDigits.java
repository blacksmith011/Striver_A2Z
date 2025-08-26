package Striver_A2Z.Step_1;

import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int num){
        int ans = 0;
        while (num>0){
            ans++;
            num /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(countDigits(num));
    }

}
