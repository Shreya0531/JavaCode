package collections;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        //Declaring Arraylist
        ArrayList<Integer> arr = new ArrayList<>();// Dynamic in size, whenever you add an element it changes its size. if it was an Array[] (int a[]=new int[5]) we will declare a size for it which is static
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(0, 0);// adding element 0 in the 0th index. [0,10,20]

        // to use addAll(list), we have to create one more ArrayList
        arr1.add(30);
        arr.addAll(arr1);// [0,10,20,30]

        //using get(index) we can get a value of particular index
        System.out.println("Value of index 2 is :" + arr.get(2)); //printing index value of 2, ie 20
        System.out.println("Array elements :" + arr);

        //using remove(index) we can remove element from a particular index
        System.out.println("removing element from index 3 :" + arr.remove(3));
        System.out.println("Array elements :" + arr);

        //using remove(datatype.valueOf()) we can remove a particular value. its return type is boolean
        System.out.println("removing  value 20 :" + arr.remove(Integer.valueOf(20)));
        System.out.println("Array elements :" + arr);

        //set(index,value), it updates a particular index value
        System.out.println("updating 10 to 20 :" + arr.set(1, 20));
        System.out.println("Array elements :" + arr);

        System.out.println("size is :" + arr.size());


        System.out.println("split iteratot" + arr.spliterator());

        //contains() checks if a particular value is present in the list or not, if the value is present it returns true else false
        System.out.println(arr.contains(20));
        System.out.println(arr);
        System.out.println(arr.contains(50));
        System.out.println(arr);

        //clear() clears all the elements in the list and returns empty list
        arr.clear();
        System.out.println(arr);
    }
}
/*
    .add(value)
    .add(index,value)
    .addAll(list)
    .get(index)
    .remove(index)



 */