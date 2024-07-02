package geeksforgeeks.school.arrays;

public class PrintElementsOfArray {
    static void printArray(int arr[], int n) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        printArray(arr, arr.length);
    }
}
