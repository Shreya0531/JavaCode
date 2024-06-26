package geeksforgeeks.easy;

import java.util.Scanner;

public class Armstrong {

    static String armstrongNumber(int n) {

        int count = 0;
        int temp = n;
        int temp1 =n;
        int sum = 0;

        //To find length of n
        while (temp1 > 0) {
            temp1 = temp1 / 10;
            count++;
        }

        //To find if n is Armstrong number 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        while(temp > 0){
            int element = temp % 10;
            int prod =1;
            for(int i=1;i<=count;i++){
                prod = prod * element;
            }
            sum = sum + prod;
            temp = temp/10;
        }
        if (sum == n){
            return "true";
        }
        else {
            return "false";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(armstrongNumber(n));
    }
}
