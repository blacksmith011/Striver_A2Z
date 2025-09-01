package leetcode.queue;

import java.util.*;

public class timeNeededtobuyTicket_2073 {
    public static int timeRequired(int[] arr,int k){
        Queue<Integer> que = new LinkedList<>();

        for(int i=0;i<arr.length;i++){
            que.add(i);
        }
        int res = 0;
        while(!que.isEmpty()){
            int idx = que.poll();
            if(arr[idx]>0){
                res++;
                arr[idx]--;

                if(idx == k && arr[idx]==0) return res;
            }
            que.add(idx);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();

        int ans = timeRequired(arr,k);
        System.out.println(ans);
    }
}
