public abstract class Student {
    public String firstName;
    public String lastName;
    public String studentID;
    public int age;

    public Student(String firstName, String lastName, String studentID, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.age = age;
    }
    public abstract void register();
    public void display(){
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Student ID: "+studentID);
        System.out.println("Age: "+age);
    }
}
