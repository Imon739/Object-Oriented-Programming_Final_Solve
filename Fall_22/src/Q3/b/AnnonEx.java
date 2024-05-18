package Q3.b;

interface Person{
    void introduce();
}
public class AnnonEx {
    public static void main(String[] args) {
        Person engineer=new Person(){
            public void introduce(){
                System.out.println("Hello, I'm an engineer");
            }
        };
        Person doctor=new Person(){
            public void introduce(){
                System.out.println("Hello,I'm a Doctor");
            }
        };
        engineer.introduce();
        doctor.introduce();
    }
}
