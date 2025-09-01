package DellPractice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void mergeSort(int[] a,int[] b){
        for(int i=b.length-1;i>=0;i--){
            if(a[a.length-1]>b[i]){
                int last = a[a.length-1];
                int j = a.length-2;
                while(j>=0 && a[j]>b[i]){
                    a[j+1] = a[j];
                    j--;
                }
                a[j+1] = b[i];
                b[i] = last;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        mergeSort(a,b);

        for (int ele : a)
            System.out.print(ele + " ");
        System.out.println();
        for (int ele : b)
            System.out.print(ele + " ");
    }
}
