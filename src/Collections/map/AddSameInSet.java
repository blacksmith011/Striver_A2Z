package Collections.map;

import java.util.HashSet;

public class AddSameInSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Raghav");
        set.add("Raghav");
        set.add("Raghav");
        set.add("Raghav");
        set.add("Raghav");
        set.add("Raghav");

        set.remove("Raghav");
        System.out.println(set+" "+set.size());
    }

    public static int reverse(int num){
        int ans = 0;
        while (num!=0){
            int temp = num%10;
            ans = ans*10+temp;
            num /= 10;
        }
        return ans;
    }
    public static int countDistinctInteger(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
}
