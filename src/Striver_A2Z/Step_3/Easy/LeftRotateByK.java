package Striver_A2Z.Step_3.Easy;

import java.util.Arrays;
import java.util.Scanner;


public class LeftRotateByK {
    public static String rotateByK(int[] arr,int k){
        for(int i=0;i<Math.abs(k-arr.length);i++){
            int fir = arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = fir;
        }

        return Arrays.toString(arr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();

        System.out.println(rotateByK(arr,k));
    }
}
