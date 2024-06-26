package arrays;

import java.util.Scanner;

public class Array1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int size = sc.nextInt();
        System.out.println("Enter the elements");
        int n[] = new int[size];
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println("Enter the value to be searched");
        int x = sc.nextInt();
        for(int i=0;i<n.length;i++){
            if (n[i]==x) {
                System.out.println("index of x is " + i);
            }
        }

    }

}


