package geeksforgeeks.school;

public class Palindrome {
    public static void main(String[] args) {
    is_palindrome(555);
    }
    public static void is_palindrome(int n)
    {
        int sum=0;
        //int temp = n;
        int rev;

        //To find length of n
        while (n > 0)
        {
            rev = n%10;
            sum=(sum*10)+rev;
        }
        if(n==sum){
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("NP");
        }

    }

}
