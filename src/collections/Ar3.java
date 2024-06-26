package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ar3 {
    public static void main(String[] args) {
        List <String>names = new ArrayList();
        names.add("Shreya");
        names.add("Krishna");
        names.add("Akash");

        Iterator<String> itr = names.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
