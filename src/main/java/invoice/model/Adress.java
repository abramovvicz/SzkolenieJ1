package invoice.model;

public class Adress {
    private String zipCode;
    private int id;
    private String city;
    private String streetName;

    public Adress(int id, String city, String streetName, String zipCode) {
        this.zipCode = zipCode;
        this.id = id;
        this.city = city;
        this.streetName = streetName;
    }


    public String getZipCode() {
        return zipCode;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "zipCode='" + zipCode + '\'' +
                ", id=" + id +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
