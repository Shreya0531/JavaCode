package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0;i<num.length;i++)
        {
            num[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(num));
       /* for (int arr: num)
        {
            System.out.println(arr);
        } */

    }
}


