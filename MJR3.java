package JavaStudy;

class SavingAccount {
    private static double annualInterest = 0.0;
    private static int accountCounter = 1000;  
    
    private int accountNumber;  
    private double balance;    
    
    public SavingAccount(double initialBalance) {
        this.accountNumber = accountCounter++;
        this.balance = initialBalance;
    }

    public void calMonthInterest() {
        double monthlyInterestRate = annualInterest / 12;
        this.balance += this.balance * monthlyInterestRate;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public static void updateInterest(double newRate) {
        annualInterest = newRate;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}

public class MJR3 {
    public static void main(String[] args) {
        SavingAccount.updateInterest(0.05); 
    
        SavingAccount account1 = new SavingAccount(1000);
        System.out.println("Account 1 Balance: " + account1.getBalance());
        
        SavingAccount account2 = new SavingAccount(2000);
        System.out.println("Account 2 Balance: " + account2.getBalance());
        
        account1.calMonthInterest();
        account2.calMonthInterest();
        
        System.out.println("Account 1 Balance after interest: " + account1.getBalance());
        System.out.println("Account 2 Balance after interest: " + account2.getBalance());
    }
}
