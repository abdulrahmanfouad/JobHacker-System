import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 1 for creating Account , 2 to deposit to account , 3 to withdraw from account , 4 to display balance , 5 to exit");
        int entry = scanner.nextInt();
        if (entry==1){
            System.out.println("Enter Account Number");
            long accNumber = scanner.nextLong();
            System.out.println("Enter Account Balance");
            double balance = scanner.nextDouble();
            System.out.print("Enter Account Holder Name ");
            String name = scanner.next();
            bank.addAccount(new Account(accNumber,name,balance));
        } else if (entry==2){
            System.out.println("Enter Account Number you want to deposit to");
            long number = scanner.nextLong();
            System.out.println("Enter Amount you want to deposit");
            double depositAmount = scanner.nextDouble();
            bank.depositToAccount(bank.SearchAccounts(number),depositAmount);
        } else if (entry==3){
            System.out.println("Enter Account Number you want to withdraw from");
            long number = scanner.nextLong();
            System.out.println("Enter Amount you want to withdraw");
            double withdrawAmount = scanner.nextDouble();
            bank.withdrawFromAccount(bank.SearchAccounts(number),withdrawAmount);
        } else if (entry==4){
            System.out.println("Enter Account Number you want to display balance");
            long number = scanner.nextLong();
            System.out.println("Balance: "+bank.displayBalance(bank.SearchAccounts(number)));
        }
        while(entry!=5){
            System.out.println("Enter 1 for creating Account , 2 to deposit to account , 3 to withdraw from account , 4 to display balance , 5 to exit");
            entry = scanner.nextInt();
            if (entry==1){
                System.out.println("Enter Account Number");
                long accNumber = scanner.nextLong();
                System.out.println("Enter Account Balance");
                double balance = scanner.nextDouble();
                System.out.print("Enter Account Holder Name");
                String name = scanner.next();
                bank.addAccount(new Account(accNumber,name,balance));
            } else if (entry==2){
                System.out.println("Enter Account Number you want to deposit to");
                long number = scanner.nextLong();
                System.out.println("Enter Amount you want to deposit");
                double depositAmount = scanner.nextDouble();
                bank.depositToAccount(bank.SearchAccounts(number),depositAmount);
            } else if (entry==3){
                System.out.println("Enter Account Number you want to withdraw from");
                long number = scanner.nextLong();
                System.out.println("Enter Amount you want to withdraw");
                double withdrawAmount = scanner.nextDouble();
                bank.withdrawFromAccount(bank.SearchAccounts(number),withdrawAmount);
            } else if (entry==4){
                System.out.println("Enter Account Number you want to display balance");
                long number = scanner.nextLong();
                System.out.println("Balance: "+ bank.displayBalance(bank.SearchAccounts(number)));
            }
        }
    }
}
