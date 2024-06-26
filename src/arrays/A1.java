
package arrays;
import java.util.Arrays;

public class A1 {
    public A1(){

    }

    public String[] getNames(){
        String[] names= {"Shreya","Sindhu"};
        System.out.println(names[0]);
        return names;
    }

    public static void main(String[] args) {
        A1 obj = new A1();
        System.out.println(obj.getNames());//Prints the object address of string names.
        System.out.println(Arrays.toString(obj.getNames()));// Prints elements in the string names.


    }
}
