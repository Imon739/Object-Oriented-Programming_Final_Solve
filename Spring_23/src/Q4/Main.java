package Q4;

public class Main {
    public static void main(String[] args) {
        CountThread c1=new CountThread();
        Thread t1=new Thread(c1);
        t1.start();
        try{
            t1.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Final");
    }
}
