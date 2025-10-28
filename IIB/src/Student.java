public class Student {
    private String name;
    private int Id;
    protected int age;

    protected static int nextId = 1;

    {
this.Id=nextId++;
        System.out.println("Student Id :" + Id + " assigned");
    }

}