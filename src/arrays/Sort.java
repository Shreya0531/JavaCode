package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] a= new int[size];
        System.out.println("Enter the array elements");
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            //a[i]= sc.nextInt();
            System.out.println("Elements before sorting");
            System.out.println(a[i]);
        }
        //System.out.println("Elements after sorting");


    }
}
