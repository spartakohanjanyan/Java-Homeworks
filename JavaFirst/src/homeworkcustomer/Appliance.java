package homeworkcustomer;

import java.util.Objects;

public class Appliance {
    private String type;
    private String brand;
    private String model;
    private double price;

    public Appliance(String type, String brand, String model, double price) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Appliance other = (Appliance) obj;

        return type.equals(other.type)
                && brand.equals(other.brand)
                && model.equals(other.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, model);
    }

    @Override
    public String toString() {
        return type + " " + brand + " " + model + ", price: " + price;
    }
}
