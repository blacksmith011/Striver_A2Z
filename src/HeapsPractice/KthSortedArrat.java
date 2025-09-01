package HeapsPractice;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// sort a 'k' sorted array(sort a nearly sorted array)
public class KthSortedArrat {
    static boolean sorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    static String isKSortedArray(int arr[], int n, int k) {
        // code here
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int i = 0;
        for(int num : arr){
            minheap.add(num);
            if(minheap.size()>k){
                arr[i++] = minheap.peek();
                minheap.remove();
            }
        }
        while (!minheap.isEmpty()){
            arr[i++] = minheap.peek();
            minheap.remove();
        }

        return sorted(arr) ? "Yes" : "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();
        System.out.println(isKSortedArray(arr,arr.length,k));
    }
}
