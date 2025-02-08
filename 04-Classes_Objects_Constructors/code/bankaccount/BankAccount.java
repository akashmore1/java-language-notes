public class BankAccount {
    private String accountNumber;
    private int accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String depositFund(int amount) {
        this.accountBalance += amount;
        return "Amount deposited successfully. Current balance is: " + this.accountBalance;
    }

    public String withdrawFund(int amount) {
        if (this.accountBalance - amount >= 0) {
            this.accountBalance -= amount;
            return "Amount withdrawn successfully. Current balance is: " + this.accountBalance;
        }
        return "Cannot withdraw amount. Current balance is: " + this.accountBalance;
    }
}
