package practice;

import java.util.LinkedHashSet;

public class StudentData {
    public static void main(String[] args) {
        LinkedHashSet<Student> list = new LinkedHashSet<>();
        list.add(new Student(1,"Lekha",new String[]{"Science,Social"},new String[]{"Maths"},false));
        list.add(new Student(2,"Anu",new String[]{"Science,Social,Maths"},false));


    }
}
