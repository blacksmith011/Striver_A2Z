package Collections.List;

/* List ---> 1.ArrayList
        ---> 2.LinkedList
        ---> 3.Vector
        ---> 4.Stack
        ---> 5.CopyOnWriteArrayList
 */



/*ArrayList (initial capacity(default is 10)) -->increase by 1.5 times
  'Syntex':- 1-- ArrayList<DataType> name = new ArrayList<>();
                                                                            Time Complexity
  'Method':- add(),add(index,value),addAll(collection)                         O(n)
    size(),
    get(index)                                                                 O(1)
    contains(value):- return true or false
    remove(index) :- remove element                                            O(n)
    set(index,value) :-  replace
    name.toArray() :- for creating Array

    Collections.sort(name);

             2-- Arrays.asList(elements); ::- return type 'List'
                                              only replace element
             3-- List<Integer> lst = List.of(element)
                ex-- List<Integer> list = List.of(1,2,3,4,5,6);
                     name.addAll(list);

* */


/* LinkedList  :- The elements are linked using pointers and addresses
                   and each element is known as a node.
              ---> 1.Singly LinkedList
              ---> 2.Doubly LinkedList
              ---> 3.Circuler LinkedList
    LinkedList<Integer> lst = new LinkedList<>();
            Methods :-
            1. lst.add(value);
            2. lst.get(index);  O(n)
            3. lst.addFirst(value);  O(1)
            4. lst.addLast(value);   O(1)
            5. lst.getFirst();
            6. lst.getLast();
            7. lst.removeIf(x -> x%2 == 0);
            8. lst.removeAll();
*/

/* Vector :- one of the legacy classes in java that implement the List
             Interface.
             initail Capacity(10) --> double
        Key Features:-
            1. Dynamic Array
            2. Synchronized(make it thread-safe)
            3. legacy Class
            4. Resizing Mechanism
            5. Random Access

        pass collection:-
        Vector<data type> vec = new Vector<>(collection);

        Methods in Vector:-
        1. add(val) :- Adds elements at the end
        2. add(int index, int val) :- Insert an elements at the specified index.
        3. get(int index) :- Retrieve element at the specified index
        4. set(int index,int val) :- replace the elements at the specified index.
        5. remove(Object o) :- Remove the first occurrence of the specified element
        6. remove(int index):- Removes the element at the specified index
        7. size()
        8. isEmpty()
        9. contains(Object o):- Checks if the vector contains the specified element.
        10. clear():- Removes all elements from the vector.

 */

/* Stack :-  Last In First Out (LIFO))
    Stack<Integer> st = new Stack<>();

    Stack-Specific Methods :-
        1. st.push(val)
        2. st.pop()
        3. st.peek()
        4. st.isEmpty()
        5. st.search(Object o)
    Inherited Methods from Vector :-
        1. st.add(E e) :- Adds an element to the end of the stack.
        2. st.add(int index,E ele) :- Inserts an element at a specific index.
        3. st.equals(Object o) :- Compares the Stack with another object for equality


 */

/* CopyOnWriteArrayList :-

 */
