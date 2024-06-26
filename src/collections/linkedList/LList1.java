package collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LList1 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> names = new LinkedList();

        names.add("Bhoomika");
        names.add("Sandhya");
        names.add("Anagha");
        names.add("Divya");
        names.add("Zara");
        System.out.println(names);

        System.out.println();

        Iterator it = names.descendingIterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}

