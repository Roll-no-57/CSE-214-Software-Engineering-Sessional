public class RegularFactory extends BankFactory {
    @Override
    public Account createAccount() {
        return new RegularAccount();
    }

    @Override
    public Loan createLoan() {
        return new RegularLoan();
    }

}
