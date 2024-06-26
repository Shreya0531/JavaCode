import java.util.*;

public class Apple {

    /* All member variables */
    private String type;
    private String color;
    private int weight;

    /* constructors */
    public Apple(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    /* methods*/

    public boolean isFresh() {
        // method implementation
        return true;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        //
        Apple redApple = new Apple("Empire", "Red", 100);
        System.out.println("I am a "+redApple.getColor()+" apple.");
        Apple greenApple = new Apple("Granny Smith", "Green", 200);
        System.out.println("I am a "+greenApple.getColor()+" apple.");
    }
}