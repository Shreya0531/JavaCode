package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        Integer[] array={90,40,50,30};// we have defined Interger because the reverseOrder() method does not work for primitive datatype.
        Arrays.sort(array);
        System.out.println("sorted array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Arrays.sort(array, Collections.reverseOrder());
    }
}
