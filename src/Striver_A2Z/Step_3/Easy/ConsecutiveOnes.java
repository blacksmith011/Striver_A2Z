package Striver_A2Z.Step_3.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveOnes {
    public static int consecutiveOne(int[] arr){
        int one = 0,ans = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1) one++;
            else if(arr[i]==0){
                ans = Math.max(ans,one);
                one = 0;
            }
        }
        ans = Math.max(one,ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(consecutiveOne(arr));
    }
}
