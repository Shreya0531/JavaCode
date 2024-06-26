package collections;

public class GM1 {
    public static <E> void something(E element){
        System.out.println(element);
    }

    public static void main(String[] args) {
        Integer num = 1;
        String name = "shreya";
        something(num);
        something(name);
    }
}
