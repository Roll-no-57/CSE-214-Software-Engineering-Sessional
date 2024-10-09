public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    double getInterestRate();
    double totalInterest(double years);
}
