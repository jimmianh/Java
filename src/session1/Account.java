package session1;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        int accountNumber;
        double accountBalance;

        System.out.println("Enter the detail for the new Account to be created...");
        System.out.println("Enter the Account Number:");
        Scanner scanner = new Scanner(System.in);
        accountNumber = scanner.nextInt();
        System.out.println("Enter the Account Balance:");
        accountBalance= scanner.nextDouble();

        System.out.println("the details of the new account are:");
        System.out.printf("Account Number: %d", accountNumber);
        System.out.printf("\n Account Balance: $%.2f", accountBalance);

    }
}
