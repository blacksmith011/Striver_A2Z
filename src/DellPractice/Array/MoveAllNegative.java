package DellPractice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllNegative {
    public static String rearrange(int[] arr){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(rearrange(arr));
    }
}
