package Q2;

public class DivByZero extends ArithmeticException{
    public DivByZero(){
        super("The denominator can not be zero!");
    }
}
