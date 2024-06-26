package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class foreach {
    public static void main(String[] args) {
        //Declaring Arraylist
        ArrayList<Integer> arr = new ArrayList<>();// Dynamic in size, whenever you add a element it changes its size. if it was an Array[] (int a[]=new int[5]) we will declare a size for it which is static
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(0, 10);// adding element 0 in the 0th index

       /* for (Integer list : arr) {
            System.out.println(list);
        } */
        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
