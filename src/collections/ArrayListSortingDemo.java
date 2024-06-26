package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSortingDemo {
    public static void main(String args[]) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));

        Iterator <Student> itr = students.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    public void eight(ArrayList<Student> aboveEight){
        Iterator<Student> itr1 = aboveEight.iterator();
        while (itr1.hasNext())
        {
           Student obj = itr1.next();
           if(obj.age>8){
               System.out.println(obj.age);
           }
        }
    }
    private static class Student {
        private String name;
        private int age;
        private int classNo;

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", classNo=" + classNo +
                    '}';
        }

        public Student(String name, int age, int classNo) {
            this.name = name;
            this.age = age;
            this.classNo = classNo;


        }
    }
}
