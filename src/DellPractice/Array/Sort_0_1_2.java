package DellPractice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_0_1_2 {
    public static String Sort(int[] arr){
        int c0=0,c1=0,c2=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0) c0++;
            else if(arr[i] == 1) c1++;
            else if(arr[i] == 2) c2++;
        }
        int idx = 0;
        for(int i=0;i<c0;i++){
            arr[idx++] = 0;
        }
        for(int i=0;i<c1;i++){
            arr[idx++] = 1;
        }
        for(int i=0;i<c2;i++){
            arr[idx++] = 2;
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(Sort(arr));
    }
}
