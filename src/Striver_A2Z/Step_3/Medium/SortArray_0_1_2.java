package Striver_A2Z.Step_3.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray_0_1_2 {
    public static String sort(int[] arr){
        int zero = 0, one = 0,two = 0;

        for(int ele : arr){
            if(ele == 0) zero++;
            else if(ele == 1) one++;
            else two++;
        }
        int i=0;
        for(int j=0;j<zero;j++){
            arr[i++] = 0;
        }
        for(int j=0;j<one;j++){
            arr[i++] = 1;
        }
        for(int j=0;j<two;j++){
            arr[i++] = 2;
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(sort(arr));
    }
}
