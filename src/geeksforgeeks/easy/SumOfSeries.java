package geeksforgeeks.easy;

public class SumOfSeries {
    public static  long seriesSum(int n) {
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum = sum + n;
            seriesSum(n-1);
        }
        return sum;

        /* for(int i=1;i<=n;++i)
        {
            sum=sum+i;
        }
        return sum; */
    }

    public static void main(String[] args) {

        System.out.println(seriesSum(5));
    }
}
