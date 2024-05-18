package Q2.A;

import Q2.A.Calculator;

public class ExceptionTest {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        try{
            obj.divide();
            obj.displaay_namelength();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Exception handled successfully");
        }
    }
}
