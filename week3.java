import java.util.Scanner;

// Base Account class
class Account {
    protected String customerName;
    protected String accountNumber;
    protected String accountType;
    protected double balance;

    public Account(String customerName, String accountNumber, String accountType, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Savings Account class
class Sav_acct extends Account {
    private double interestRate = 0.05; // 5% annual interest

    public Sav_acct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Savings", initialBalance);
    }

    public void computeAndDepositInterest(int years) {
        double interest = balance * Math.pow((1 + interestRate), years) - balance;
        balance += interest;
        System.out.println("Interest of ₹" + String.format("%.2f", interest) + " deposited for " + years + " years.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }
}

// Current Account class
class Cur_acct extends Account {
    private double minimumBalance = 1000.0;
    private double serviceCharge = 100.0;

    public Cur_acct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Current", initialBalance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
            checkMinimumBalance();
        }
    }

    private void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Balance below minimum. Service charge of ₹" + serviceCharge + " imposed.");
        }
    }

    public void issueChequeBook() {
        System.out.println("Cheque book issued to " + customerName);
    }
}

// Main Bank class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String name = sc.nextLine();

        System.out.println("Enter account number:");
        String accNo = sc.nextLine();

        System.out.println("Enter account type (Savings/Current):");
        String type = sc.nextLine();

        System.out.println("Enter initial deposit amount:");
        double initialDeposit = sc.nextDouble();

        if (type.equalsIgnoreCase("Savings")) {
            Sav_acct savings = new Sav_acct(name, accNo, initialDeposit);
            savings.displayBalance();
            savings.deposit(5000);
            savings.computeAndDepositInterest(2);
            savings.withdraw(3000);
            savings.displayBalance();
        } else if (type.equalsIgnoreCase("Current")) {
            Cur_acct current = new Cur_acct(name, accNo, initialDeposit);
            current.displayBalance();
            current.deposit(7000);
            current.issueChequeBook();
            current.withdraw(8000);
            current.displayBalance();
        } else {
            System.out.println("Invalid account type.");
        }

        sc.close();
    }
}