package DellPractice.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfArray {
    public static String intersection(int[] a,int[] b){
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int ele : a){
            s1.add(ele);
        }
        for(int ele : b){
            if(!s1.contains(ele)) s2.add(ele);
        }

        int[] ans = new int[s2.size()];
        int i=0;
        for(int num : s2){
            ans[i++] = num;
        }
        return Arrays.toString(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(intersection(a,b));
    }
}
