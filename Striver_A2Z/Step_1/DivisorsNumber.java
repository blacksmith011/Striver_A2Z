package Striver_A2Z.Step_1;

import Tree.leetcode.InorderTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DivisorsNumber {
    public static String divisors(int n){
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0) lst.add(i);
        }
        return Arrays.toString(lst.toArray());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(divisors(num));
    }
}
