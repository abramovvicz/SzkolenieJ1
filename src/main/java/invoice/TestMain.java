package invoice;

import invoice.dao.*;
import invoice.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TestMain extends Application {

    public static void main(String[] args) {
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmloader = new FXMLLoader(this.getClass().getResource("/fxml/MainWindow.fxml"));
        Pane pane = fxmloader.load();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ranodm Titile");
        primaryStage.show();

        IClient iClient = new ClientMem();
//        iClient.getAllClients().forEach(System.out::println);

        IInvoice iInvoice = new InvoiceMem();


        IProduct iProduct = new ProductMem();
//      iProduct.getAllProducts().forEach(System.out::println);
        Adress adress1 = new Adress(2, "Warszawa", "Ulica Nazwa2", "90-123");
        Client client1 = new Client(8, ClientType.BUSINNESS, "Ske",
                "SKEPSKJSL", adress1);

//      System.out.println("wyciagnieto klienta z bazy " + iClient.getClientById(1));
//      System.out.println("Klienta dodano " + iClient.addClient(client1));
//      System.out.println("Klient edytowano " + iClient.editClient(2, client1));
        Product product1 = new Product(1, 234, ProductCategory.LAPTOP, "MacBookPro", 24, Tax.PROCENT23);
//      System.out.println("dodano produkt " + iProduct.addProduct(product1));
//      iProduct.getAllProducts().forEach(System.out::println);
        Invoice invoice2 = new Invoice(product1, client1);
        System.out.println(invoice2);
    }
}
