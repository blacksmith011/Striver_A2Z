package Striver_A2Z.Step_3.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnionTwoSortedArray {
    public static String union(int[] arr1,int[] arr2){
        ArrayList<Integer> lst = new ArrayList<>();
        int i=0,j=0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(lst.isEmpty() || lst.get(lst.size()-1) != arr1[i]){
                    lst.add(arr1[i]);
                }
                i++;
            }else if(arr1[i]>arr2[j]){
                if(lst.isEmpty() || lst.get(lst.size()-1) != arr2[j]){
                    lst.add(arr2[j]);
                }
                j++;
            }else{
                if(lst.isEmpty() || lst.get(lst.size() -1)!=arr1[i]){
                    lst.add(arr1[i]);
                }
                i++;j++;
            }
        }
        while (i < arr1.length) {
            if (lst.isEmpty() || lst.get(lst.size() - 1) != arr1[i]) {
                lst.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (lst.isEmpty() || lst.get(lst.size() - 1) != arr2[j]) {
                lst.add(arr2[j]);
            }
            j++;
        }
        return Arrays.toString(lst.toArray());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(union(arr1,arr2));
    }
}
