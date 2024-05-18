package Q2;

public class test {
    public static void main(String[] args) {
        try {
            Math m = new Math();
            int n = 4;
            int d = 0;
            System.out.println(m.divide(n, d));
        }catch (Exception e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }finally {
            System.out.println("Complete");
        }
    }
}
