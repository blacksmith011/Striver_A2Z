package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1,String o2){
        return o1.length()-o2.length();
    }

}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1,Integer o2){
        return o2-o1;
    }
}

public class ComparatorType {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        for(int i=5;i>0;i--){
            lst.add(i);
        }

        /*lst.sort(null);
        System.out.println(lst);


        lst.sort(new MyComparator());
        System.out.println(lst);*/

        // Lambda
        /*lst.sort((a,b) -> a-b);
        System.out.println(lst);*/


        List<String> words = Arrays.asList("banana","apple","date");

        /*words.sort(null);
        System.out.println(words);

        words.sort(new StringLengthComparator());
        System.out.println(words);*/

        // Lambda
        words.sort((a,b) -> a.length()-b.length());
        System.out.println(words);
    }
}
