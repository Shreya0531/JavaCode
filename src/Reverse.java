public class Reverse {
    public static void main(String[] args) {
        int n = 121;
        int rem =0;
        int rev=0;
        for (int i = 0; i<=2 ; i++) {
            rem=n%10;
            rem=rem+rev;
            n=n/10;
        }
        System.out.println(rem);
    }
}
