package Q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator_main {
    public static void main(String[] args) {
        ArrayList<Player>list=new ArrayList<>();
        list.add(new Player(55,"Karim","Bangladesh"));
        list.add(new Player(14,"Ponting","Australia"));
        System.out.println("Before sorting----");
        for(Player x: list){
            System.out.println(x.name+" "+x.type+" "+x.jersey);

        }
        Collections.sort(list, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if(o1.jersey>o2.jersey)
                    return 1;
                else if(o1.jersey<o2.jersey)
                    return -1;
                return 0;
            }
        });
        System.out.println("After sorting----");
        for(Player x: list){
            System.out.println(x.name+" "+x.type+" "+x.jersey);

        }

    }
}
