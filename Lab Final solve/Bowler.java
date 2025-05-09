import java.util.ArrayList;
import java.util.Calendar;

public class Bowler extends Cricketer{
    ArrayList<Integer>runConceded;
    ArrayList<Integer>wicketsTaken;

    public Bowler(String name, Calendar dateOfBirth, String country, ArrayList<Integer> runConceded, ArrayList<Integer> wicketsTaken) throws countryDidnotMatchException {
        super(name, dateOfBirth, country);
        this.runConceded = runConceded;
        this.wicketsTaken = wicketsTaken;
    }
    public double getAverage(){
        double sum=0;
        for(int x:runConceded){
            sum+=x;
        }
        double wicks=0;
        for(int x:wicketsTaken){
            wicks+=x;
        }

        return sum/wicks;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBowler{" +
                "Average=" + runConceded +
                '}';
    }
}
