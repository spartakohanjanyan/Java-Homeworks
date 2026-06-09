package homeworkcustomer;

public class Customer {
    private String firstName;
    private String lastName;
    private String purchaseDate;
    private String address;

    public Customer(String firstName, String lastName, String purchaseDate, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.purchaseDate = purchaseDate;
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName
                + ", purchase date: " + purchaseDate
                + ", address: " + address;
    }
}
