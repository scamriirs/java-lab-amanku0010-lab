class Account {
    protected String accountNo;
    protected double balance;

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            checkBalance();
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(double amount) {
        System.out.println("Withdraw method should be overridden in subclass.");
    }
}

class Savings extends Account {
    private double interestRate;

    public Savings(String accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Insufficient balance in Savings account!");
        }
        checkBalance();
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
        checkBalance();
    }
}

class Current extends Account {
    private double overdraftLimit;

    public Current(String accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn from Current: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
        checkBalance();
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Savings s1 = new Savings("S1001", 5000, 5);
        s1.checkBalance();
        s1.deposit(1000);
        s1.withdraw(2000);
        s1.applyInterest();

        System.out.println("---------------------------");

        Current c1 = new Current("C2001", 3000, 1000);
        c1.checkBalance();
        c1.deposit(2000);
        c1.withdraw(5500);
        c1.withdraw(2000);
    }
}
