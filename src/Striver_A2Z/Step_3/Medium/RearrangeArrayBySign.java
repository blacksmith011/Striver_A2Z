package Striver_A2Z.Step_3.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayBySign {
    public static String rearrangeArray(int[] arr){
        /*ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int ele : arr){
            if(ele > 0 ) pos.add(ele);
            else neg.add(ele);
        }
        int len = arr.length,p=0,n=0;
        for (int i=0;i<len;i++){
            if(i%2==0) arr[i] = pos.get(p++);
            else arr[i] = neg.get(n++);
        }*/

        int[] res = new int[arr.length];
        int pos = 0,neg = 0;
        for(int ele : arr){
            if(ele > 0){
                res[pos] = ele;
                pos += 2;
            } else {
                res[neg] = ele;
                neg += 2;
            }
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(rearrangeArray(arr));
    }
}
