package geeksforgeeks.school.arrays;

public class PalindromicArray {
    public static int palinArray(int[] a, int n)
    {
        for (int i = 0; i < n; i++){
            int number = a[i];
            int rev = 0;
            while (number > 0){
                int ele = number % 10;
                rev = rev * 10 + ele;
                number = number / 10;
            }
            if(rev != a[i]){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a = {111, 222, 333, 444};
        int[] b = {123, 111, 234, 222, 123};

        System.out.println(palinArray(a,a.length));
        System.out.println(palinArray(b,b.length));
    }
}
