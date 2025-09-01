package DellPractice.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallestLexicographical {

    public static int findKthNum(int n,int k){
        PriorityQueue<String> pq = new PriorityQueue<>();
        for(int i=1;i<=n;i++){
            pq.offer(String.valueOf(i));
        }
        for(int i=1;i<k;i++){
            pq.poll();
        }
        return Integer.parseInt(pq.poll());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        findKthNum(n,k);
        System.out.println(findKthNum(n,k));
    }
}
