package Q2.B;

public class MainClass {
    public static void main(String[] args) {
        try{
            int[] acc={100,101,102,103,104,105};
            double[] balance={2000,1500,900,1560,1765.50};
            System.out.println("Account no\t");
            for(int i=0;i<5;i++){
                System.out.println(acc[i]+"\t\t"+balance[i]+"\t");
                if(balance[i]<1000)
                    throw new MinimumBalanceException();
            }
        }catch (MinimumBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
