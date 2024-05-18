package Q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Wizard",3,3.88));
        list.add(new Student("Peter",2,3.5));
        list.add(new Student("Wanda",1,3.88));
        list.add(new Student("Thanos",41,3.9));
        list.add(new Student("Yelena",7,3.75));
        list.add(new Student("Thor",15,3.89));
        Collections.sort(list,new Comparator<Student>(){
            public int compare(Student o1,Student o2){
                if(o1.cgpa<o2.cgpa)
                    return 1;
                else if(o1.cgpa>o2.cgpa)
                    return -1;
                return 0;
            }
        });
        for(Student x: list){
            System.out.println(x.name+" "+x.cgpa);
        }

    }
}
