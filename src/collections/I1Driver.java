package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class I1Driver {
    public static void main(String[] args) {
        ArrayList<I1> list= new ArrayList<>();
        list.add(new I1("Shreya",new int[]{90,98},25));
        list.add(new I1("Sudha",new int[]{87,76},32));

        Iterator<I1> itr= list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
