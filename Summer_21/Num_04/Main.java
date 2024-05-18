package Num_04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of elements: ");
        int n=sc.nextInt();
        int[]a=new int[n];
        int total_sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int left1=0;
        int right1=(n/3)-1;
        int left2=right1+1;
        int right2=((2*n)/3)-1;
        int left3=right2+1;
        int right3=n-1;
        SumThread t1=new SumThread(a,left1,right1);
        SumThread t2=new SumThread(a,left2,right2);
        SumThread t3=new SumThread(a,left3,right3);
        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        total_sum=t1.Sum+t2.Sum+t3.Sum;
        System.out.println("Total Sum: "+total_sum);
    }
}
    