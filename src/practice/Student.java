package practice;

public class Student {
    int id;
    String name;
    String[] passedSubjects;
    String[] failedSubjects;
    boolean result;

    public Student() {
    }

    public Student(int id, String name, String[] passedSubjects,String[] failedSubjects,boolean result)
    {
        this.id=id;
        this.name=name;
        this.passedSubjects=passedSubjects;
        this.failedSubjects=failedSubjects;
        this.result=result;
    }

    public Student(int id, String name,String[] failedSubjects,boolean result)
    {
        this.id=id;
        this.name=name;
        this.failedSubjects=failedSubjects;
    }

    public Student(int id, String name, boolean result)
    {

    }

}
