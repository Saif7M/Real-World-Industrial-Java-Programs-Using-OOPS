// File: Account.java (inside src/banking/)
package banking;

class Account {
    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getter for balance (read-only access)
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method (with validation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc = new Account("John Doe", 5000);
        acc.deposit(2000);
        acc.withdraw(1000);
        System.out.println("Current Balance: " + acc.getBalance());
    }
}

