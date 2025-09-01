package Striver_A2Z.Step_3.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class BestTimeToBuySell {
    public static int stockBuySell(int[] arr){
        int buy = arr[0];
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(buy>arr[i]){
                buy = arr[i];
            }
            profit = Math.max(profit,arr[i]-buy);
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(stockBuySell(arr));
    }
}
