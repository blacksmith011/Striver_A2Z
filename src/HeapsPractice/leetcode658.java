package HeapsPractice;

import java.util.*;

class triplet{
    int idx;
    int dis;
    int val;

    triplet(int idx,int dis,int val){
        this.idx = idx;
        this.dis = dis;
        this.val = val;
    }
}
public class leetcode658 {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<triplet> minheap = new PriorityQueue<>((a,b) -> a.dis == b.dis ? Integer.compare(a.val,b.val) : Integer.compare(a.dis,b.dis));
        for(int i=0;i<arr.length ; i++){
            int dis = x-arr[i];
            if(dis<0) dis *= -1;
            minheap.add(new triplet(i,dis,arr[i]));
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(minheap.poll().val);
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(findClosestElements(arr,k,x));
    }
}
