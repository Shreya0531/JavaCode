package geeksforgeeks.school.arrays;

public class SumOfArray {
    static int sum(int arr[], int n) {
        int sum = 0;

        for(int i = 0; i < n;i++)
        {
            int number = arr[i];
            sum = sum + number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr, arr.length));
    }
}
