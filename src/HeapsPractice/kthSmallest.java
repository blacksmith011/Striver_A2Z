package HeapsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallest {
    public static int kth(int[] arr, int n){
//        using minHeap
        /*PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int ele : arr){
            minHeap.add(ele);
        }

        for(int i=0;i<n-1;i++){
            minHeap.remove();
        }
        return minHeap.peek();*/

//        using maxHeap
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : arr){
            maxheap.add(i);

            if(maxheap.size() > n) maxheap.remove();
        }
        return maxheap.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = sc.nextInt();
        System.out.println(kth(arr,n));
    }
}
