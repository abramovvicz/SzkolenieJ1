package invoice;

import invoice.dao.ClientMem;
import invoice.dao.IClient;
import invoice.dao.IProduct;
import invoice.dao.ProductMem;
import invoice.model.Client;
import invoice.model.Invoice;
import invoice.model.Product;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.util.List;

public class MainController {

    @FXML
    public CheckBox checkBoxId;

    @FXML
    public ComboBox<Client> clientList = new ComboBox<Client>();

    @FXML
    public ComboBox<Product> productList = new ComboBox<Product>();

    @FXML
    public TextArea invoiceArea;


    public void doIt(ActionEvent actionEvent) {
        System.out.println("click");
        checkBoxId.setText("some text");
        clientList.setItems(FXCollections.observableArrayList(getClient()));
        productList.setItems(FXCollections.observableArrayList(getProducts()));
        invoiceArea.setWrapText(true);
    }

    public void printInvoice(ActionEvent actionEvent) {
        invoiceArea.setText(getInvoice());

    }

    public List<Client> getClient() {
        IClient iClient = new ClientMem();

        return iClient.getAllClients();
    }

    public List<Product> getProducts() {
        IProduct iProduct = new ProductMem();
        return iProduct.getAllProducts();
    }

    public String getInvoice() {
        Client client = clientList.valueProperty().getValue();
        Product product = productList.valueProperty().getValue();
        Invoice invoice = new Invoice(product, client);
        return invoice.toString();
    }
}
