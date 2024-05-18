public class Mythread extends Thread{
    private int tid; // Thread ID
    private int startValue, endValue, inc;
    private double z;
    public Mythread(int id, int sv, int ev){
// Write your code here
        this.tid=id;
        this.startValue=sv;
        this.endValue=ev;
        inc = 3; // increment
        z = 1.0;
    }
    public void run(){
// Write your code here to compute partial z
        for(int i=startValue;i<=endValue;i+=inc){
            double val=1.00/i;
            z*=val;
        }
    }
    public double get_z(){return z;}
}
class Myproject5 {
    public static void main(String[] args) {
        Thread t1 = new Mythread(1, 5, 14);
        Thread t2 = new Mythread(2, 17, 26);
        Thread t3 = new Mythread(3, 29, 38);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            t3.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if(!t1.isAlive() && !t2.isAlive() && !t3.isAlive()){
            double r1 = ((Mythread)t1).get_z();
            double r2 = ((Mythread)t2).get_z();
            double r3 = ((Mythread)t3).get_z();
            System.out.println("result: "+(r1*r2*r3));
            // Write your code here to compute final z
        }
    }
}
