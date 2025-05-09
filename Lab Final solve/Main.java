import java.util.ArrayList;

public class Main {
    static ArrayList<Cricketer>players;
    public static void main(String[] args) {

    }
    public static void displayPlayers(String country){
        for(Cricketer x:players){
            if(x.getCountry().compareTo(country)==0)
                System.out.println(x.toString());
        }
    }
    public static Cricketer highestAverageBatsman(){
        double avg=-1.0;
        Cricketer temp = null;
        for(Cricketer x:players){
            if((x instanceof Batter)&&x.getAverage()>avg)
                temp=x;
        }
        return temp;
    }
    public static Cricketer lowestAverageBaller(){
        double avg=Double.MAX_VALUE;
        Cricketer temp = null;
        for(Cricketer x:players){
            if((x instanceof Bowler) && x.getAverage()<avg)
                temp=x;
        }
        return temp;
    }
    public static void displayPlayers(){
        for(Cricketer x:players){
            System.out.println(x.toString());
        }
    }
}