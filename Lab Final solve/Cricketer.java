import java.util.Calendar;

public abstract class Cricketer {
    private String name;
    private Calendar dateOfBirth;
    private String country;

    public Cricketer() {
    }

    public Cricketer(String name, Calendar dateOfBirth, String country) throws countryDidnotMatchException {
        if(!countryMatcher(country))
            throw new countryDidnotMatchException();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
    }
    public static boolean countryMatcher(String country){
        String[] validCountries ={"Bangladesh","India","Sri lanka","Pakistan","England","Australia","New Zealand","South Africa","West Indies"};
        boolean flag=false;
        for(String x:validCountries){
            if(country.compareTo(x)==0)
                flag=true;
        }
        return flag;
    }
    public String getName() {
        return name;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", country='" + country + '\'' +
                '}';
    }
    public abstract double getAverage();
}
