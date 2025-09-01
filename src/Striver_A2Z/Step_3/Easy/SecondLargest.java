package Striver_A2Z.Step_3.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static int secLar(int[] arr){
        int n1 = Integer.MIN_VALUE;
        int n2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(n1<arr[i]){
                n2 = n1;
                n1 = arr[i];
            }
            else if(n2<arr[i] && arr[i]<n1){
                n2 = arr[i];
            }
        }
        return n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(secLar(arr));
    }
}
