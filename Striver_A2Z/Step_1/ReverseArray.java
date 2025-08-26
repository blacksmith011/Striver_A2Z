package Striver_A2Z.Step_1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static int[] reverse(int[] arr,int i,int j){
        if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            reverse(arr,i+1,j-1);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int start = 0,end = arr.length-1;
        int[] ans = reverse(arr,start,end);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
