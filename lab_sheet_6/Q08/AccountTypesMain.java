package lab_sheet_6.Q08;

abstract class BankAccount {
    protected double balance;

    BankAccount(double openingBalance) {
        if (openingBalance >= 0) {
            balance = openingBalance;
        }
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double openingBalance) {
        super(openingBalance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Savings deposit accepted.");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Savings withdrawal accepted.");
        } else {
            System.out.println("Savings withdrawal denied.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    CurrentAccount(double openingBalance, double overdraftLimit) {
        super(openingBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Current account deposit accepted.");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Current account withdrawal accepted.");
        } else {
            System.out.println("Current account overdraft limit exceeded.");
        }
    }
}

public class AccountTypesMain {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(500.0);
        BankAccount current = new CurrentAccount(500.0, 200.0);

        savings.deposit(100.0);
        savings.withdraw(150.0);
        current.deposit(50.0);
        current.withdraw(700.0);
        System.out.println("Savings balance: " + savings.getBalance());
        System.out.println("Current balance: " + current.getBalance());
    }
}