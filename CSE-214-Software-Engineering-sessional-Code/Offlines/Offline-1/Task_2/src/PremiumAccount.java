public class PremiumAccount implements Account{
    private final double interestRate;
    private double balance;

    public PremiumAccount() {
        this.balance = 0.0;
        this.interestRate = 3.5;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if(balance < amount) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }
    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }
    @Override
    public double totalInterest(double years) {
        return balance * (interestRate)/100 * years;
    }
}
