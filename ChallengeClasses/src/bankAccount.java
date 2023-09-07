public class bankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void withdraw(double balance, double amount) {
        if (balance - amount < 0) {
            System.out.println("Operation Denied");
        } else {
            this.balance -= amount;
        }
    }

    public void deposit(double balance, double amount) {
        this.balance += amount;
    }

    public void printBalance() {
        System.out.println(balance + "$");
    }

    public void printAccountInfo() {
        System.out.println("Account owned by " + ownerName + ". Number " + accountNumber + ". "
            + balance + "$ on the account.");
    }
}
