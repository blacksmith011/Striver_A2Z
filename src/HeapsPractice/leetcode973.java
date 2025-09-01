package HeapsPractice;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair{
    int[] arr;
    double value;

    Pair(int[] arr,double value){
        this.arr = arr;
        this.value = value;
    }
}
public class leetcode973 {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> minheap = new PriorityQueue<Pair>(Comparator.comparing(p->p.value));
        for(int i=0;i<points.length;i++){
            double val = Math.sqrt(Math.pow(points[i][0],2)+Math.pow(points[i][1],2));
            minheap.add(new Pair(points[i],val));
        }
        int[][] res = new int[k][2];
        for (int i=0;i<k;i++){
            res[i] = minheap.poll().arr;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int n = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] res = kClosest(arr,n);
    }
}
