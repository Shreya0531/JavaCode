package arrays;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements :");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
            System.out.println(a[i]);
        }
        int sum=0;
        int avg=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
            avg=sum/a.length;
        }
        System.out.println("Sum of all the elements :"+sum);
        System.out.println("Average of all the elements :"+avg);
    }
}
