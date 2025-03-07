package BankExercise;

public class BankAccount {

    private double balance;

    public BankAccount(double startBalance) {
        if(startBalance < 0){
            System.out.println("Balance can´t be negative. Balance is set to 0kr. ");
            this.balance = 0;
        } else {
            this.balance = startBalance;
        }
    }

    public double getAmount() {
        return balance;
    }

    public void setBalance(double newBalance) {
        if (newBalance < 0) {
            System.out.println("Balance can´t be negative.");
        } else {
            this.balance = newBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("You need to deposit a positive amount.");
        }
    }

    public void withDraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! You is no able to withdraw!");
        } else if (amount < 0) {
            System.out.println("You can´t withdraw a negative amount.");
        } else {
            balance -= amount;
        }
    }
}

