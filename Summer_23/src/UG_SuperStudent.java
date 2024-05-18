public class UG_SuperStudent extends Student implements TA,RA{
    public String professor;
    public String research;
    public int salary;

    public UG_SuperStudent(String firstName, String lastName, String studentID, int age, String professor, String research, int salary) {
        super(firstName, lastName, studentID, age);
        this.professor = professor;
        this.research = research;
        this.salary = salary;
    }

    @Override
    public void conductResearch() {
        System.out.println(role);
        System.out.println("Professor: "+professor);
        System.out.println("Research: "+research);
        System.out.println("Salary: "+salary);
    }

    @Override
    public void register() {
        System.out.println("DSA,OOP,OOP Lab");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Professor: "+professor);
        System.out.println("Research: "+research);
        System.out.println("Salary: "+salary);
    }

    @Override
    public void assistProfessor() {
        System.out.println(ROLE);
        System.out.println(professor);
    }
}
//C D
//B D
//B D
//A D
//Result: 1 D
//E