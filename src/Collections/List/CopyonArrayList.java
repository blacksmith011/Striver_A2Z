package Collections.List;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> ll = new CopyOnWriteArrayList<>();
        // "Copy on Write" means that whenever a write operation like
        // adding or removing an element
        // instead of directly modifying the existing list
        // a new copy of the list is created,and the modification is applied
        // to that copy. This ensures that other threads the reading the list
        // while it's being modified are unaffected.

        // Read Operation :- Fast and direct, since they happen on a stable
        // list without interference from modification.

        // Write Operation :- A new copy of the list is created for every modification
        // the reference to the list is then updated so that subsequent
        // reads use this new list.

        // notepad ---> notepad-copy

        // read more then we use it


        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");

        System.out.println("Initial shopping list: "+shoppingList);

        for(String item: shoppingList){
            System.out.println(item);
            // Try to modify the list while reading
            if(item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("After Butter while reading");
            }
        }

        System.out.println("Updated List :"+shoppingList);

    }
}
