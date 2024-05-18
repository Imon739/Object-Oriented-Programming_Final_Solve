package Q3;

public class Main {
    public static void main(String[] args) {
        try {
//            CreditCard c1 = new CreditCard(-5000);
            CreditCard c2 = new CreditCard(10000);
            c2.withdraw(7000);
            c2.withdraw(4000);
        }catch (InvalidTxnException e){
            System.out.println(e.getMessage());
        }
    }
}