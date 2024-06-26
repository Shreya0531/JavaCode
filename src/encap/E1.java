package encap;

public class E1 {
    private String name="Shreya";
    private int id;

    public String getName(){
        return name;
    }

    public void setName(String newname){
       this.name=newname;
    }

    public static void main(String[] args) {
        E1 obj = new E1();
        obj.setName("Sudha");
        System.out.println(obj.getName());
    }
}
