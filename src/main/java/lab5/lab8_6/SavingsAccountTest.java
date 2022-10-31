package lab5.lab8_6;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(0.4,2000.00);
        SavingsAccount saver2 = new SavingsAccount(0.4,3000.00);
        System.out.printf(saver1.toString());
        System.out.println(saver2.toString());
        SavingsAccount.modifyInterestRate(0.5);
        System.out.printf(saver1.toString());
        System.out.println(saver2.toString());
    }
}
