public class SavingsAccount extends Account{
    SavingsAccount savingsAccount = new SavingsAccount();
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double calculateInterest (){
        double savingBalance= savingsAccount.getBalance();
        double v = savingBalance * interestRate;
        savingBalance += v;
        return savingBalance;
    }
}
