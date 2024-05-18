package Q3;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Operation {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        PrintWriter pr=new PrintWriter(new File("employee.txt"));
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            String name=sc.next();
            String id=sc.next();
            double[] score=new double[6];
            for(int j=0;j<6;j++){
                score[j]=sc.nextDouble();
            }
            Employee e=new Employee(name,id,score);
            pr.println(e.name);
            pr.println(e.id);
            pr.println(e.averageScore);
        }
        pr.close();
        sc.close();
        Scanner filescanner=new Scanner(new File("employee.txt"));
        PrintWriter incrementwriter=new PrintWriter(new File("increment.txt"));
        String nameofMax="";
        double Maxscore=0;
        double max=-1;
        while(filescanner.hasNext()){
            String name=filescanner.next();
            String id=filescanner.next();
            double score=filescanner.nextDouble();
            if(score>75){
                incrementwriter.println(name);
            }
            if(max<score){
                max=score;
                nameofMax=name;
                Maxscore=max;
            }
        }


        System.out.println(nameofMax+" "+Maxscore);

        filescanner.close();
        incrementwriter.close();
    }
}
