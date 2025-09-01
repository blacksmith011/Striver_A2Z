package HashMap;

import java.util.*;
import java.util.stream.Collectors;

public class question {
    public int[][] merge(int[][] intervals) {
        List<int[]> lst = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for(int[] intv : intervals){
            if(lst.isEmpty() || lst.get(lst.size()-1)[1]<intv[0]){
                lst.add(intv);
            } else {
                lst.get(lst.size()-1)[1] = Math.max(lst.get(lst.size()-1)[1] , intv[1]);
            }
        }
        List<Integer> list = Arrays.asList(8,6,9,7,5,9,4,2,10,15,6,21,3,54,45);

        List<Integer> even = list.stream().filter(num -> num%2 == 0).collect(Collectors.toList());

        return lst.toArray(new int[lst.size()][]);

    }
}
