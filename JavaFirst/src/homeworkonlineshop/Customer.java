package homeworkonlineshop;

public class Customer {
    private final String name;
    private final String phone;
    private final String email;

    public Customer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Customer)) {
            return false;
        }

        Customer other = (Customer) obj;

        return phone.equals(other.phone) && email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return phone.hashCode() + email.hashCode();
    }

    @Override
    public String toString() {
        return name + "  " + phone + "  " + email;
    }
}
