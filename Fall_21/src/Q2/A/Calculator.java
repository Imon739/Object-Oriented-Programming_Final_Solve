package Q2.A;

import java.util.Scanner;

public class Calculator {
    String name=null;
    int num1;
    int num2;
    public Calculator(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        this.num1=sc.nextInt();
        System.out.println("Enter the second number");
        this.num2=sc.nextInt();
    }
    public void divide(){
        System.out.println(num1/num2);
    }
    public void displaay_namelength(){
        System.out.println(name.length());
    }
}
