package BankExercise;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting balance: ");
        double startBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(startBalance);

        while (true) {
            System.out.println("\nSelect an option: ");
            System.out.println("1. View balance ");
            System.out.println("2. Set new balance ");
            System.out.println("3. Deposit money ");
            System.out.println("4. Withdraw money ");
            System.out.println("5. Exit ");

            int val = scanner.nextInt();

            switch (val) {
                case 1:
                    System.out.println("Your balance is: " + account.getAmount() + " kr");
                    break;
                case 2:
                    System.out.print("Enter new balance: ");
                    double newBalance = scanner.nextDouble();
                    account.setBalance(newBalance);
                    System.out.println("Your new balance is: " + account.getAmount() + " kr");
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    System.out.println("Your new balance is: " + account.getAmount() + " kr");
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    account.withDraw(withdraw);
                    System.out.println("Your new balance is: " + account.getAmount() + " kr");
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid selection, please try again.");
            }
        }
    }
}
