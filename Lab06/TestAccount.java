public class TestAccount {
    public static void main(String[] args) {
        Account myAccount = new Account(1122, 20000.0);
        myAccount.setAnnualInterestRate(4.5);
        myAccount.withdraw(2500);
        myAccount.deposit(3000);
        System.out.println("Current Balance: " + myAccount.getBalance() + " Baht.");
        System.out.println("Your monthly interest is " + myAccount.getMonthlyInterest() + " Baht.");
        System.out.println("Account created date: " + myAccount.getCreatedDate());
    }
}
