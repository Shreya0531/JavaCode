package patternsPrograms;

public class NumberPatterns {
    static int n = 4;

    public static void main(String[] args) {
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
        pattern4();

    }

    public static void pattern1() {
        for (int i = 1; i <=n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void pattern2() {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern3()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void pattern4()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
