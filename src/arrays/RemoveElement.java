package arrays;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int delete;
        int index=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int newArray[]=new int[size-1];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the index of element to be deleted : ");
        index=sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(i<index){
                newArray[i]=array[i];
            } else if (i==index) {
                continue;
            }
            else {
                newArray[i-1]=array[i];
            }
        }
        for (int i = 0; i < size-1; i++) {
            System.out.println(newArray[i]);
        }
    }
}
