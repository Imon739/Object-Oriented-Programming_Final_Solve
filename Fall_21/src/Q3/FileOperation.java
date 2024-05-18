package Q3;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("input.txt"));
        PrintWriter pr=new PrintWriter(new File("output.txt"));
        int i=1;
        while(sc.hasNext()){
            String s1=sc.next();
            String s2=sc.next();
            int num=Integer.parseInt(s1)+Integer.parseInt(s2);
            pr.println("Line "+i+": "+num);
            i++;
        }
        sc.close();
        pr.close();
    }
}
