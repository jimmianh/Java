package session1;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {


    double accountBalance = 10000.00;
    double withdraw = 0.00;
    boolean possible = false;
    String cusname;

    // Accepting user input and storing it in variables
        // số dư tài khoản
        System.out.printf("Available account balance:$%.2f \n " , accountBalance);
        // số tiền rút
        System.out.println("Enter the Amount to withdraw: $");
        Scanner scanner = new Scanner(System.in);
        //chuyển cho về scanner.nextLine
        withdraw = Double.parseDouble(scanner.nextLine());
        //nhập tên
        System.out.println("Enter the Customer Name:");
        cusname = scanner.nextLine();

//
        possible = (accountBalance > withdraw);
        accountBalance = possible ? accountBalance - withdraw : accountBalance;
        System.out.println("Wellcome" + cusname);
        System.out.printf("\n Current account balance: $%.2f", accountBalance);
        System.out.println("\nTransaction Successful:" + possible);

    }
}
