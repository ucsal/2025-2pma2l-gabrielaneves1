package br.com.mariojp.solid.lspaccounts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankServiceTest {

    @Test
    void testWithdrawalFromCheckingAccount() {
        BankService bankService = new BankService();
        CheckingAccount checkingAccount = new CheckingAccount();

        checkingAccount.deposit(1000);
        bankService.processWithdrawal(checkingAccount, 200);

        assertEquals(800, checkingAccount.getBalance(), 0.01);

    }

    @Test
    void testDepositInSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.deposit(500);

        assertEquals(500, savingsAccount.getBalance(), 0.01);
    }
}