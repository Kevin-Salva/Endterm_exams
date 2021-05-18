package Bank;
import org.junit.Test;
import javax.swing.JOptionPane;



class AccountUnitTest {
    @Test
    public void testChecking(){
        Checkings check = new Checkings(1920586);
        JOptionPane.showMessageDialog(null, check.getAccinfo());

    }
@Test
public void testSavings(){
Savings save = new Savings(100000, 4);
JOptionPane.showMessageDialog(null, save.getAccinfo());
}
}