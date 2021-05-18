package Bank;

public class Savings  extends Account {
    double interest;

    Savings(int num, double interest){
        super(num);
}

    @Override
    public void getNum() {
        System.out.println("Saving account info");
        System.out.println("Acct #: "+num);
    }

    @Override
    public void getBalance() {
        System.out.println("Balance: "+balance);
        System.out.println("Rate of interest: "+interest);
    }
}
