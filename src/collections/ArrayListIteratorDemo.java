package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> alphabets = new ArrayList();
        alphabets.add("B");
        alphabets.add("A");
        alphabets.add("D");
        alphabets.add("C");

        System.out.println(alphabets);
        Collections.sort(alphabets);
        System.out.println(alphabets);

        Collections.sort(alphabets,Collections.reverseOrder());
        System.out.println(alphabets);

      /*  for (int i = 0; i < alphabets.size(); i++) {
            System.out.println(alphabets.get(i));
        }

        for (String alphabet : alphabets) {
            System.out.println(alphabet);
        } */

        Iterator<String> itr = alphabets.iterator();
        while (itr.hasNext()) {
            String next = itr.next();
            if (next.equals("D")) {
                itr.remove();
            }
        }
        System.out.println(alphabets);
    }
}
