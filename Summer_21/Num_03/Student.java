package Num_03;

public class Student implements Comparable<Student>{
    String name;
    double height;

    public Student(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public int compareTo(Student o) {
        if(this.height<o.height)
                return 1;
        else if(this.height>o.height)
                return -1;
        return 0;
    }
}
