package Q1.C;

public class AnnonEx {
    public static void main(String[] args) {
        Person engineer = new Person(){
            public void introduce(){
                System.out.println("Hello, I'm an Engineer");
            }
        };
        Person doctor=new Person(){
            public void introduce(){
                System.out.println("Hello, I'm a doctor");
            }
        };
        engineer.introduce();
        doctor.introduce();
    }
}
