package lab5.lab8_6;

public class SavingsAccount {
    private static double yearInterestRate;
    private double savesBalance;

    public SavingsAccount(double yearInterestRate,double savesBalance){
        setSavesBalance(savesBalance);
        setYearInterestRate(yearInterestRate);
    }

    public double calculateMonthlyInterest(){
       double mothly = (savesBalance*yearInterestRate)/12;
       setSavesBalance(getSavesBalance()+mothly);
       return getSavesBalance();
    }
    public static void modifyInterestRate(double yearInterestRate){
        setYearInterestRate(yearInterestRate);
    }

    public void setSavesBalance(double savesBalance) {
        this.savesBalance = savesBalance;
    }

    public static void setYearInterestRate(double yearInterestRate) {
        SavingsAccount.yearInterestRate = yearInterestRate;
    }

    public double getSavesBalance() {
        return savesBalance;
    }

    public static double getYearInterestRate() {
        return yearInterestRate;
    }

    public String toString() {
        return String.format("Mothly balance: %.2f%n",calculateMonthlyInterest());
    }
}
