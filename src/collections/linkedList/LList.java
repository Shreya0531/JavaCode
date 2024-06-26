package collections.linkedList;

import java.util.*;

public class LList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        //program to append the specified element to the end of a linked list.
        names.add("Bhoomika");
        names.add("Sandhya");
        names.add("Anagha");
        names.add("Divya");
        names.add("Zara");
        System.out.println(names);

        System.out.println();

        //program to iterate through all elements in a linked list.
        for (String name:names) {
            System.out.println(name);
        }

        System.out.println();

        //program to iterate through all elements in a linked list starting at the specified position.
        Iterator<String> iterate = names.listIterator(2);
        while (iterate.hasNext())
        {
            System.out.println(iterate.next());
        }

        System.out.println();

        //program to iterate a linked list in reverse order.
        Iterator it = names.descendingIterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println();
        //Java program to insert the specified element at the specified position in the linked list.
        names.add(0,"Christina");
        System.out.println(names);

        System.out.println();
        //program to insert elements into the linked list at the first and last position.
        names.addFirst("Yamini");
        names.addLast("Damini");
        System.out.println(names);

        System.out.println();
        //program to insert the specified element at the front of a linked list.
        System.out.println(names.offerFirst("Shreya"));
        System.out.println(names);

        System.out.println();
        //program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println(names.peekFirst());
        System.out.println(names.peekLast());
        /*
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        */

        System.out.println();
        //program to display the elements and their positions in a linked list.
        for (int i = 0; i <names.size() ; i++) {
            System.out.println("In position "+i+ " element " +names.get(i)+ " is present.");
        }

        System.out.println();
        //program of swap two elements in a linked list.
        Collections.swap(names,0,7);
        System.out.println(names);

        System.out.println();
        // program to shuffle the elements in a linked list.
        Collections.shuffle(names);
        System.out.println(names);

        System.out.println();
        //program to clone linked list to another linked list.
        LinkedList<String> names1 = (LinkedList<String>)names.clone();
        System.out.println(names1);

        if(names.contains("Shreya"))
        {
            System.out.println("Exist");
        }
        else {
            System.out.println("not exist");
        }

        //program to convert a linked list to array list.
        List<String> convertingLinkedListToArray = new ArrayList<>(names1);
        System.out.println("Original linked list : "+names1);
        for (String arrayList: names1) {
            System.out.println(arrayList);
        }

        System.out.println();
        //program to compare two linked lists.
        names.pop();
        System.out.println(
                names
        );


       
    }

}
