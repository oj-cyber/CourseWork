public class Student {
   protected String name;
    protected int Id;
    protected int age;

    protected static int nextId = 1;

    {
this.Id=nextId++;
        System.out.println("Student Id :" + Id + " assigned");
    }

    public Student(String name,  int age) {
        this.name = name;

        this.age = age;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    public static int getNextId() {
        return nextId;
    }
    public void displayStudentInfo() {
        System.out.println("Roll No: " + Id +
                ", Name: " + name +
                ", Age: " + age +"yrs"+
                ", Grade: " );
    }

}