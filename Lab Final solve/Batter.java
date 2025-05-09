import java.util.ArrayList;
import java.util.Calendar;

public class Batter extends Cricketer{
    ArrayList<Integer>runScored;

    public Batter(String name, Calendar dateOfBirth, String country, ArrayList<Integer> runScored) throws countryDidnotMatchException {
        super(name, dateOfBirth, country);
        this.runScored = runScored;
    }
    public double getAverage(){
        double sum=0;
        for(int x:runScored){
            sum+=x;
        }
        return sum/runScored.size();
    }

    @Override
    public String toString() {
        return super.toString()+ "\nBatter{" +
                "Average" + this.getAverage() +
                '}';
    }
}
