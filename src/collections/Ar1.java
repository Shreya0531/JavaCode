package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ar1 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        colors.add("Pink");

        ArrayList<String> color1 = new ArrayList<>();
        color1.add("Idigo");
        color1.add("Magantha");

       ArrayList<String> cloning = (ArrayList<String>)color1.clone();
        System.out.println("Cloning color1 :"+cloning);


        //adding element
        colors.add(0,"Purple");

        //iterating element
        for (String col: colors) {
            System.out.println(col);

        }
        System.out.println(colors.get(4));

        //updating element
        colors.set(0,"Green");
        System.out.println(colors);

        //removing element
        colors.remove(2);
        System.out.println(colors);

        //searching element
        if(colors.contains("Red")){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }

        //sorting element
        System.out.println(colors);
        Collections.sort(colors);
        System.out.println(colors);

        //adding one arraylist into other
        colors.addAll(color1);
        System.out.println("adding color1 to colors "+colors);

        //shuffling elements
        Collections.shuffle(color1);
        System.out.println("shuffling elements :"+color1);

        Collections.reverse(colors);
        System.out.println("Reversing elemets "+colors);

        List<String> subString = colors.subList(0,3);
        System.out.println(colors.subList(0,3));

        //Swapping elements
        Collections.swap(colors,0,1);
        System.out.println(colors);

        if(colors.isEmpty()){
            System.out.println("List is empty");
        }
        else {
            System.out.println("List not empty");
        }

        System.out.println(colors.size());
        colors.trimToSize();
        System.out.println(colors);


    }
    }

