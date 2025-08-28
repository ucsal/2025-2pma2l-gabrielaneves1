package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account implements Withdrawable {
    public CheckingAccount() {
        super();
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    }
