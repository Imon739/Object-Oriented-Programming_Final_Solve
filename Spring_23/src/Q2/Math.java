package Q2;

public class Math {
    public int divide(int a,int b)throws DivByZero{
        if(b==0)
            throw new DivByZero();
        return a/b;
    }
}
