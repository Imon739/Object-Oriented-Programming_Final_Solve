
public class DemoClass {
//    private static final double PI=3.1416;
    private final double PI=3.1416;
//    static void calculateArea(double radius){
////        double sqr=Math.pow(radius,2);
//        double area=PI*radius*radius;
//        System.out.println("Area: "+area);
//    }
void calculateArea(double radius){
//        double sqr=Math.pow(radius,2);
        double area=PI*radius*radius;
        System.out.println("Area: "+area);
    }


    public static void main(String[] args) {
        DemoClass c1=new DemoClass();
        c1.calculateArea(5.0);
    }
}
