public class VipLoan implements Loan{
    private final double interestRate;
    private double debt;

    public VipLoan() {
        this.debt = 0.0;
        this.interestRate = 10;
    }

    @Override
    public void getLoan(double amount) {
        debt += amount;
    }
    @Override
    public void payLoan(double amount) {
        if(debt < amount) {
            System.out.println("Insufficient debt");
            return;
        }
        debt -= amount;
    }
    @Override
    public double getLoanAmount() {
        return debt;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }
    @Override
    public double totalInterest(double years) {
        return debt * (interestRate)/100 * years;
    }
}
