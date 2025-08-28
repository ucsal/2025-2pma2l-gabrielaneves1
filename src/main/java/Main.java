import br.com.mariojp.solid.lspaccounts.BankService;
import br.com.mariojp.solid.lspaccounts.CheckingAccount;
import br.com.mariojp.solid.lspaccounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit(1000);

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(500);

        bankService.processWithdrawal(checkingAccount, 200);

        System.out.println("Checking balance: " + checkingAccount.getBalance());
        System.out.println("Savings balance: " + savingsAccount.getBalance());
    }
}