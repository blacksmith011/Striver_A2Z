package HeapsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class leetcode1046 {
    public static int lastStoneWeight(int[] arr){
        if(arr.length <= 1) return arr[0];
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : arr){
            maxheap.add(num);
        }

        while (maxheap.size()>1){
            int num1 = maxheap.poll();
            int num2 = maxheap.poll();

            maxheap.add(num1-num2);
        }
        if(maxheap.isEmpty()) return 0;
        return maxheap.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(lastStoneWeight(arr));
    }
}
