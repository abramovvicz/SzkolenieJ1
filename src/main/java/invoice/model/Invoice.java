package invoice.model;

import java.time.LocalDate;

import static invoice.model.Tax.values;

public class Invoice {
    private String numberInvoice;
    private LocalDate dateOfInvoice;
    private LocalDate dateOfBillExpires;
    private Client client;
    private ClientType clientType;
    private int clientId;
    private String productName;
    private ProductCategory productCategory;
    private Tax tax;
    private double sumWithTax;
    private double sumWithOutTax;


    public Invoice(String numberInvoice, LocalDate dateOfInvoice, LocalDate dateOfBillExpires,
                   Client client, ClientType clientType, int clientId, String productName,
                   ProductCategory productCategory, Tax tax, double sumWithTax, double sumWithOutTax) {
        this.numberInvoice = numberInvoice;
        this.dateOfInvoice = dateOfInvoice;
        this.dateOfBillExpires = dateOfBillExpires;
        this.client = client;
        this.clientType = clientType;
        this.clientId = clientId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.tax = tax;
        this.sumWithTax = sumWithTax;
        this.sumWithOutTax = sumWithOutTax;
    }

//    public Invoice() {
//    }

    public String getNumberInvoice() {
        return numberInvoice;
    }

    public LocalDate getDateOfInvoice() {
        return dateOfInvoice;
    }

    public LocalDate getDateOfBillExpires() {
        return dateOfBillExpires;
    }

    public Client getClient() {
        return client;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public int getClientId() {
        return clientId;
    }

    public String getProductName() {
        return productName;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public Tax getTax() {
        return tax;
    }

    public double getSumWithTax() {
        return sumWithTax;
    }

    public double getSumWithOutTax() {
        return sumWithOutTax;
    }

    public void setNumberInvoice(String numberInvoice) {
        this.numberInvoice = numberInvoice;
    }

    public void setDateOfInvoice(LocalDate dateOfInvoice) {
        this.dateOfInvoice = dateOfInvoice;
    }

    public void setDateOfBillExpires(LocalDate dateOfBillExpires) {
        this.dateOfBillExpires = dateOfBillExpires;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public void setSumWithTax(double sumWithTax) {
        this.sumWithTax = sumWithTax;
    }

    public void setSumWithOutTax(double sumWithOutTax) {
        this.sumWithOutTax = sumWithOutTax;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "numberInvoive=" + numberInvoice +
                ", dateOfInvoice=" + dateOfInvoice +
                ", dateOfBillExpires=" + dateOfBillExpires +
                ", client=" + client +
                ", clientType=" + clientType +
                ", clientId='" + clientId + '\'' +
                ", productName=" + productName +
                ", productCategory=" + productCategory +
                ", tax=" + tax +
                ", sumWithTax=" + sumWithTax +
                ", sumWithOutTax=" + sumWithOutTax +
                '}';
    }
}
