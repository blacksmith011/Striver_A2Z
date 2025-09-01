package HeapsPractice;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumCostofropes_GFG {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int num : arr){
            minheap.add(num);
        }
        int totalcost = 0;
        while (minheap.size()>1){
            int num1 = minheap.poll();
            int num2 = minheap.poll();
            int cost = num1+num2;
            totalcost += cost;
            minheap.add(cost);
        }
        return totalcost;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(minCost(arr));
    }
}
