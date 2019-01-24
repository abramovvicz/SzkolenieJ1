package invoice.dao;

import invoice.model.Product;
import invoice.model.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class ProductMem implements IProduct {
    List<Product> productList = new ArrayList<>();

    public ProductMem() {
        createListOfProducts();
    }


    private void createListOfProducts() {
        Product product1 = new Product(1, 400, ProductCategory.PHONE, "Xiaomi", 20);
        Product product2 = new Product(2, 300, ProductCategory.LAPTOP, "MacBook", 10);
        Product product3 = new Product(3, 1000, ProductCategory.CONSOLE, "NvidiaShield", 20);
        Product product4 = new Product(4, 3000, ProductCategory.PC, "LenovoStation", 10);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
    }

    @Override
    public boolean addProduct(Product product) {
        return productList.add(product);
    }

    @Override
    public boolean removeProduct(Product product) {
        return productList.remove(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productList;
    }

    @Override
    public double countPriceWithTax() {

        return 0;
    }
}
