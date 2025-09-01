package Collections.map;

/* MAP (SEPARATE INTERFACE)
       --> is an object that maps keys to values.
       --> it can't contains duplicate keys and each key can map to at most
           one value.

       key charateristics
            1. key-value pair
            2. Unique keys
            3. one value per key
            4. order(Some implementation maintains insertion order
            (LinkedHashMap),natural order(TreeMap),or no order(HashMap).

 */

/* HashMap :-
        key Characteristics:-
            1. Unordered
            2. Allows null keys and values
            3. not Synchronized
            4. preformance O(1)

        HashMap<Key,value> name = new HashMap<>();

        Methods :-
       --> 1. name.put(k,V)
       --> 2. name.get(K)  (null if no mapping exists)
       --> 3. name.remove(k)
       --> 4. name.containsKey(k) (return true or false)
       --> 5. name.size()
       --> 6. name.isEmpty()  (return true or false)
       --> 7. name.clear()

       --> 8. name.keySet() (Returns a Set view of the keys contained in the map.)
                Set<Integer> keys = map.keySet();

       --> 9. name.values() (Returns a Collection view of the values contained in the map.)
                Collection<String> values = map.values();

       -->10. name.entrySet() (Returns a Set view of the key-value pairs (entries) in the map.)
                Set<Map.Entry<Integer, String>> entries = map.entrySet();

       -->11. name.putIfAbsent(k,V)
       -->12. name.replace(k,V)
       -->13. name.replace(k,oldValue,newValue)
       -->14. name.forEach((key,value) -> System.out.println(key+"->"+value))


 */

/* HashSet :-

*/
