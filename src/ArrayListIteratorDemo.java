import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> alphabets = new ArrayList<>(5);
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");

        Iterator<String> itr = alphabets.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println("--------");
        Iterator<String> newItr = alphabets.iterator();
        newItr.forEachRemaining(alphabet-> System.out.println(alphabets));
    }
}
