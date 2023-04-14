import java.util.ArrayList;

public class Bank {
    ArrayList<Account> bankAccounts = new ArrayList<>();
    public void addAccount(Account account){
        bankAccounts.add(account);
        System.out.println("Account Created");
    }
    public void depositToAccount(Account account,double amount){
        account.deposit(amount);
        System.out.println("Successful Deposit");
    }
    public void withdrawFromAccount(Account account,double amount){
        account.withdraw(amount);
    }
    public double displayBalance(Account account){
        return account.getBalance();
    }
    public Account SearchAccounts(long Number){
        Account account=new Account();
        for (Account bankAccount : bankAccounts) {
            if (bankAccount.getAccountNumber() == Number) {
                account = bankAccount;
            } else {
                System.out.println("No Account with this Number");
            }
        }
        return account;

    }
}
