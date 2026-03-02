
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(11);
        list.add(1); // Enter value
        list.add(2);
        list.add(9);
        list.add(4);

        // list.get(3); // Enter index value                                        
        // list.size();
        // list.remove(2); // Enter index value
        // list.add(2, 10); // To insert element in the middle first index then value
        // list.set(2,50); // To replace the element at the index

        // // list.trimToSize(); // This method is used to shrink the array capacity if there is no data avilable

        // // String[] list2 = Arrays.asList("Monday", "Tuesday"); // Used to add completly a list in a single shot
        // List<Integer> list1 = List.of(4,5,6,7,8); // to add a bunch of numebr at a time 

        // list.addAll(list1); // to add a complete collection

        // System.out.println(list);

        // for(int i = 0; i < list.size(); i++){

        //     System.out.println(list.get(i));
        // }
        
        // for(int x : list){
        //     System.out.println(x);
        // }
        
        // System.out.println(list.contains(4));


        Object[] arr = list.toArray();
        
        Collections.sort(list); // list.sort();
        
        System.out.println(list);

    }    
}
