package homeworkgrocerydepot;

public class Grocery {
    private String type;
    private String productionDate;
    private String expirationDate;
    private double volumePerKg;
    private String producerName;

    public Grocery(String type, String productionDate, String expirationDate,
                   double volumePerKg, String producerName) {
        this.type = type;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        this.volumePerKg = volumePerKg;
        this.producerName = producerName;
    }

    public String getType() {
        return type;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public double getVolumePerKg() {
        return volumePerKg;
    }

    public String getProducerName() {
        return producerName;
    }

    public boolean equals(Grocery other) {
        return this.type.equals(other.type)
                && this.producerName.equals(other.producerName);
    }

    @Override
    public String toString() {
        return "Grocery{" +
                "type='" + type + '\'' +
                ", productionDate='" + productionDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", volumePerKg=" + volumePerKg +
                ", producerName='" + producerName + '\'' +
                '}';
    }
}
