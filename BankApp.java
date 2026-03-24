package Java_Core;

class BankAccount {

    String accountNumber;
    String holderName;
    double balance;
    String accountType;
    int transactionCount;

    // Constructor with validation
    public BankAccount(String accountNumber, String holderName, double balance, String accountType) {
        if (balance < 0) {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.accountType = accountType;
        this.transactionCount = 0;
    }

    // Deposit method
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            transactionCount++;
            System.out.println(holderName + " deposited: " + amt);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amt > balance) {
            System.out.println("Insufficient balance for " + holderName);
        } else {
            balance -= amt;
            transactionCount++;
            System.out.println(holderName + " withdrew: " + amt);
        }
    }

    // Transfer method
    public void transfer(BankAccount target, double amt) {
        if (amt <= 0) {
            System.out.println("Invalid transfer amount.");
        } else if (amt > balance) {
            System.out.println("Transfer failed due to insufficient balance.");
        } else {
            this.balance -= amt;
            target.balance += amt;
            this.transactionCount++;
            target.transactionCount++;
            System.out.println(holderName + " transferred " + amt + " to " + target.holderName);
        }
    }

    // Display statement
    public void displayStatement() {
        System.out.println("\n--- Account Statement ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Transactions: " + transactionCount);
    }
}

public class BankApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("A101", "Parul", 1000, "Savings");
        BankAccount acc2 = new BankAccount("A102", "Rahul", 500, "Current");

        
        acc1.deposit(200);        
        acc1.withdraw(150);       
        acc1.transfer(acc2, 300); 
        acc2.deposit(100);        
        acc2.withdraw(50);        
        
        acc1.displayStatement();
        acc2.displayStatement();
    }


	}


