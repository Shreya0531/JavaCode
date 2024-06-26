package methods;

public class Ex1 {
    public static void main(String[] args) {
        smallestNumber(20, 0, 15);
    }

    public static void smallestNumber(int number1, int number2, int number3) {
        if (number1 < number2 && number1 < number3) {
            System.out.println(number1 + " is small");
        } else if (number2 < number3) {
            System.out.println(number2 + " is small");
        } else {
            System.out.println(number3 + " is small");
        }
    }
}
