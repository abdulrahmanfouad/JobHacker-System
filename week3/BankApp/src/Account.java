public class Account {
    private long accountNumber;
    private String accountHolderName;
    private double balance;
    public Account(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public Account() {
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("You can not withdraw amount larger than your balance");
        } else {
            balance-=amount;
        }
    }
}

