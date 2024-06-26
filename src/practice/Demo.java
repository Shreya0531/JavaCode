package practice;

class Calculator{
    public void add(int n1,int n2){
        int rAdd = n1+n2;
        System.out.println(rAdd);
    }

    public void sub(int n1, int n2){
        int rSub = n1-n2;
        System.out.println(rSub);
    }


}

public class Demo {
    public static void main(String[] args) {
        int num1 = 10, num2=20;
        Calculator calc = new Calculator();
        calc.add(num1,num2);
        calc.sub(num1,num2);
    }

}
