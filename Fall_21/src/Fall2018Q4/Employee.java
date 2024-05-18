package Fall2018Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
    public String employeeName;
    public String employeeID;
    public double salary;

    public Employee(String employeeName, String employeeID, double salary) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1=new Employee("Shihab","470",8000);
        Employee e2=new Employee("Niloy","469",9000);
        Employee e3=new Employee("Fowad","005",7000);
        ArrayList<Employee>list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        System.out.println("Before sorting------------");
        for(Employee x:list){
            System.out.println(x.employeeName);
            System.out.println(x.employeeID);
            System.out.println(x.salary);
        }
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.salary>o2.salary)
                    return 1;
                else if (o1.salary<o2.salary)
                    return -1;
                return 0;
            }
        });
        System.out.println("After sorting------------");
        for(Employee x:list){
            System.out.println(x.employeeName);
            System.out.println(x.employeeID);
            System.out.println(x.salary);
        }
    }
}
