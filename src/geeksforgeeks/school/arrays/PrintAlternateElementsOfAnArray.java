package geeksforgeeks.school.arrays;

public class PrintAlternateElementsOfAnArray {
    public static void print(int arr[], int n)
    {
       for(int i=0;i<arr.length;i++){
           if(i % 2 ==0){
               System.out.println(arr[i]);
           }
       }
    }

    public static void main(String[] args) {
        int[] ele = {10, 20, 30, 40, 50};
        int n = 5;
        print(ele,n);

    }
}
