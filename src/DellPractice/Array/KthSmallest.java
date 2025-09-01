package DellPractice.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallest {
    public static int findSmallest(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();
        System.out.println(findSmallest(arr,k));
    }
}
