package encap;

public class EncapDriver {
    public static void main(String[] args) {
       Enca e1= new Enca("Swift",3456789,"dfghj3456789");
       e1.drive();
       e1.display();
       System.out.println("-------------------------------------------------------");
       e1.setPrice(876543);
       e1.display();
    }
}


