package homeworkcity;

public class City implements Comparable<City> {

    private String country;
    private String region;
    private String name;

    public City(String country, String region, String name) {
        this.country = country;
        this.region = region;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(City other) {
        int countryCompare = this.country.compareTo(other.country);

        if (countryCompare != 0) {
            return countryCompare;
        }

        int regionCompare = this.region.compareTo(other.region);

        if (regionCompare != 0) {
            return regionCompare;
        }

        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        City other = (City) obj;

        return this.country.equals(other.country)
                && this.region.equals(other.region)
                && this.name.equals(other.name);
    }

    @Override
    public String toString() {
        return country + ", " + region + ", " + name;
    }
}
