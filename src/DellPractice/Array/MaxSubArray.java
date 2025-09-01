package DellPractice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArray {
    public static int subarray(int[] arr){
        int res = arr[0];
        for(int i=0;i<arr.length;i++){
            int currsum = 0;
            for(int j=i;j<arr.length;j++){
                currsum += arr[j];
                res = Math.max(res,currsum);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(subarray(arr));
    }
}
