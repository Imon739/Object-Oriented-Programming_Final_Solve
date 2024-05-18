package Q2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("id.txt"));
        PrintWriter evenpr=new PrintWriter(new File("even.txt"));
        PrintWriter oddpr=new PrintWriter(new File("odd.txt"));
        while(sc.hasNext()){
            String s=sc.next();
//            int num=sc.nextInt();
            int num=Integer.parseInt(s);
            if(num%2==0)
                evenpr.println(s);
            else
                oddpr.println(s);
        }
        evenpr.close();
        oddpr.close();
        sc.close();
    }
}
