class BankAccount{
    String accountNumber;
    String holderName;
    double balance;
    
    public BankAccount(String accNum, String name, double initialBalance) {
        this.accountNumber = accNum;
        this.holderName = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(holderName + " deposited: " + amount);
    }
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(holderName + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds for " + holderName);
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: " + balance);
        System.out.println("-----------------------------");
    }
}

public class Bankacc{
    public static void main(String[] args) {
        
        System.out.println("--- BANK SYSTEM SIMULATION ---\n");
        BankAccount account1 = new BankAccount("AC001", "Nishan dhakal", 1000.0);
        BankAccount account2 = new BankAccount("AC002", "Nirjala prasai", 5000.0);
        account1.deposit(500.0);   
        account1.withdraw(200.0);
        account2.withdraw(1000.0);
        account2.deposit(250.0);   
        System.out.println("\n--- FINAL ACCOUNT DETAILS ---");
        account1.displayBalance();
        account2.displayBalance();
    }
}
