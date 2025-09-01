package DellPractice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {
    public static String maxAndMin(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<min) min = arr[i];
            if(arr[i]>max) max = arr[i];
        }

        return Arrays.toString(new int[]{min,max});
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(maxAndMin(arr));
    }
}
