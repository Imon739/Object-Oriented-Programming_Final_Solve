package Q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point>list=new ArrayList<>();
        list.add(new Point(5,10));
        list.add(new Point(12,15));
        list.add(new Point(-5,0));
        list.add(new Point(5,-10));
        list.add(new Point(7,15));
        System.out.println("Before sorting----------");
        for(Point P:list){
            System.out.println(P.x+" "+P.y);
        }

        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int sum1=o1.x+o1.y;
                int sum2=o2.x+o2.y;
                if(sum1<sum2)
                    return 1;
                else if(sum1>sum2)
                    return -1;
                return 0;
            }
        });
        System.out.println("After sorting----------");
        for(Point P:list){
            System.out.println(P.x+" "+P.y);
        }
    }
}
