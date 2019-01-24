package invoice.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Invoice {
    private String numberInvoice;
    private LocalDate dateOfInvoice;
    private LocalDate dateOfBillExpires;
    private Client client;
    private ClientType clientType;
    private int clientId;
    private String productName;
    private Product product;
    private ProductCategory productCategory;
    private Tax tax;
    private double sumWithTax;
    private double sumWithOutTax;

    private LocalDate localDate = LocalDate.now();
    LocalDate next2Week = localDate.plus(2, ChronoUnit.WEEKS);
    long countDays = ChronoUnit.DAYS.between(localDate, next2Week); // ilość dni

    public Invoice(Product product, Client client) {
        this.product = product;
        this.productName = product.getName();
        this.productCategory = product.getProductCategory();
        this.tax = product.getTax();
        this.clientId = client.getId();
        this.client = client;
        this.clientType = client.getClientType();
        this.numberInvoice = generateInvoiceNumber();
        this.dateOfInvoice = generateDateInvoiceCreation();
        this.dateOfBillExpires = generateExpiresDateInvoice();
        this.sumWithOutTax = product.getPriceWithOutTax();
        this.sumWithTax = product.getPriceWithTax();


    }


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


    public String generateInvoiceNumber() {
        LocalDate localDate = LocalDate.now();
        String invoiceNumber = localDate + "N/N" + new Random().nextInt(204);
        System.out.println(invoiceNumber);
        //takie pseudo - ale tak napradę powinno być tworzone na nowy rok nowy numer, który jest sprawdzany ostatni numer, zwiększany o 1
        //i  dodawanydo puli  numerów może dodam jak starczy czasu
        return invoiceNumber;
    }

    public LocalDate generateDateInvoiceCreation() {
        return localDate;
    }

    public LocalDate generateExpiresDateInvoice() {
        return next2Week;
    }

    public String getNumberInvoice() {
        return numberInvoice;
    }

    public void setNumberInvoice(String numberInvoice) {
        this.numberInvoice = numberInvoice;
    }

    public LocalDate getDateOfInvoice() {
        return dateOfInvoice;
    }

    public void setDateOfInvoice(LocalDate dateOfInvoice) {
        this.dateOfInvoice = dateOfInvoice;
    }

    public LocalDate getDateOfBillExpires() {
        return dateOfBillExpires;
    }

    public void setDateOfBillExpires(LocalDate dateOfBillExpires) {
        this.dateOfBillExpires = dateOfBillExpires;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public double getSumWithTax() {
        return sumWithTax;
    }

    public void setSumWithTax(double sumWithTax) {
        this.sumWithTax = sumWithTax;
    }

    public double getSumWithOutTax() {
        return sumWithOutTax;
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
