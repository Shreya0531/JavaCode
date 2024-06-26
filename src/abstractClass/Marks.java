package abstractClass;

import java.util.Scanner;

public abstract class Marks {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
       // System.out.println("Enter the number of subjects");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = sc.nextDouble();
    double total=a+b+c+d;
    double percentage= total/100;

    public abstract double getPercentage();

}
