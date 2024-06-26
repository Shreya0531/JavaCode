package encap;

public class GetterSetter {
    private String name = "Shreya";
    private int id = 26;

    public String getName(String name)
    {
        return name;
    }

    public int getId(int id)
    {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


    public static void main(String[] args) {
        GetterSetter gs = new GetterSetter();
        System.out.println("Before");
        System.out.println(gs.name);
        System.out.println(gs.id);
        System.out.println("After");
        gs.setName("Shreya G");
        System.out.println(gs.name);
        gs.setId(25);
        System.out.println(gs.id);
    }
}
