public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Creating a RegularAccount .
        RegularFactory regularFactory = new RegularFactory();
        Account regularAccount = regularFactory.createAccount();
        // Deposit some money in the account.
        regularAccount.deposit(1000);
        // Print the totalInterest.
        System.out.println("Total Interest: " + regularAccount.totalInterest(2) + " with an interest of "+ regularAccount.getInterestRate());

        // Creating a VipLoan
        VipFactory vipFactory = new VipFactory();
        Loan VipLoan = vipFactory.createLoan();
        // Get some money from the Bank.
        VipLoan.getLoan(1000);
        // Print the totalInterest.
        System.out.println("Total Interest: " + VipLoan.totalInterest(2) + " with an interest of "+ VipLoan.getInterestRate());

    }
}
