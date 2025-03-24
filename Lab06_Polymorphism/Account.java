import java.util.Date;

class Account {
        private int id;
        private double balance;
        private double annualInterestRate;
        private Date dateCreated = new Date();

        public Account() {
            id = 0;
            balance = 0.0;
            annualInterestRate = 0.0;
            
        }
        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }
        //Methods:
        // setters & getters
        public int getID() { return id; }
        public void setID(int id) { this.id = id; }
        public double getBalance() { return balance; }
        public void setBalance(double balance) { this.balance = balance; }
        public double getAnnualInterestRate() { return annualInterestRate; }
        public void setAnnualInterestRate(double annualInterestRate) { this.annualInterestRate = annualInterestRate/100; }
        public String getCreatedDate() { return dateCreated.toString(); }
        // other methods
        public double getMonthlyInterestRate() {
            return annualInterestRate/12;
        }
        public double getMonthlyInterest() {
            return balance * getMonthlyInterestRate();
        }
        public void withdraw(double withdrawAmount) {
            balance -= withdrawAmount;
        }
        public void deposit(double depositAmount) {
            balance += depositAmount;
        }
}

