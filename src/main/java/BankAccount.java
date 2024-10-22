public class BankAccount {
    private double balance;
    private double minimumBalance;
    private boolean isActive = true;
    public String holdername;

    public String getHoldername() {
        return holdername;
    }

    public void setHoldername(String holdername) {
        this.holdername = holdername;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public BankAccount(double balance, double minimumBalance){
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public double withdraw(double amount) {
        if(balance - amount > minimumBalance){
            balance -= amount;
            return amount;
        } else {
            throw new RuntimeException();
        }
    }
    public double deposit(double amount)
    {
        return balance += amount;
    }
       ;
}
