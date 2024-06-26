package arrays;

public class A3 {
    public static void main(String[] args) {

        int a[][][] =
                {
                    {
                        {1,2},{3,4,5},{1,1,1}
                    },
                    {
                        {6,7},{8,9,10}
                    },
                    {
                            {2,2,2},{3,3,3,3},{4,4}
                    }
                };
        /*a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;*/

        //different ways to print
        //1.
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                for (int k=0;k<a[i][j].length;k++)
                {
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }





    }
}
