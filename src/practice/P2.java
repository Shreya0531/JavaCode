package practice;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be divided");
        int a = sc.nextInt();
        System.out.println("Enter thr number to be divided with");
        int b = sc.nextInt();
        int c = a/b;
        System.out.println("Result\n" + c);
    }
}
