package Num_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        Student s1=new Student("Fowad",5.8);
        Student s2=new Student("Shihab",5.6);
        Student s3=new Student("Sadman",5.0);
        Student s4=new Student("Omar",6.0);
        Student s5=new Student("Hrittik",6.2);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println("Before sorting-------");
        for(Student x: list){
            System.out.println(x.name+" "+x.height);
        }
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.height<o2.height)
//                    return 1;
//                else if(o1.height>o2.height)
//                    return -1;
//                else
//                    return 0;
//            }
//        });
        Collections.sort(list);
        System.out.println("After sorting-------");
        for(Student x: list){
            System.out.println(x.name+" "+x.height);
        }

    }
}

