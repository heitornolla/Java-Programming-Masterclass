public class Customer {
    String name;
    double creditLimit;
    String emailAddress;

    public Customer() {
        this.name = "Heitor";
        this.creditLimit = 500.00;
        this.emailAddress = "alo@gmail.com";
    }

    public Customer(String print) {
        System.out.println(print);
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(String name, String emailAddress) {
        this(name, 1000, emailAddress);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
