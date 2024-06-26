public class Encapsulation {

    // declare variables as private
    private String field1;
    private String field2;
    private String field3;

    public Encapsulation(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    // Public Methods to access variables
    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    public static void main(String[] args) {
        //
        Encapsulation encapsulation = new Encapsulation("First Field", "Second Field", "Third Field");
        System.out.println(encapsulation.getField1());
        System.out.println(encapsulation.getField2());
        System.out.println(encapsulation.getField3());
    }
}