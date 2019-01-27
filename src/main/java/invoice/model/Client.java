package invoice.model;

import java.util.Objects;

public class Client implements Comparable<Client> {
    private int id;
    private ClientType clientType;
    private String shortName;
    private String name;
    private int discount;
    private Adress adress;
    private String nip;
    private String pesel;

    public Client(int id, ClientType clientType, String shortName, String name, Adress adress, String nip, String pesel) {
        this.id = id;
        this.clientType = clientType;
        this.shortName = shortName;
        this.name = name;
        this.adress = adress;
        this.nip = nip;
        this.pesel = pesel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Client " + id +
                " | name: " + name +
                " | nip: " + nip;
    }

    @Override
    public int compareTo(Client o) {
        return this.shortName.compareToIgnoreCase(o.shortName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                Objects.equals(shortName, client.shortName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortName);
    }
}
