package invoice.dao;

import invoice.model.Product;

import java.util.List;

public interface IProduct {

    boolean addProduct(Product product);

    boolean removeProduct(Product product);

    List<Product> getAllProducts();

    double countPriceWithTax();


}
