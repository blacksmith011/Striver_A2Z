package Striver_A2Z.Step_1;

import java.util.Scanner;

public class PlalindromeString {
    public static boolean palindromeCheck(String str,int s,int e){
        if(s>=e) return true;
        if(str.charAt(s)!=str.charAt(e)) return false;
        return palindromeCheck(str,s+1,e-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s = 0, e = str.length()-1;
        System.out.println(palindromeCheck(str,s,e));
    }
}
