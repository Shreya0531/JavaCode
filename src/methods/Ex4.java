package methods;

public class Ex4 {
    int empId;
    String empName;
    double salary;
    String address;
    static int count=1;
    String cName = "TATA";

    {
        empId = count++;
        System.out.println(cName+empId);

    }

    public void login()
    {
        System.out.println("Employee "+empName+" logged in.");
    }

    public void checkSalaryPaid()
    {
        if(salary==0){
            System.out.println("Salary not paid");
        }
        else {
            System.out.println("Salary paid");
        }
    }

    public void display(){
        //System.out.println("EmpId :"+empId);
        System.out.println("Emp name :"+empName);
        System.out.println("Emp salary :"+salary);
        System.out.println("Address :"+address);

    }
}
