package Bank;

public class Checkings extends  Account {

    public Checkings(int num){
        super (num);
    }

    @Override
    public void getNum() {
        System.out.println("Account info: ");
        System.out.println("Acct #: " + num);
    }

    @Override
    public void getBalance() {
        System.out.println("Acct Balance: "+ balance);
    }

}
