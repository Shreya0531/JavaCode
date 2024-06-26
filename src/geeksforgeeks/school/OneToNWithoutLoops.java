package geeksforgeeks.school;

public class OneToNWithoutLoops {
    int i=1;
    public void printNos(int N)
    {

        if(i<=N)
        {
            System.out.print(i + " ");
            i++;
            printNos(N);
        }
    }

    public static void main(String[] args)
    {
        OneToNWithoutLoops obj = new OneToNWithoutLoops();
        obj.printNos(5);

    }
}
