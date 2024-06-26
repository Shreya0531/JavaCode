package collections;


import java.util.Arrays;

public class I1 {
    String name;
    int marks[];
    int age;

    @Override
    public String toString() {
        return "I1{" +
                "name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ", age=" + age +
                '}';
    }

    I1(){

    }
    I1(String name,int marks[],int age)
    {
        this.name=name;
        this.marks=marks;
        this.age=age;
    }
}
