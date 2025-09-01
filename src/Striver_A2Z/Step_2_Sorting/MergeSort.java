package Striver_A2Z.Step_2_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr,int left,int mid,int right){
        int n1 = mid-left+1 , n2 = right-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i] = arr[left+i];
        }
        for(int j=0;j<n2;j++){
            R[j] = arr[mid+1+j];
        }
        int i=0,j=0,k=left;

        while (i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i++];
            } else {
                arr[k] = R[j++];
            }
            k++;
        }
        while (i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = R[j];
            j++;k++;
        }
    }

    public static String mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid = left + (right-left)/2;
            mergeSort(arr,0,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(mergeSort(arr,0,arr.length-1));
    }
}
