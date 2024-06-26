package methods;

public class Company {
    public static void main(String[] args) {
        Ex4 obj = new Ex4();
       // System.out.println(obj.empId);
        obj.empName="shreya";
        obj.address="werty";
        obj.salary=9876543;
        obj.display();
        obj.login();
        obj.checkSalaryPaid();
        System.out.println("-------------------------------------------------");

        Ex4 obj1 = new Ex4();
        //System.out.println(obj.empId);
        obj1.empName="shr";
        obj1.address="werty9876543";
        obj1.salary=0;
        obj1.display();
        obj1.login();
        obj1.checkSalaryPaid();
    }
}
