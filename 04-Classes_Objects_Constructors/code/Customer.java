public class Customer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public Customer(String name, String emailAddress, int creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("Akash", "akash@more", 100000000);
    }

    public Customer(String name, String emailAddress) {
        this(name, emailAddress, 1000);
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
