package Tasks;
import java.util.Scanner;
public class AtmInterface {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     BankAccount account = new BankAccount(1000); // Initial balance of 1000
     ATM atm = new ATM(account);

     while (true) {
         System.out.println("Welcome to the ATM");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Exit");
         System.out.print("Please choose an option: ");
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 atm.checkBalance();
                 break;
             case 2:
                 System.out.print("Enter the amount to deposit: ");
                 double depositAmount = scanner.nextDouble();
                 atm.deposit(depositAmount);
                 break;
             case 3:
                 System.out.print("Enter the amount to withdraw: ");
                 double withdrawAmount = scanner.nextDouble();
                 atm.withdraw(withdrawAmount);
                 break;
             case 4:
                 System.out.println("Thank you for using the ATM. Goodbye!");
                 scanner.close();
                 System.exit(0);
             default:
                 System.out.println("Invalid option. Please try again.");
         }
     }
 }
}

//Class to represent the ATM machine
class ATM {
 private BankAccount account;

 public ATM(BankAccount account) {
     this.account = account;
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= account.getBalance()) {
         account.withdraw(amount);
         System.out.println("Withdrawal successful. Your new balance is: " + account.getBalance());
     } else {
         System.out.println("Withdrawal failed. Insufficient balance or invalid amount.");
     }
 }

 public void deposit(double amount) {
     if (amount > 0) {
         account.deposit(amount);
         System.out.println("Deposit successful. Your new balance is: " + account.getBalance());
     } else {
         System.out.println("Deposit failed. Invalid amount.");
     }
 }

 public void checkBalance() {
     System.out.println("Your current balance is: " + account.getBalance());
 }
}

//Class to represent the user's bank account
class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
     }
 }
}

