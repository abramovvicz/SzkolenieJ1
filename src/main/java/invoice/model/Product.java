package invoice.model;

public class Product {
    private int id;
    private double priceWithOutTax;
    private ProductCategory productCategory;
    private String name;
    private int quantity;


    public Product(int id, double priceWithOutTax, ProductCategory productCategory, String name, int quantity) {
        this.id = id;
        this.priceWithOutTax = priceWithOutTax;
        this.productCategory = productCategory;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPriceWithOutTax() {
        return priceWithOutTax;
    }

    public void setPriceWithOutTax(double priceWithOutTax) {
        this.priceWithOutTax = priceWithOutTax;
    }


    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", priceWithOutTax=" + priceWithOutTax +
                ", productCategory=" + productCategory +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}


