package lab_sheet_6.Q05;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal is not allowed.");
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (getBalance() - amount < 100) {
            System.out.println("Withdrawal denied: balance must stay at least 100.");
        } else {
            super.withdraw(amount);
            System.out.println("Withdrawal successful.");
        }
    }
}

public class SavingsAccountMain {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500.0);
        account.deposit(100.0);
        account.withdraw(450.0);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(100.0);
        System.out.println("Balance: " + account.getBalance());
    }
}