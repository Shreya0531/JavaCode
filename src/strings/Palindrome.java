package strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s1 = sc.next();
        String rev = "";
        for(int i=s1.length()-1;i>=0;i--)
        {
            rev = rev + s1.charAt(i);
        }
        System.out.println(rev);
        if(s1.equals(rev))
        {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
