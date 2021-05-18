package Bank;

public abstract class Account {

    protected int num;
    protected double balance;
    protected String Accinfo;


    public Account(int actnum){
        num = actnum;
        balance = 0.0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract void getNum();
    public abstract void getBalance();

    public String getAccinfo() {
        return null;
    }

}
