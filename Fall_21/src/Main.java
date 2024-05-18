import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        someclass s=new someclass(){
            void Hola(){
                System.out.println("Hola anon");
            }
        };
        s.Hola();
        s.Hola();
    }
}