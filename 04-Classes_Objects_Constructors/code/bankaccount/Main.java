import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountBalance(1000);
        account.setAccountNumber("44");
        account.setCustomerEmail("aa@aa.aa");
        account.setCustomerName("namex");
        account.setPhoneNumber("9876543210");

        System.out.println("account.getAccountBalance(): " +
                account.getAccountBalance());
        System.out.println("account.getAccountNumber(): " +
                account.getAccountNumber());
        System.out.println("account.getCustomerEmail(): " +
                account.getCustomerEmail());
        System.out.println("account.getCustomerName(): " +
                account.getCustomerName());
        System.out.println("account.getPhoneNumber(): " + account.getPhoneNumber());

        boolean continueBankOperation = true;

        Scanner scanner = new Scanner(System.in);

        while (continueBankOperation) {
            System.out.println("Which operation do you want to perform?");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. None");
            String operation = scanner.nextLine();

            switch (operation) {
                case "1" -> {
                    System.out.println("Enter amount you want to deposit in your account:");
                    String amount = scanner.nextLine();
                    System.out.println(account.depositFund(Integer.parseInt(amount)));
                }
                case "2" -> {
                    System.out.println("Enter amount you want to withdraw from your account:");
                    String amount = scanner.nextLine();
                    System.out.println(account.withdrawFund(Integer.parseInt(amount)));
                }
                case "3" -> {
                    continueBankOperation = false;
                }
                default -> {
                    System.out.println("Invalid input. Please Enter 1 or 2 or 3 to continue");
                }
            }
        }
    }
}
