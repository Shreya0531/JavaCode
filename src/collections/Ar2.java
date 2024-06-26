package collections;

import java.util.ArrayList;

public class Ar2 {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>(10);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>(c1);
        c2.add("Purple");

        ArrayList<String> c3 = (ArrayList<String>)c2.clone();


        System.out.println("Original array list C1: " + c1);
        System.out.println("Original array list C2: " + c2);
        System.out.println(c3);

        for(int i=0;i<c1.size();i++){
            System.out.println(c1.get(i));
        }


    }
}
