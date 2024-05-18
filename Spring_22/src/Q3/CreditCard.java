package Q3;

public class CreditCard {
    private double credit_limit;
    private double credit_current;

    public CreditCard(double credit_limit) throws InvalidTxnException {
        if(credit_limit<0)
            throw new InvalidTxnException(credit_limit+" is not a valid amount for the requested transaction");
        this.credit_limit = credit_limit;
        this.credit_current = 0;
    }
    public void withdraw(double amount)throws InvalidTxnException{
        if(amount+credit_current>credit_limit)
            throw new InvalidTxnException(amount+" cannot be withdrawn with current credit of "+credit_current+" for your limit of "+credit_limit);

        credit_current+=amount;
    }
}
